package com.company;

import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        //Automatic Type Conversion
        Scanner input = new Scanner(System.in);
         float convertIntToFloat= input.nextInt();
        System.out.println(convertIntToFloat);
        //Explicit Type Conversion
        int manuallyConvertItToInt = (int)(input.nextFloat());
        System.out.println((manuallyConvertItToInt)); //will remove the floating point values explicitly
        //automatic type promotion in expressions
        byte giveTheRemainder = (byte) (257); //1 byte = 257b
        System.out.println(giveTheRemainder); // 257 % 256  = 1

        // converting promoting  data types  into larger ones
        byte numOne = 100;
        byte numTwo = 100;
        byte numThree = 4;
        int result =  (numOne * numTwo)/numThree;
        System.out.println(result);

        // the biggest datatype out of the expressions represents the output




    }
}
