package com.Practice;

import java.io.PrintWriter;

public class PrintWriter2 {
    public static void main(String[] args) {
        var pw = new PrintWriter(System.out,true);
        String st = "Project 2";
        pw.println("This is " + st);
    }
}
