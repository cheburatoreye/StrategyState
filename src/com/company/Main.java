package com.company;

public class Main {
boolean step;
    public static void main(String[] args) {
        boolean res;
    	BankAccount account=new BankAccount(new Card(64984984,2500));
    	account.setState(new DebitState());
        account.printAccouuntState();
//----------------------------------------------------------------------------------------------------------------------
        System.out.println("снятие средств");
        res=account.Spend(1800.0);
        if (res){
            account.next();
        }
        account.printAccouuntState();
//----------------------------------------------------------------------------------------------------------------------
        System.out.println("снятие средств");
        res=account.Spend(2000.0);
        if (res){
            account.next();
        }
        account.printAccouuntState();
//----------------------------------------------------------------------------------------------------------------------
        System.out.println("снятие средств");
        res=account.Spend(500.0);
        if (res){
            account.next();
        }
        account.printAccouuntState();
//----------------------------------------------------------------------------------------------------------------------
        System.out.println("снятие средств");
        res=account.Spend(3300.0);
        if (res){
            account.next();
        }
        account.printAccouuntState();
//----------------------------------------------------------------------------------------------------------------------
        System.out.println("пополнение счета");
        res=account.Salary(8000.0);
        if (res){
            account.previous();
        }
        account.printAccouuntState();
//----------------------------------------------------------------------------------------------------------------------
        System.out.println("пополнение счета");
        res=account.Salary(8000.0);
        if (res){
            account.previous();
        }
        account.printAccouuntState();
//----------------------------------------------------------------------------------------------------------------------
    }
}
