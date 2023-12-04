public class LeepYear
{
   public static void main(String [] args)
   {
      int a = 2005;
 
      if((a % 400 == 0) || ((a % 4 == 0) && (a % 100 != 0)))
       {
           System.out.println(a + " is a Leep Year");
       }
      else
       {
          System.out.println(a + " is not a Leep Year");
       }
      
   }
}