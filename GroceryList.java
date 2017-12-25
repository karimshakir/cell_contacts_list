package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<String> name = new ArrayList<String>();



    public void addStudent() {

        System.out.println("Enter your name");
        Scanner inputName = new Scanner(System.in);
        String userName = inputName.nextLine();
        name.add(userName);
    }
}
