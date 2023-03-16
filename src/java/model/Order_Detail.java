/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author tedok
 */
public class Order_Detail {
    private int odno;
    private Order order;
    private Tour tour;
    private int quanity;
    private float total;

    public Order_Detail() {
    }

    public Order_Detail(int odno, Order order, Tour tour, int quanity, float total) {
        this.odno = odno;
        this.order = order;
        this.tour = tour;
        this.quanity = quanity;
        this.total = total;
    }

    public int getOdno() {
        return odno;
    }

    public void setOdno(int odno) {
        this.odno = odno;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public int getQuanity() {
        return quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
}
