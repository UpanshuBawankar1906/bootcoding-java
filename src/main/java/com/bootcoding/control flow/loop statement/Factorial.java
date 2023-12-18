/*Create a program to calculate and print the factorial of a number entered by the user using a for loop. 
*/


public class Factorial
{
   public static void main(String [] args)
     {
          int num = 5;
          int fact = 1;

          for(int i = 1; i<=num; i++) 
            {
                 fact *= i;
            }
         System.out.println("The factorial of " + num + " is:" + fact );
     }
}