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
        System.out.println("The area of the trapezoid is " + area);
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
        App app = new App();
        app.run();
    }
    
    void run() {
        AreaOfTrapezoid obj = new AreaOfTrapezoid();
        int MAX = 5;
        th t1, t2, t3, t4, t5;
        out.println("Enter how many threads to run from 1 to 5");
        int num = in.nextInt();
        in.nextLine();
        if (MAX >= num && num > 0) {
            for (int i = 1; i<=num; i++){
                switch(i) {
                    case 1:
                        t1 = new th(obj);
                        out.println("Enter an integer for base 1 then hit enter: ");
                        t1.setB1(in.nextInt());
                        in.nextLine();
                        out.println("Enter an integer for base 2 then hit enter: ");
                        t1.setB2(in.nextInt());
                        in.nextLine();
                        out.println("Enter an integer for height then hit enter: ");
                        t1.setH(in.nextInt());
                        in.nextLine();
                        t1.start();
                        break;
                    case 2:
                        t2 = new th(obj);
                        out.println("Enter an integer for base 1 then hit enter: ");
                        t2.setB1(in.nextInt());
                        in.nextLine();
                        out.println("Enter an integer for base 2 then hit enter: ");
                        t2.setB2(in.nextInt());
                        in.nextLine();
                        out.println("Enter an integer for height then hit enter: ");
                        t2.setH(in.nextInt());
                        in.nextLine();
                        t2.start();
                        break;
                    case 3:
                        t3 = new th(obj);
                        out.println("Enter an integer for base 1 then hit enter: ");
                        t3.setB1(in.nextInt());
                        in.nextLine();
                        out.println("Enter an integer for base 2 then hit enter: ");
                        t3.setB2(in.nextInt());
                        in.nextLine();
                        out.println("Enter an integer for height then hit enter: ");
                        t3.setH(in.nextInt());
                        in.nextLine();
                        t3.start();
                        break;
                    case 4:
                        t4 = new th(obj);
                        out.println("Enter an integer for base 1 then hit enter: ");
                        t4.setB1(in.nextInt());
                        in.nextLine();
                        out.println("Enter an integer for base 2 then hit enter: ");
                        t4.setB2(in.nextInt());
                        in.nextLine();
                        out.println("Enter an integer for height then hit enter: ");
                        t4.setH(in.nextInt());
                        in.nextLine();
                        t4.start();
                        break;
                    case 5:
                        t5 = new th(obj);
                        out.println("Enter an integer for base 1 then hit enter: ");
                        t5.setB1(in.nextInt());
                        in.nextLine();
                        out.println("Enter an integer for base 2 then hit enter: ");
                        t5.setB2(in.nextInt());
                        in.nextLine();
                        out.println("Enter an integer for height then hit enter: ");
                        t5.setH(in.nextInt());
                        in.nextLine();
                        t5.start();
                        break;
                }
            }
        } else {out.println("Number not between 1 and 5, ending program.");}
    }
}