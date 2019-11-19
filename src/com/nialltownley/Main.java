package com.nialltownley;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MyLinkedList<String> theList = new MyLinkedList();

        System.out.println("Hello, we are going to make list of strings");

        Scanner s = new Scanner(System.in);

        System.out.println("Type in lines of text, followed by enter. When you have finished press Enter twice");

        while (true) {
            String nextLine = s.nextLine().trim();
            if (nextLine.length() == 0) {
                break;
            } else {
                theList.AppendItem(nextLine);
            }
        }

        System.out.println(String.format("Great! You have %d items in your list", theList.CountItems()));

        while (true) {
            System.out.println("What would you like to do now?");
            System.out.println("0 - Quit");
            System.out.println("1 - Count items in the list");
            System.out.println("2 - Print the list");
            System.out.println("3 - Add another string to the start of the list");
            System.out.println("4 - Add another string to the end of the list");
            System.out.println("5 - Delete the first thing in the list");
            System.out.println("6 - Delete the last thing in the list");


            System.out.println("\nEnter choice:");

            String choice = s.nextLine().trim();

            if (choice.equals("0")) {
                break;

            } else if (choice.equals("1")) {

                System.out.println(String.format("There are %d items in the list", theList.CountItems()));

            } else if (choice.equals("2")) {

                System.out.println();
                theList.PrintAll();
                System.out.println();

            } else if (choice.equals("3")) {

                System.out.println("Enter new item");
                String newItem = s.nextLine().trim();
                theList.PrependItem(newItem);

            } else if (choice.equals("4")) {

                System.out.println("Enter new item");
                String newItem = s.nextLine().trim();
                theList.AppendItem(newItem);

            } else if (choice.equals("5")) {

                theList.DeleteItem(0);

            } else if (choice.equals("6")) {

                theList.DeleteItem(theList.CountItems() - 1);

            } else {

                System.out.println("Please enter ,one of the choices above");
            }
        }
    }
}
