public class Even
{
      public static void main (String [] args)
       {
            int a = 0;
            int b = 1;

            while(b<=15)
              {
                if (a % 2 == 0)
                  {
                   a += b;
                  }
                  b++;
              }

          System.out.println(" The sum of even numbers from 1 to 15 is: "+a);
       }
}