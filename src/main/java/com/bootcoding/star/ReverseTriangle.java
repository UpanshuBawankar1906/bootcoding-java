package com.bootcoding.star;

public class ReverseTriangle
{
    public static void main(String[] args)
    {
        //int i, j, k, rows=9;
        for (int i=9; i>=1 ; i--)
        {
            for (int j = i; j < 9 ; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i -1) ;k++)
            {
                if(k==1 || i == 9 || k==(2*i-1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
