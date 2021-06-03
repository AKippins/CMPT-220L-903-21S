package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String args[]) {

        //input to print Fibonacci series up to how many numbers
        System.out.println("Enter number up to which Fibonacci series to print: ");
        int number = new Scanner(System.in).nextInt();

        System.out.println("Fibonacci series up to " + number +" numbers : ");
        //printing Fibonacci series up to number
        for(int i=1; i<=number; i++){
            System.out.print(fibonacci2(i) +" ");
        }


    }

    public static int fibonacci(int number){
        if(number == 1 || number == 2){
            return 1;
        }

        return fibonacci(number-1) + fibonacci(number -2); //tail recursion
    }

    /*
     * Java program to calculate Fibonacci number using loop or Iteration.
     * @return Fibonacci number
     */
    public static int fibonacci2(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        int fibo1=1, fibo2=1, fibonacci=1;
        for(int i= 3; i<= number; i++){

            //Fibonacci number is sum of previous two Fibonacci number
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;

        }
        return fibonacci; //Fibonacci number

    }

}
