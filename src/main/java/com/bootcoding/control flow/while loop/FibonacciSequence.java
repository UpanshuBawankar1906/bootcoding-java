public class FibonacciSequence
{
   public static void main(String [] args)
    {
       int a = 0;
       int b = 1;
       int number = 2;

       while(number<=10)
        {
           int c = a + b;
           System.out.println(c);
           a = b;
           b = c;
           number++;
        }

       
    }
}
