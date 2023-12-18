public class AverageGradeCalculator
{
  public static void main(String [] args)
   {
       int grades[] = {98, 95, 76, 46, 87};
       int sum = 0;

       for(int grade : grades)
         {
             sum =+ grade;
         }
       double average = sum/grades.length;
       System.out.println("The average of grades:" +average);
   }
}