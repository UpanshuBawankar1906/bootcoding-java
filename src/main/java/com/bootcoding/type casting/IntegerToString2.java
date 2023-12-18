public class IntegerToString2
{
    public static void main (String [] args)
      {
          int i = 23456;

          String a = String.valueOf(i);
          System.out.println("Using String.valueOf Method:" + (a + 3) );
          System.out.println("length of Using String.valueOf Method:" + a.length());
      }
}