//Take 2 numbers as input and print the largest number.

package com.jaideep;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if(num1>num2)
            System.out.println(num1 + " is greater than " + num2);
        else if(num2 > num1)
            System.out.println(num1 + " is less than " + num2);
        else
            System.out.println(num1 + " is equal to " + num2);
    }
}
