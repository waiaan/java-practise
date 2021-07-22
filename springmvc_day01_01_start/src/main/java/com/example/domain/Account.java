package com.example.domain;

import java.io.Serializable;
import java.util.Date;

public class Account implements Serializable {
    private String id;
    private String amount;
    private Date date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Account [amount=" + amount + ", date=" + date + ", id=" + id + "]";
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
