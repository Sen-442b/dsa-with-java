package com.company;
import java.util.Scanner;
public class LargerInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number one ");
        int numOne = input.nextInt();
        System.out.println("Enter number two ");
        int numTwo = input.nextInt();
        if(numOne>numTwo){
            System.out.println(numOne + " is greater than " + numTwo);
        }else if(numOne==numTwo){
            System.out.println(numOne + " is equal two " + numTwo);
        }else{
            System.out.println( numTwo + " is greater than " + numOne);
        }
    }
}
