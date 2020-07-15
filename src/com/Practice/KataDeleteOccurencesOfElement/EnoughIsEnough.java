package com.Practice.KataDeleteOccurencesOfElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class EnoughIsEnough {

    public static void main(String[] args) {
        var result = EnoughIsEnough.deleteNth( new int[] { 1,2,3,4}, 0);
            Boolean resultbool = Arrays.equals(result,new int[] { });
    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        //Code here ;)
        HashMap<Integer,Integer> elementCount = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<>();
        int itemCount =0;
        for(int item : elements)
        {
            if(elementCount.containsKey(item))
            {
                itemCount = elementCount.get(item);
                if(itemCount < maxOccurrences)
                {
                    itemCount++;
                    result.add(item);
                    elementCount.replace(item,itemCount);
                }
            }
            else
            {
                result.add(item);
                elementCount.put(item,1);
            }
        }

        int[] resultArray = new int[result.size()];

        for(int i = 0; i < result.size(); i++) {
            if (result.get(i) != null) {
                System.out.println(result.get(i));
                resultArray[i] = result.get(i);
            }
        }
        return resultArray;
    }
}
