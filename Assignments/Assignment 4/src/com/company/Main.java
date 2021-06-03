package com.company;

public class Main {

    public static void main(String[] args) {
       int[] numbers = {0,2,4,20,7,22,9,65,100,17,84};
       int sum= 0;

    int sum_array = summation(numbers,sum);{
        System.out.println("The sum of the list is: " + sum_array);
        }
    }

   static int summation(int[] numbers, int sum){
        for (int elem : numbers) {
            sum += elem;
        }
       return sum;
    }

}
