package com.company;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a positive integer,please");
        int num = input.nextInt();
        int product=1;
        for (int i=1;i<=num;i++){
            product*=i;
        }
        System.out.println(product);

    }
}
