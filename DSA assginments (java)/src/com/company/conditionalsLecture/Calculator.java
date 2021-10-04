package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter Num One");
        float numOne = input.nextFloat();
        System.out.println("Enter operators (+,*,-,/)");
        char operator = input.next().charAt(0);

        System.out.println("Enter Num two");
        float numTwo = input.nextFloat();
        float result = 0;

    if (operator == '+') {
        result = numOne + numTwo;
        System.out.println(operator);

    } else if (operator == '-') {
        result = numOne - numTwo;
    } else if (operator == '/') {
        result = numOne / numTwo;
    } else if (operator == '*') {
        result = numOne * numTwo;
    }else{
        System.out.println("invalid operator");
    }
        System.out.println(result +  " is the result");

//    System.out.println(result + " is the answer");


    }
}
