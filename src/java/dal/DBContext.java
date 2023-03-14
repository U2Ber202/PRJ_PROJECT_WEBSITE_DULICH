package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class DBContext<T>{
    protected Connection connection;
    public DBContext()
    {
        try {
            String user = "U2Ber";
            String pass = "Huyen17022002";
            String url = "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=PRJ_PROJECT_WEBSITE_TOURIST";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public abstract void insert(T model); //INSERT INTO
    public abstract void update(T model); // UPDATE SET
    public abstract void delete(T model); // DELETE FROM 
    public abstract T get(int id); // SELECT * FROM WHERE id = 
    public abstract ArrayList<T> list(); //override SELECT * FROM
}
