package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by friede17 on 26.12.2016.
 */
public class Income extends Category{
    private List<String> incomeList = new ArrayList<>(Arrays.asList("salary", "investment","part-time jobs","award","loan","other"));
    public Income(double amount, String title, String date) {
        super(amount,title,date);
    }


    public void updateMoney() {
        user.setIncome()=user.getIncome()+getAmount();
    }
}
