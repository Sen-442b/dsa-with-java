package com.company;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int num = input.nextInt();
         if(num>=0){
             if(num%2==0){
                 System.out.println(num + " is even");
             }else{
                 System.out.println(num + " is odd");
             }
         }else{
             System.out.println("Enter a valid positive integer");
         }
    }
}
