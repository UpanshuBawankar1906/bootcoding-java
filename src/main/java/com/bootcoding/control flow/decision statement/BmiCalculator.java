public class BmiCalculator
{
   public static void main(String [] args)
     {
           double height = 1.8288;
           double weight = 75;
           double bmi = (weight / (height * height));

           System.out.println("Your BMI is: "+ bmi);

          if (bmi < 18.5) 
            {
            System.out.println("Underweight");
            } 
          else if (bmi < 24.9) 
           {
            System.out.println("Normalweight");
           }  
          else if (bmi < 29.9) 
           {
            System.out.println("Overweight");
           }  
          else 
           {
            System.out.println("Obese");
           }
     }
}