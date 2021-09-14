//Input currency in rupees and output in USD.

package com.jaideep;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rupee = input.nextInt();

        System.out.println("Your Rs." + rupee + " is $" + (rupee/73.50) + ".");
    }
}
