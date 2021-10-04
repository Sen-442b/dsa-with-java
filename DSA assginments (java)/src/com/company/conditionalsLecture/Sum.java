package com.company;


import java.util.Scanner;

//Take two numbers and print the sum of both.
public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number one");
        float numOne = input.nextFloat();
        System.out.println("Enter number two");
        float numTwo = input.nextFloat();
        float result = numOne + numTwo;
        System.out.println("Total is " +  result);




    }
}
