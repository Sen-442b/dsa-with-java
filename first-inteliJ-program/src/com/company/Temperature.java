package com.company;
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter temperature in Celsius ");
        float celsiusTemp =  input.nextFloat();
        float fahrenheitTemp = (celsiusTemp *9/5) +32;
        System.out.println("Temperature in fahrenheit is: " + fahrenheitTemp);
    }
}
