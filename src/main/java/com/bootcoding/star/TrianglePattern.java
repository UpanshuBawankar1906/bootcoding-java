package com.bootcoding.star;
public class TrianglePattern
{
    public static void main(String[] args)
    {
        for (int i=1; i<= 8 ; i++)
        {
            for (int j = i; j < 8 ; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i -1) ;k++)
            {
                if(k==1 || i == 8 || k==(2*i-1))
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
