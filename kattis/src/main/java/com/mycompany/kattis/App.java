/*
 * Java solution for the Kattis problem Tri https://open.kattis.com/problems/tri
 */
package com.mycompany.kattis;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author toririggs
 */

public class App {
    Scanner in = new Scanner(System.in);
    PrintStream out = System.out;
    int a,b,c;
    char x,y;
    
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.run();
    }
    
    void run() {
        read();
        solve();
        write();
    }
    
    void read() {
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
    }
    
    void write() {
        out.printf("%d%c%d%c%d%n", a, x, b, y, c);
    }
    
    void solve() {
        /*Test a+b=c a*b=c a/b=c a-b=c 
          Test a=b+c a=b*c a=b/c a=b-c */
        if (a + b == c) {x='+'; y='=';}
        if (a * b == c) {x='*'; y='=';}
        if (a / b == c) {x='/'; y='=';}
        if (a - b == c) {x='-'; y='=';}
        if (a == b + c) {x='='; y='+';}
        if (a == b * c) {x='='; y='*';}
        if (a == b / c) {x='='; y='/';}
        if (a == b - c) {x='='; y='-';}
    }
}
