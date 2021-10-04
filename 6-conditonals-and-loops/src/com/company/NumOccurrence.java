package com.company;
// n = 12373847338, how many times 3 occurred
import java.math.BigInteger;
import java.util.Scanner;
public class NumOccurrence {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter a number");

        String inputStr = input.next();
        System.out.println("Enter the most occurring digit");
        char num = input.next().trim().charAt(0);
        System.out.println(inputStr);
        for(int i =0;i<inputStr.length();i++){
            if(inputStr.charAt(i)==num){
                count ++ ;
            }
        }
        System.out.println(count);








    }
}


 /*
        int numberInput = 383938938;
        int numCheck = 8;
        int countOccurrence =0;

        while (numberInput>0){
           int currentNum= numberInput%10;
            if(currentNum==numCheck){
                countOccurrence++;
            }
            numberInput = numberInput/10;
            System.out.println(numberInput);

        }
        System.out.println(countOccurrence);
        */
