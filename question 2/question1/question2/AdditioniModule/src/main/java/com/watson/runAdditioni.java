package com.watson;

import java.util.Scanner;

public class runAdditioni {

    public static void main(String[] args) {
        Additioni addObject = new Additioni();
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first number to add: ");
        int firstInteger = input.nextInt();
        addObject.setInt1(firstInteger);
        System.out.print("Please enter the second number to add: ");
        int secondInteger = input.nextInt();
        addObject.setInt2(secondInteger);
        System.out.println("The Answer is: " + addObject.addition());

    }
}
