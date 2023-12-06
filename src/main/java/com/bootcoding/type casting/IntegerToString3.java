public class IntegerToString3
{
    public static void main (String [] args)
      {
          int i = 23456;

          String a = " " + i;
          System.out.println("Using Concatination method:" + (a + 4) );
          System.out.println("length of Using Concatination method:" + a.length());
      }
}