package com.company;
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number one ");
        int numOne = input.nextInt();
        System.out.println("Enter number two ");
        int numTwo = input.nextInt();
        System.out.println("Enter number three ");
        int numThree = input.nextInt();
        int max = numOne;
        if(numTwo>max){
            max = numTwo;
        }
        if(numThree>max){
            max=numThree;
        }
        System.out.println(max);

    }



    }


            /* My Solution
        if(numOne>numTwo){
            if(numOne>numThree){
                System.out.println(numOne + " is greatest");
            }else{
                System.out.println(numThree + " is greatest");
            }


        }else{
            if (numTwo>numThree) {
                System.out.println(numTwo + " is greatest");
            }else{
                System.out.println(numThree + " is greatest");
            }
        }

        */