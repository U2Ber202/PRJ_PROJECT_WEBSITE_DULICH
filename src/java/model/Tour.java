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
    private int tourday;
    private int tournight;
    private float tourprice;
    private String tourdescip;
    private int tourrate;
    private String from;
    private String to;

    public Tour() {
    }

    public Tour(int tourid, String tourname, int tourday, int tournight, float tourprice, String tourdescip, int tourrate, String from, String to) {
        this.tourid = tourid;
        this.tourname = tourname;
        this.tourday = tourday;
        this.tournight = tournight;
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

    public int getTourday() {
        return tourday;
    }

    public void setTourday(int tourday) {
        this.tourday = tourday;
    }

    public int getTournight() {
        return tournight;
    }

    public void setTournight(int tournight) {
        this.tournight = tournight;
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
