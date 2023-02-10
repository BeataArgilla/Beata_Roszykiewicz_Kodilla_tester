package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Date;

public class Order {
    private double orderValue;
    private String login;
    private Date date;



public Order(double orderValue, String login, Date date){
    this.orderValue = orderValue;
    this.login = login;
    this.date = date;


}

public String getLogin(){
    return login;
}

    public double getOrderValue() {
        return orderValue;
    }

    public Date getDate() {
        return date;
    }
}
