public class SumOfDigit2
{
      public static void main (String [] args)
       {
            int num = 253;
            int a = 0;
            int sum = 0;

            do
            {
              a = num % 10;
              num = num / 10;
              sum = a + sum;
            }

            while (num > 0); 
            {
              System.out.println("Sum of the given number is:" + sum);
            }
         
       }
}