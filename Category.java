package com.company;

/**
 * Created by friede17 on 25.12.2016.
 */
public abstract class Category {
    private double amount;
    private String title;
    private String date;

    public Category(double amount, String title, String date) {
        this.amount=amount;
        this.title=title;
        this.date=date;
    }
    public double getAmount(){
        return amount;
    }
    public void setAmount(double amount){
        this.amount=amount;

    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    abstract public void updateMoney();
    }


