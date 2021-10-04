package com.company;
import  java.util.Scanner;
public class PTR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Principal");
        float principalAmount =  input.nextFloat();
        System.out.println("Enter Time (in years)");
        float time =  input.nextFloat();
        System.out.println("Enter annual interest rate");
        float rate =  input.nextFloat();
        float simpleInterest = principalAmount*rate*time;
        System.out.println(simpleInterest + " is the simple interest");

    }

}
