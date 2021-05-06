
package com.bankapp;


public class Account {
    
    private int id;
    private int personId;
    private int balance;
    
    public Account(int id, int personId, int balance) {
        
        this.id = id;
        this.personId = personId;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    
}
