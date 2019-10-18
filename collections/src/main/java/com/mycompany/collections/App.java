/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.collections;

/**
 * idea for input sim: InputOutput inputOutput = new InputOutput();
 * <add in input var with what we want in input>
 * InputStream in = new ByteArrayInputStream(input.getBytes());
 * assertEquals(<value of input var>, inputOutput.functionToTest());
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
        var initFinished = initList();
        out.println(initFinished);
        showMenu();
    }
    
    String initList() {
        groceries.add("eggs");
        groceries.add("milk");
        groceries.add("Halloween candy");
        groceries.add("paper towels");
        groceries.add("phone case");
        return "List initialized!";
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
            in.nextLine();
            switch(x) {
                case 1:
                    out.println(showList());
                    pause();
                    break;
                case 2:
                    out.println("The new item you entered is: " + addItem());
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
    
    String showList() {
        String ret = "The shopping list contains: " + groceries;
        return ret;
    }
    
    String addItem() {
        out.println("Please type the item you want to add to the list and press enter:");
        String newItem = in.nextLine();
        groceries.add(newItem);
        return newItem;
    }
    
    void deleteItem() {
        if (!groceries.isEmpty())
        {
            out.println("Enter 1 to delete an item from the item's name");
            out.println("Enter 2 to delete all items from the list");
            int y = in.nextInt();
            in.nextLine();
            switch(y)
            {
                case 1:
                    out.println("Enter the item you want to delete:");
                    String delt = in.nextLine();
                    boolean removed = groceries.remove(delt);
                    if (!removed) out.println("The item you entered was not removed as it is not in the list.");
                    break;
                case 2:
                    groceries.clear();
                    out.println("Shopping list has been cleared!");
                    break;
                default:
                    out.println("You did not enter a number that corresponds to one of the options. Returning to menu.");
                    break;
            }
        }
        else out.println("The shopping list is empty so you cannot delete an item.");
    }
    
    void pause() {
        out.println("Press enter to return to the menu");
        in.nextLine();
    }
}
