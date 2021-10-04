package com.company;
import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character");
        char charInput = input.next().trim().charAt(0); //trim is to remove extra spaces
        int charInputInt  =charInput;
        System.out.println(charInputInt);
        if(charInputInt<=96 &&charInput>=65) {
            System.out.println(charInput + " is uppercase");
        }else {
            System.out.println(charInput + " is lowercase");
        }
        }


    }



    /* by kunal
    if(charinput>='a' && <='z'){
        System.out.println("lowercase")
        }
        else{
        System.out.println("uppercase")
        }
     */