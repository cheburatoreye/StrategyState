package com.company;

public class DebitState implements AccountState {

    @Override
    public boolean Spend(Card card,double price) {
    double t;
    t=card.getBill()-price;
    card.setBill(t);
    if (t<=0){
        System.out.println("на счету"+card.getBill());
    return true;
    }
    return false;
    }

    @Override
    public void next(BankAccount bankAccount) {
    bankAccount.setState(new CreditState());
    }
    @Override
    public void previous(BankAccount bankAccount) { }
    @Override
    public void printAccouuntState() {
    System.out.println("Debit state"); }
    @Override
    public boolean Salary(Card card, double fill) {
        double t;
        boolean res=false;
        t=card.getBill();
        card.setBill(t+fill);
        t=card.getBill();
        if (t>=0){
            res=true;
        }
        return res;
    }
}
