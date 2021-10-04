package com.company;

import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the largest number from all.
public class MaxOfContinuesUserInput {

    public static void main(String[] args) {
        System.out.println("Enter positive integers");
        Scanner input = new Scanner(System.in);
        int max=0;
        while(true){
            int userIntInput = input.nextInt();
            if(userIntInput==0){
                break;
            }
            else{
                if(userIntInput>max){
                    max=userIntInput;
                }

            }
        }
        System.out.println("The max of all is "+ max);

    }
}
