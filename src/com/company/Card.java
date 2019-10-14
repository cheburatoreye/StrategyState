package com.company;

public class Card {
    private    long cardnumber;
    private   double bill;
    Card(long cardnumber, double bill) {
        this.cardnumber = cardnumber;
        this.bill = bill;
    }
    public long getCardnumber() {
        return cardnumber;
    }
    public double getBill() {
        return bill;
    }
    public void setBill(double bill) {
        this.bill = bill;
    }
}

