package com.CurrenceExchange.Enti;

public class Singl {
    String from;
    String to;

    double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
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

    public Singl() {
    }

    public Singl(String from, String to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }
}
