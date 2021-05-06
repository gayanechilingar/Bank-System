package com.mycompany.javatest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NewMain {

//    public static void main(String[] args) {
//        int a = 5;
//        char b = 'a';
//        long c = 400;
//        double d = 3.2;
//        String name = "Sofene";
//        System.out.println(name.toUpperCase());
//    }
//    
//    
//    public static String Mess(String s) {
//        int a = 5;
//        char b = 'a';
//        long c = 400;
//        double d = 3.2;
//        String name = "Sofene";
//        System.out.println(name.toUpperCase());
//    }
//    public static void main(String[] args)
//    {
//        int i = 0;
//        int sum = 0;
// 
//        do{   
//            System.out.println(i);
//            sum = sum +i;
//            i++;
//        }
//        while (i < 10);
//        
//        System.out.println(sum);
//        
//    }
//    
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 6; i++) {
            if (i % 2 == 0) {
                System.out.println("In if block :: " + i);
//                System.out.println("print loop " + loop);

            } else {
                System.out.println("In else block :: " + i);
            }
        }
        String sDate1 = "31/12/1998";
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
        Employee employee = new Employee(123);        
        int age = employee.getAge(date1);
        System.out.println(age);

    }

}
