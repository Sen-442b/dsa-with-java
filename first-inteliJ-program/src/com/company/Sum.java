package com.company;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
         Integer numInput =  input.nextInt();
        System.out.println("Enter second number");
        int numInputTwo =  input.nextInt();
        System.out.println("Sum =" +  (numInput + numInputTwo));

    }

}
