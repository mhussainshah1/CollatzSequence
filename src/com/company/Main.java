package com.company;

import java.util.Scanner;

/**
 * You are going to develop an application to produce numbers in a sequence.
 *
 * The user will be required to enter a number, and for that number, you will:
 *
 * * Divide the number by 2 if it is even
 *
 * * Multiply the number by 3, and add 1 if it is odd.
 *
 * * Do this until you get to 1.
 *
 * Ask the user if he/she would like to input another number, and continue until he/she does not want to enter any more numbers.
 *
 * Show the results as you go. For example, the number 5 should produce the following output:
 *
 * 5 16 8 4 2 1
 *
 * The number 3 should produce the following output:
 *
 * 3 10 5 16 8 4 2 1
 */
public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String choice;

        while(true){
            System.out.println("Enter the number: ");
            int n = keyboard.nextInt();
            while(n > 0){
                if (n%2 == 0){
                    n /= 2;
                } else {
                    n = n * 3 + 1;
                }
                System.out.print(n + ", ");
                if(n == 1){
                    break;
                }
            }

            System.out.print("\nWould like to input another number Y / N ?");
            choice = keyboard.next();
            if(choice.equalsIgnoreCase("y")){
                continue;
            } else if (choice.equalsIgnoreCase("n")){
                break;
            }
        }
    }
}
