package com.company;

public interface AccountState {
    boolean Spend(Card card,double price);
   void printAccouuntState();
    boolean Salary(Card card,double price);
    void next(BankAccount bankAccount);
    void previous(BankAccount bankAccount);
    //AccountState getstate();
}
