//Write a program to print all even numbers between 1 and 20 using a for loop.
public class EvenNumber
{
 public static void main(String [] args)

  {
       int num = 1;
      for ( int i = 1; i<= 20;i++ )
         {
            if(num % 2 == 0)
             {
               System.out.println(num);
             }
             num++;
         }
  }
}