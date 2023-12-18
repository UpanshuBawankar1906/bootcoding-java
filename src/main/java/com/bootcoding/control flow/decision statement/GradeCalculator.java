public class GradeCalculator
{
   public static void main(String [] args)
     {
          double exam = 90.0;
          double assign = 60.0;
          double practical =50.0;
          
         double result = ((exam * 0.5) + (assign * 0.2) + (practical * 0.2));

          System.out.println("Marks Obtain =" + result);

          if(result<40)
           {
             System.out.println("Fail");
           }
          else if(result>=40 && result<=55)
           {
             System.out.println("Grade D");
           }
          else if(result>=56 && result<=65)
           {
             System.out.println("Grade C");
           }
          else if(result>=66 && result<=75)
           {
             System.out.println("Grade B");
           }
          else
           {
             System.out.println("Grade A");
           }
     }
 
}