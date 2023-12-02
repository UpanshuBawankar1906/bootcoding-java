public class NamingViolationsExample 
{
    
   public static void printMessage()
      {
        System.out.println("Naming Violations Assignment");
      }
    public static void calculateSum()
      {
        int firstNumber = 10;
        int secondNumber = 20;
        int sum = firstNumber + secondNumber;
        System.out.println("Sum is: " + sum);
      }
  public static void main(String[] args)
  {
    int invalidVariable;
       printMessage();
    double thirdValue;
    String className;
    calculateSum();
    
  }
}
