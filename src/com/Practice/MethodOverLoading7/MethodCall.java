package com.Practice.MethodOverLoading7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodCall{
    public static void main(String[] args) throws IOException {
        int x , y;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter 2 integers");
        x = Integer.parseInt(br.readLine());
        y = Integer.parseInt(br.readLine());

        Overloading ol = new Overloading();

        System.out.println("Result is :" + ol.sum(x,y));

    }

}
