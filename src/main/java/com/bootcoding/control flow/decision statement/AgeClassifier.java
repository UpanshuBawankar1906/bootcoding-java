public class AgeClassifier
{
   public static void main(String [] args)
     {
         int a = 25;

          if(a<=12)
          {
             System.out.println("Child");
          }
          else if (a>12 && a<19)
           {
             System.out.println("Teen Age");
           }
          else if (a>=20 && a<=50)
           {
             System.out.println("Adult");
           }
          else
           {
             System.out.println("Senior Citizen");
           }
     }
}