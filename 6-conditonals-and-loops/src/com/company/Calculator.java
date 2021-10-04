package com.company;
import java.util.Scanner;
public class Calculator {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("Enter an operator (+,-,*,/),press X to exit");
            char operator =  input.next().trim().charAt(0);
            if (operator == 'x' || operator == 'X') {
                break;
            }
            System.out.println("Enter number one ");
            float numOne = input.nextFloat();
            System.out.println("Enter number two");
            float numTwo= input.nextFloat();
            float result = 0;
            if(operator=='+'){
                result = numOne + numTwo;

            }else if(operator=='-'){
                result = numOne-numTwo;
            }else if(operator=='*'){
                result= numOne * numTwo;
            }else if(operator=='/'){
                if(numTwo!=0){
                result=numOne/numTwo;
                }else{
                    System.out.println("invalid operation");
                }

            }else{
                System.out.println("invalid operator");
            }
            System.out.println(result + " is the result");

        }

    }
}

