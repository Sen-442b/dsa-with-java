package com.company;
import java.util.Scanner;

public class ShapesCalculator {

    public static void main(String[] args) {
	// write your code here

        Scanner input = new Scanner(System.in);
        //Area Of Circle Java Program
        String userAnswer= input.next().trim();
        //Area Of Circle Java Program
        System.out.println(userAnswer);
        if(userAnswer.equals("circle")){
            System.out.println("Enter radius");
            float radius = input.nextFloat();
            System.out.println("area of circle is "+(radius*radius*3.14159));

        }
        else if(userAnswer.equals("triangle")){
            System.out.println("Enter base");
            float base = input.nextFloat();
            System.out.println("Enter height");
            float height = input.nextFloat();
            System.out.println("area of triangle is"+ (0.5*base*height));


        }
        else if (userAnswer.equals("rectangle")){
            System.out.println("Enter width");
            float width= input.nextFloat();
            System.out.println("Enter length");
            float length = input.nextFloat();
            System.out.println("the area of rectangle is " + length*width);
        }
        }

    }

