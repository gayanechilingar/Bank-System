package com.bankapp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Gayane
 */
public class Application {

    public static void main(String[] args) {

        Bank bank1 = new Bank("American Bank", "5120 S. Padre Island Dr.\n" + "Corpus Christi, TX 78411");
        int id1 = (int) System.currentTimeMillis();
        int id2 = (int) System.currentTimeMillis();
        int[] idArray = new int[2];
        idArray[0] = id1;
        idArray[1] = id2;

        Person person1 = new Person(id1, "Sophene", 41, "F");
        Person person2 = new Person(id2, "Arthur", 25, "M");
        ArrayList<Person>  personObj = new ArrayList<Person>();

        personObj.add(person1);
        personObj.add(person2);

        Account account1 = new Account(0, id1, 1200);
        Account account2 = new Account(0, id2, 0);
        
        ArrayList<Account>  accountObj = new ArrayList<Account>();
        accountObj.add(account1);
        accountObj.add(account2);

        System.out.println("What is your name?");
        Scanner name = new Scanner(System.in);

        String nameInp = name.nextLine();

        for (Person obj : personObj) {
            
            if (obj.getName().equals(nameInp))
            {
                System.out.println("If you want see your balance write 1, If you want get money from account write 2");
                Scanner readbalance = new Scanner(System.in);
                int input1 = readbalance.nextInt();
                if(input1 == 1){
                    int personid = obj.getId();
                    for (Account objacc : accountObj){
                        if(personid == objacc.getPersonId()){
                            System.out.println("Your balance is " + objacc.getBalance());
                        } 
                        else {
                            System.out.println("Your don't have a balance ");
                        }
                    
                    }
                }
                else if(input1 == 2){
                    int personid = obj.getId();
                    for (Account objacc : accountObj){
                        if(personid == objacc.getPersonId()){
                            System.out.println("how much money do you want ");
                            Scanner inputmoney = new Scanner(System.in);
                            int money = inputmoney.nextInt();
                            
                            if(money <= objacc.getBalance() && money > 0){
                                System.out.println("Please get your money ");
                            }
                            else{
                                System.out.println("You don't have money");
                            }
                        } 
                        
                    
                    }
                }
                else{
                    System.out.println("Exit!");
                }
                
                
            }
            
            else{
                
                System.out.println("You don't have account");
            }

        }

    }
}
