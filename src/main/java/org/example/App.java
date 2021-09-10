package org.example;
import java.text.DecimalFormat;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Quinn Barber
 */
public class App 
{
    public static void main( String[] args )
    {
        DecimalFormat df = new DecimalFormat("###");
        double celsius, fahrenheit;
        Scanner input = new Scanner(System.in);
        System.out.println( "Press C to convert from Fahrenheit to Celsius,\nPress F to convert from Celsius to Fahrenheit.\nYour choice:" );
        String in = input.nextLine();
        if( in.equals("F") || in.equals("f")){
            System.out.println("Please enter the temperature in Celsius:");
            celsius = input.nextDouble();
            fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("The temperature in Fahrenheit is " + df.format(fahrenheit) + ".");
        }
        if( in.equals("C") || in.equals("c")){
            System.out.println("Please enter the temperature in Fahrenheit:");
            fahrenheit = input.nextDouble();
            celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("The temperature in Celsius is " + df.format(celsius) + ".");
        }
    }
}
