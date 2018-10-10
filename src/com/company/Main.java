package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name?");
        String name = input.nextLine();
        System.out.println("Hello "+name+", nice to meet you! How old are you?");
        int age = input.nextInt();
        System.out.println(" "+age+" years old? You're a geezer compared to me!");
    }
}
