/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.collections;

/**
 *
 * @author lolak
 */
import java.io.PrintStream;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class App {
    Scanner in = new Scanner(System.in);
    PrintStream out = System.out;
    HashSet<String> groceries = new HashSet<String>();
    
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.run();
    }
    
    void run() {
        initList();
        showMenu();
    }
    
    void initList() {
        groceries.add("eggs");
        groceries.add("milk");
        groceries.add("Halloween candy");
        groceries.add("paper towels");
        groceries.add("phone case");
    }
    
    void showMenu() {
        boolean running = true;
        int x = 5;
        while (running) {
            System.out.println("Shopping List");
            out.println("Please select an option:");
            out.println("Enter 1 to show the shopping list");
            out.println("Enter 2 to add an item to the list");
            out.println("Enter 3 to delete an item from the list");
            out.println("Enter 0 to quit");
            x = in.nextInt();
            switch(x) {
                case 1:
                    showList();
                    pause();
                    break;
                case 2:
                    addItem();
                    pause();
                    break;
                case 3:
                    deleteItem();
                    pause();
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    out.println("Please enter a number that corresponds to one of the options.");
                    pause();
            }
        }
    }
    
    void showList() {
        out.println("The shopping list contains: " + groceries);
    }
    
    void addItem() {
        out.println("Adding item:");
    }
    
    void deleteItem() {
        out.println("Deleting item:");
    }
    
    void pause() {
        out.println("Press enter to return to the menu");
        in.nextLine();
    }
}
