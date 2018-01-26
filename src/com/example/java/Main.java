package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //create variables.
        Scanner choice = new Scanner(System.in);
        int select;
        //create a do-while loop to hold menu, it will loop if one of the 6 options is not selected.
        do {
            System.out.println("\nPlease enter an option from the menu:");
            System.out.println("-------------------------------------");
            System.out.println("1: Cheese Pizza");
            System.out.println("2: Sausage Pizza");
            System.out.println("3: Hawaiian Pizza");
            System.out.println("4: Veggie Pizza");
            System.out.println("5: Meat Lovers Pizza");
            System.out.println("6: Supreme Pizza");
            //get menu option from the user
            select = choice.nextInt();
        }while(select != 1 && select != 2 && select != 3 && select != 4 && select != 5 && select != 6);
        //a switch statement that will verify to the user what they have selected from the 6 options.
        switch (select)
        {
            case 1:
                System.out.println("\nYou selected:\n1: A Cheese Pizza.");
                break;
            case 2:
                System.out.println("\nYou selected:\n2: A Sausage Pizza.");
                break;
            case 3:
                System.out.println("\nYou selected:\n3: A Hawaiian Pizza.");
                break;
            case 4:
                System.out.println("\nYou selected:\n4: A Veggie Pizza.");
                break;
            case 5:
                System.out.println("\nYou selected:\n5: A Meat Lovers Pizza.");
                break;
            case 6:
                System.out.println("\nYou selected:\n6: A Supreme Pizza.");
                break;
        }

    }
}
