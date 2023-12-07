public class NumberProperties
{
   public static void main(String [] args)
     {
        int a = 5;
        int b = 0;
        int i;
        for(i=2; i<=a-1; i++)
          {
             if(a%i==0)
              {
                   b=b+1;
              }
          }
          if(b==0)
          {
              System.out.println(a + " is prime number");
          }
       
          if(a % 2 == 0)
           {
              System.out.println(a + " is a even number");             
           }
          else 
           {
              System.out.println(a + " is a odd number");             
           }
     }
}