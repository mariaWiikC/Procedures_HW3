package com.company;

public class Main
{

    public static void main(String[] args)
    {
        // 1.
	    int[] a = {1, 2, 3, 4};
        System.out.println( contains(a, 10) );

        // 2.
        int[] b = {8};
        System.out.println( any(a, b) );
    }

    static boolean contains (int[] array, int value)
    {
        boolean is_contains = false;
            for (int v : array)
            {
                if (v == value)
                {
                    is_contains = true;
                }
            }
        return is_contains;
    }

    static boolean any (int[] a, int[] b)
    {
        boolean is_any = false;
        for (int v : a)
        {
            for (int i = 0; i < b.length; i++)
            {
                if (v == b[i])
                    is_any = true;
            }
        }
        return is_any;
    }
}
