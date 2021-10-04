package com.company;
import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value in rupees ");
        float rupee = input.nextFloat();
        float dollar = rupee  * 0.013f;  //values may change

        System.out.println("₹"+rupee + " converted in dollar is $"+ dollar);


    }
}
