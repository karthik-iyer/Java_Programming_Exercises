package com.Practice.SwappingValues6;

public class SwapSecond{
    int output;
    public void Swap(SwapFirst s)
    {
        output = s.num1;
        s.num1 = s.num2;
        s.num2 = output;

    }
}
