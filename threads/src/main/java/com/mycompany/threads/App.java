/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.threads;
import java.io.PrintStream;
import java.util.Scanner;
/**
 *
 * @author lolak
 */


class AreaOfTrapezoid{
    synchronized int findArea(int b1, int b2, int h){
        int ret = ((b1 + b2)/2) * h;
        return ret;
    }
    synchronized void printArea(int area){
        System.out.println("The area is " + area);
    }
}

class th extends Thread{
    int base1, base2, height;
    AreaOfTrapezoid a;
    int getB1(){
        return base1;
    }
    void setB1(int val){
        base1 = val;
    }
    int getB2(){
        return base2;
    }
    void setB2(int val){
        base2 = val;
    }
    int getH(){
        return height;
    }
    void setH(int val){
        height = val;
    }
    th(AreaOfTrapezoid a){
        this.a = a;
    }
    public void run(){
        // add in setting all variables 
        a.printArea(a.findArea(getB1(), getB2(), getH()));
    }
}

public class App {
    Scanner in = new Scanner(System.in);
    PrintStream out = System.out;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AreaOfTrapezoid obj = new AreaOfTrapezoid();
        th t1 = new th(obj);
        th t2 = new th(obj);
        t1.start();
        t2.start();
    }
    
}
