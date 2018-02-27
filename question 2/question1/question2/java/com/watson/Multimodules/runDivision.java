package com.watson.Multimodules;

import java.util.Scanner;

public class runDivision {

    public static void main(String[] args) {
        Division divObject = new Division();
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first amount: ");
        int firstInteger = input.nextInt();
        divObject.setInteger1(firstInteger);
        System.out.print("Please enter the amount to divide by4: ");
        int secondInteger = input.nextInt();
        divObject.setInteger2(secondInteger);
        if (divObject.getInteger2() > 0) {
            System.out.println("Answer is: " + divObject.divide());
        } else {
            System.out.println("Error: Integers are invalid");
            System.exit(-1);
        }

    }
}
