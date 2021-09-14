import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alex Fowler
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of the month: ");
        int month = scanner.nextInt();
        String output = new String("Month");
        switch (month) {
            case 1:
                output = new String("January");
                break;
            case 2:
                output = new String("February");
                break;
            case 3:
                output = new String("March");
                break;
            case 4:
                output = new String("April");
                break;
            case 5:
                output = new String("May");
                break;
            case 6:
                output = new String("June");
                break;
            case 7:
                output = new String("July");
                break;
            case 8:
                output = new String("August");
                break;
            case 9:
                output = new String("September");
                break;
            case 10:
                output = new String("October");
                break;
            case 11:
                output = new String("November");
                break;
            case 12:
                output = new String("December");
                break;
        }
        System.out.println("The name of the month is " + output + ".");
    }
}
