package com.company;

import java.util.Scanner;

public class Inputs {
    public static void main (String[] args){
      Scanner input = new Scanner(System.in); //System is your keyboard
        System.out.println("Enter your roll number: ");
        int rollno = input.nextInt();
        System.out.println("Your roll no is" + "" + rollno);


        //literals and identifiers

        //String input
        String name = input.nextLine();
        System.out.println(name);
        //bool result
        Boolean checkInput = input.hasNextInt();
        System.out.println(checkInput);



    }
}
