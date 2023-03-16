/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author tedok
 */
public class Customer {
    private int customerid;
    private String customerfirstname;
    private String customerlastname;
    private String customerphone;
    private String customermail;
    private String customeraddress;
    private String customercity;
    private String customerstate;
    private String customercountry;
    private float customermoney;
    private Account account;

    public Customer() {
    }

    public Customer(int customerid, String customerfirstname, String customerlastname, String customerphone, String customermail, String customeraddress, String customercity, String customerstate, String customercountry, float customermoney, Account account) {
        this.customerid = customerid;
        this.customerfirstname = customerfirstname;
        this.customerlastname = customerlastname;
        this.customerphone = customerphone;
        this.customermail = customermail;
        this.customeraddress = customeraddress;
        this.customercity = customercity;
        this.customerstate = customerstate;
        this.customercountry = customercountry;
        this.customermoney = customermoney;
        this.account = account;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public String getCustomerfirstname() {
        return customerfirstname;
    }

    public void setCustomerfirstname(String customerfirstname) {
        this.customerfirstname = customerfirstname;
    }

    public String getCustomerlastname() {
        return customerlastname;
    }

    public void setCustomerlastname(String customerlastname) {
        this.customerlastname = customerlastname;
    }

    public String getCustomerphone() {
        return customerphone;
    }

    public void setCustomerphone(String customerphone) {
        this.customerphone = customerphone;
    }

    public String getCustomermail() {
        return customermail;
    }

    public void setCustomermail(String customermail) {
        this.customermail = customermail;
    }

    public String getCustomeraddress() {
        return customeraddress;
    }

    public void setCustomeraddress(String customeraddress) {
        this.customeraddress = customeraddress;
    }

    public String getCustomercity() {
        return customercity;
    }

    public void setCustomercity(String customercity) {
        this.customercity = customercity;
    }

    public String getCustomerstate() {
        return customerstate;
    }

    public void setCustomerstate(String customerstate) {
        this.customerstate = customerstate;
    }

    public String getCustomercountry() {
        return customercountry;
    }

    public void setCustomercountry(String customercountry) {
        this.customercountry = customercountry;
    }

    public float getCustomermoney() {
        return customermoney;
    }

    public void setCustomermoney(float customermoney) {
        this.customermoney = customermoney;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    
}
