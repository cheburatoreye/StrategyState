package com.company;

public class CreditState implements AccountState {

    @Override
    public boolean Spend(Card card,double price) {
    double t;
    t=card.getBill()-price;
    if (t<-5000.0){
        card.setBill(t);
        System.out.println("На счету "+card.getBill());
         System.out.println("Превышен лимит кредита");
        return true;
    }
        card.setBill(t);
        System.out.println("Выдан кредит"+card.getBill());
        return false;
    }

    @Override
    public void next(BankAccount bankAccount) {
        bankAccount.setState(new BlockedState());
    }
    @Override
    public void previous(BankAccount bankAccount) {
        bankAccount.setState(new DebitState());
    }
    @Override
    public void printAccouuntState() {
        System.out.println("Credit state");
    }
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