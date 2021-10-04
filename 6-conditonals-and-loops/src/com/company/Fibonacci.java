package com.company;
//0,1,1,2,3,5,8,13,21,34
public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b =1;
        int c =0;

        for(int i =0;i<10;i++){

            c = b+a;
            System.out.println(c);

            a=b;
            b=c;



           // System.out.println((i-1)+i);
        }

    }
}



/*
    int prevIndex = 0
    int currentIndex=1
    int count =2
    int n = input.nextFloat()
    while(count<=n){
        int temp = i
        i = i+p
        p=temp
        count++
    }


 */
