package com.company;

import java.util.Scanner;

//Leap year calculation program
public class LeapYear {
  //  Input a year and find whether it is a leap year or not.
    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        System.out.println("Enter  the year");
        int yearInput = input.nextInt();
         String yearString =  String.valueOf(yearInput);
       if(yearString.length()==4) {
           if (yearInput % 4 == 0 && yearInput % 100 != 0 || yearInput % 400 == 0) {
               System.out.println(yearInput + " is a leap year");
           } else {
               System.out.println(yearInput + " is not a leap year");
           }
       }else {
           System.out.println("Print a valid year");
       }
       }

    }

