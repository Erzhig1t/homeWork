package com.company;

import java.util.Scanner;

public class User {
    Scanner scanner = new Scanner(System.in);
    private String name;
    private int dateOfBirth;
    private long phoneNumber;

    void setName(){
     name = "Azamat";
    }
    void setDateOfBirth(){
        dateOfBirth = 2022- scanner.nextInt();
        System.out.println(dateOfBirth);

    }
    void setPhoneNumber(){
      phoneNumber = 777112233;
    }
    String getName(String name){
        return name;
    }
    int getDateOfBirth(){
        return dateOfBirth;
    }
    long getPhoneNumber(){
        return phoneNumber;
    }
}
