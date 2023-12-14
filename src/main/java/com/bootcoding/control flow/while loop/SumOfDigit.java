public class SumOfDigit
{
      public static void main (String [] args)
       {
            int num = 253;
            int a = 0;
            int sum = 0;
            while (num > 0) 
            {
              a = num % 10;
              num = num / 10;
              sum = a + sum;

             
              
            }
          System.out.println("Sum of the given number is:" + sum);

         
       }
}