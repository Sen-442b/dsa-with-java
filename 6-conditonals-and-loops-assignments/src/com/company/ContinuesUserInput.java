package com.company;

import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class ContinuesUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sumOfInputs=0;
        while(true){
                int userIntInput = input.nextInt();
                if(userIntInput==0){
                break;
                }else{
                        sumOfInputs+=userIntInput;
                }



        }
        System.out.println("Sum of inputs is " + sumOfInputs);


    }

}

