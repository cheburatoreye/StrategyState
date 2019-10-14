package com.company;

 class BankAccount {

    private  Card card ;
    private AccountState state;

     public BankAccount(Card card) {
         this.card = card;
     }
     void next(){
         state.next(this);
     }
     void previous(){
         state.previous(this);
     }
     void printAccouuntState(){ state.printAccouuntState(); }
     void setState(AccountState state) { this.state = state; }
     boolean Spend(double price){
        if (true){
            boolean res;
            res=state.Spend(card,price);
            return res;
        }
        return false;
     }
     boolean Salary(double price){
         boolean res;
         res=state.Salary(card,price);
         return res;
     }
 }
