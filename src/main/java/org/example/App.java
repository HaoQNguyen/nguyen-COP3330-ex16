/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hao Nguyen
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        final int LEGAL_AGE = 16;

        Scanner input = new Scanner(System.in);
        System.out.print("What is your age? ");
        int age = input.nextInt();
        String illegal = "You are not old enough to legally drive.";
        String legal = "You are old enough to legally drive";

        String msg = age >= LEGAL_AGE ? legal : illegal;
        System.out.println(msg);
    }
}
