package com.jiwira.designpattern;

import java.util.Date;

public class Employee {

    private String employeeID;
    private String name;
    private String address;
    private Date dateOfJoining;

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

//    //!TODO SUPPOSED NOT TO BE IN THIS CLASS, BECAUSE PROMOTION AND INCOME TAX ISN'T EMPLOYEE RESPONSIBILITY
//    public boolean isPromotionDueThisYear(){
//        // Promotion Logic
//
//    }
//
//    public double calcIncomeTaxForCurrentYear(){
//        // income tax logic
//    }


}
