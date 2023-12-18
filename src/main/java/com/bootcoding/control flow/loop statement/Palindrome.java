public class Palindrome
{
  public static void main (String [] args)
    {
         int a = 121;
         int num = a;
         int rev = 0;

         while(a>0)
           {
	      int rem = a%10;        
	
	      rev = rev*10 + rem;
	
	      a /= 10; 
            }
        if(num==rev)
           {
                System.out.println("The given number is Palindrome");
           }
        else
           {
               System.out.println("The given number is not a Palindrome");
           }
    }
}