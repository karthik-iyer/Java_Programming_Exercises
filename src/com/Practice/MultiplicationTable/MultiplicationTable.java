package com.Practice.MultiplicationTable;

public class MultiplicationTable {

    public void Print()
    {
        for (int i = 0; i < 10 ; i++)
        {
            System.out.printf("%d * %d = %d",5,i,5 * i).println();
        }
    }

    public void Print(int Table)
    {
        for (int i = 0; i < 10 ; i++)
        {
            System.out.printf("%d * %d = %d",Table,i,Table * i).println();
        }
    }

    public void Print(int Table,int From, int To)
    {
        for (int i = From; i <= To ; i++)
        {
            System.out.printf("%d * %d = %d",Table,i,Table * i).println();
        }
    }
}
