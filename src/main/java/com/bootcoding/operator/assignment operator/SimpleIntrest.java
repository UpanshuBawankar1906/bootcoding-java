public class SimpleIntrest
{
   public static void main(String[] args)
  {
     float principal = 10000.0f;
     float rate = 8.67f;
     float time = 365f;
     float sum;
 
         sum = (principal * (1 + rate * time));

         System.out.println("Simple Intrest: " + sum);
  }
}