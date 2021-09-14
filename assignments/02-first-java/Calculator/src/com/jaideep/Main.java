package com.jaideep;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    int num1 = input.nextInt();
	    String sign = input.next();
	    int num2 = input.nextInt();

	    switch (sign){
	        case "+" -> System.out.println(num1 + num2);
	        case "-" -> System.out.println(num1 - num2);
            case "*" -> System.out.println(num1 * num2);
            case "/" -> System.out.println(num1 / num2);
            case "%" -> System.out.println(num1 % num2);
            default -> System.out.println("Enter a valid input");
        }
    }
}
