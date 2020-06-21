package com.Practice.SwappingValues6;

public class SwappingValues6 {
    public static void main(String[] args) {

        SwapFirst s2 = new SwapFirst(2,3);
        System.out.println("Before Swapping : " + s2.num1 + "\t" + s2.num2);
        SwapSecond s3 = new SwapSecond();
        s3.Swap(s2);
        System.out.println("After Swapping : " + s2.num1 + "\t" + s2.num2);
    }
}


