/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Tour;

/**
 *
 * @author tedok
 */
public class EditDAO extends DBContext<Tour> {

    public void insert(String name, int day, int night, float price, String desciption, String from, String to) {
        String sql = "INSERT INTO [dbo].[Tour]\n"
                + "           ([tourName]\n"
                + "           ,[tourDay]\n"
                + "           ,[tourNight]\n"
                + "           ,[tourPrice]\n"
                + "           ,[tourDesciption]\n"
                + "           ,[tourFrom]\n"
                + "           ,[tourTo])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?)";
        PreparedStatement stm = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setString(1, name);
            stm.setInt(2, day);
            stm.setInt(3, night);
            stm.setFloat(4, price);
            stm.setString(5, desciption);
            stm.setString(6, from);
            stm.setString(7, to);
            stm.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public ArrayList<Tour> findAllTour() {
        ArrayList<Tour> tour = new ArrayList<>();
        String sql = "Select * from Tour";
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            stm = connection.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                tour.add(new Tour(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getFloat(5), rs.getString(6), rs.getInt(7), rs.getString(8), rs.getString(9)));
            }
        } catch (SQLException e) {
            System.err.println("Cannot find any account!!!");
        }
        return tour;
    }

    public Tour getTourById(int id) {
        Tour tour = new Tour();
        String sql = "Select * from Tour where tourtId = ?";
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            rs = stm.executeQuery();
            if (rs.next()) {
                tour.setTourid(id);
                tour.setTourname(rs.getString(2));
                tour.setTourday(rs.getInt(3));
                tour.setTournight(rs.getInt(4));
                tour.setTourprice(rs.getFloat(5));
                tour.setTourdescip(rs.getString(6));
                tour.setTourrate(rs.getInt(7));
                tour.setFrom(rs.getString(8));
                tour.setTo(rs.getString(9));
                return tour;
            }
        } catch (SQLException ex) {
            Logger.getLogger(EditDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (rs != null)
                try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(EditDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (stm != null)
                try {
                stm.close();
            } catch (SQLException ex) {
                Logger.getLogger(EditDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (connection != null)
                try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(EditDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    public void delete(int id) {
        String sql = "DELETE FROM [dbo].[Tour]\n"
                + "      WHERE tourtId = ?";
        PreparedStatement stm = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            stm.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public void update(int id, String name, int day, int night, float price, String desciption, String from, String to) {
        String sql = "UPDATE [dbo].[Tour]\n"
                + "   SET [tourName] = ?\n"
                + "      ,[tourDay] = ?\n"
                + "      ,[tourNight] = ?\n"
                + "      ,[tourPrice] = ?\n"
                + "      ,[tourDesciption] = ?\n"
                + "      ,[tourFrom] = ?\n"
                + "      ,[tourTo] = ?\n"
                + " WHERE tourId = ?";
        PreparedStatement stm = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setString(1, name);
            stm.setInt(2, day);
            stm.setInt(3, night);
            stm.setFloat(4, price);
            stm.setString(5, desciption);
            stm.setString(6, from);
            stm.setString(7, to);
            stm.setInt(8, id);
            stm.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public boolean isTourDuplicate(String name, int day, int night, float price, String desciption, String from, String to) {
        ArrayList<Tour> tour = findAllTour();
        for (Tour t : tour) {
            if (name.equals(t.getTourname())
                    && day == t.getTourday()
                    && night == t.getTournight()
                    && price == t.getTourprice()
                    && desciption.equals(t.getTourdescip())
                    && from.equals(t.getFrom())
                    && to.equals(t.getTo())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void update(Tour model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Tour model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Tour get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Tour> list() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insert(Tour model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
