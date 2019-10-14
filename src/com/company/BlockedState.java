package com.company;

public class BlockedState implements AccountState {

    @Override
    public boolean Spend(Card card,double price) {
        return false;
    }
    @Override
    public void next(BankAccount bankAccount) {
        System.out.println("Blocked already");
    }
    @Override
    public void previous(BankAccount bankAccount) {
        bankAccount.setState(new CreditState());
    }
    @Override
    public void printAccouuntState() {
        System.out.println("Blocked state");
    }
    @Override
    public boolean Salary(Card card, double fill) {
        System.out.println("Salary"+fill);
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

