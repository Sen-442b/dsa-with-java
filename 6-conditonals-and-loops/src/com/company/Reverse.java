package com.company;

public class Reverse {
    public static void main(String[] args) {
        int num= 12323;
        int revNum = 0;
        while(num>0){

            int lastDigit = num%10;

            System.out.println(revNum);

                revNum *= 10;
            revNum+=lastDigit;
            num /= 10;

        }
        System.out.println(revNum);

    }

}
