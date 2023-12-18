public class IntegerToString4
{
    public static void main (String [] args)
      {
          int i = 23456;

          String a = String.format("%d",i);
          System.out.println("Using String.format Method:" + (a + 5) );
          System.out.println("length of String.format Method:" + a.length());
      }
}