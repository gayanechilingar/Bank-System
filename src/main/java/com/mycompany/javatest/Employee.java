package com.mycompany.javatest;

import com.sun.jndi.cosnaming.IiopUrl.Address;
import java.util.Calendar;
import java.util.Date;

public class Employee {

    private long id;
//    private String title;
    private String firstName;
    private String middleName;
    private String lastName;
    private Date dateOfBirth;

    private Address mailingAddress;
    private Address permanentAddress;

    public Employee(long id, String firstName, String middleName, String lastName, Date dateOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public Employee(int i) {
         this.id = id;
    }

    public String getFullName() {
        String fullName = String.join(" ", this.firstName, this.middleName, this.lastName);
        return fullName;
    }

    public int getAge(Date dateOfBirth) {

        //Calculate age from dateOfBirth and return
        Calendar today = Calendar.getInstance();
        Calendar birthDate = Calendar.getInstance();

        int age = 0;

        birthDate.setTime(dateOfBirth);
        if (birthDate.after(today)) {
            throw new IllegalArgumentException("Can't be born in the future");
        }

        age = (int)today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
        return age;

    }
    
    public boolean equals(Object o) {
  
        // If the object is compared with itself then return true  
        if (o == this) {
            return true;
        }
  
        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Employee)) {
            return false;
        }
          
        // typecast o to Complex so that we can compare data members 
        Employee c = (Employee) o;
          
        // Compare the data members and return accordingly 
        return c.equals(o);
    }

}
