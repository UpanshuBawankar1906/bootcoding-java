//Write a program that prints the multiplication table of 7 using a for loop.

public class Table
{
   public static void main(String [] args)
     {
       int i;
       int num = 7; 

          for( i = 1; i<=10; i++) 
            {
                 System.out.println(num + " x "+ i +" = " + num*i );
            }
         
     }
}