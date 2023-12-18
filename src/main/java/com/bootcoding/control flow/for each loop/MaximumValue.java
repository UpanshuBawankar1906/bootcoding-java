public class MaximumValue
{
   public static void main(String [] args)
     {
       int numbers[] = {2,3,56,89,01,78};
       int maxNum = 0;

         for ( int number : numbers) 
           {
              if (number > maxNum)  
                {
                    maxNum = number;
                }
           }
       System.out.println("Maximum value: " + maxNum);
   
     }
}