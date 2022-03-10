package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Регистрация учун томондогуну толтурунуз.");
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        user.setName();
        user.setDateOfBirth();
        user.setPhoneNumber();
        System.out.println("Аты:" + user.getName("Azamat"));
        System.out.println("Жашы: " + user.getDateOfBirth());
        System.out.println("Тел номери: " + user.getPhoneNumber());
        System.out.println("Сиз регистрацияны ийгиликтуу оттунуз.");

    }
}
