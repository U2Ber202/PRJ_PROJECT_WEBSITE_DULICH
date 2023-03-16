/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author tedok
 */
public class Tour {
    private int tourid;
    private String tourname;
    private Date tourdate;
    private float tourprice;
    private String tourdescip;
    private int tourrate;
    private String from;
    private String to;

    public Tour() {
    }

    public Tour(int tourid, String tourname, Date tourdate, float tourprice, String tourdescip, int tourrate, String from, String to) {
        this.tourid = tourid;
        this.tourname = tourname;
        this.tourdate = tourdate;
        this.tourprice = tourprice;
        this.tourdescip = tourdescip;
        this.tourrate = tourrate;
        this.from = from;
        this.to = to;
    }

    public int getTourid() {
        return tourid;
    }

    public void setTourid(int tourid) {
        this.tourid = tourid;
    }

    public String getTourname() {
        return tourname;
    }

    public void setTourname(String tourname) {
        this.tourname = tourname;
    }

    public Date getTourdate() {
        return tourdate;
    }

    public void setTourdate(Date tourdate) {
        this.tourdate = tourdate;
    }

    public float getTourprice() {
        return tourprice;
    }

    public void setTourprice(float tourprice) {
        this.tourprice = tourprice;
    }

    public String getTourdescip() {
        return tourdescip;
    }

    public void setTourdescip(String tourdescip) {
        this.tourdescip = tourdescip;
    }

    public int getTourrate() {
        return tourrate;
    }

    public void setTourrate(int tourrate) {
        this.tourrate = tourrate;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
    
}
