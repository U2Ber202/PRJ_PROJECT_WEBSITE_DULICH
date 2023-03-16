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
public class Employee {
    private int empid;
    private String empfirstname;
    private String emplastname;
    private Date empdob;
    private String empmail;
    private String empphone;
    private Account account;

    public Employee() {
    }

    public Employee(int empid, String empfirstname, String emplastname, Date empdob, String empmail, String empphone, Account account) {
        this.empid = empid;
        this.empfirstname = empfirstname;
        this.emplastname = emplastname;
        this.empdob = empdob;
        this.empmail = empmail;
        this.empphone = empphone;
        this.account = account;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpfirstname() {
        return empfirstname;
    }

    public void setEmpfirstname(String empfirstname) {
        this.empfirstname = empfirstname;
    }

    public String getEmplastname() {
        return emplastname;
    }

    public void setEmplastname(String emplastname) {
        this.emplastname = emplastname;
    }

    public Date getEmpdob() {
        return empdob;
    }

    public void setEmpdob(Date empdob) {
        this.empdob = empdob;
    }

    public String getEmpmail() {
        return empmail;
    }

    public void setEmpmail(String empmail) {
        this.empmail = empmail;
    }

    public String getEmpphone() {
        return empphone;
    }

    public void setEmpphone(String empphone) {
        this.empphone = empphone;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    
}
