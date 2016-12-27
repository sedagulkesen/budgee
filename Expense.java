package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by friede17 on 26.12.2016.
 */
public class Expense extends Category{
    private List<String> expenseList = new ArrayList<>(Arrays.asList("groceries", "eat-out","transport","communication","gift","cosmetic","education"));

    public Expense (double amount, String title, String date) {
        super(amount,title,date);    }

    public void updateMoney() {
user.setIncome()=user.getIncome()-getAmount();
    }
}
