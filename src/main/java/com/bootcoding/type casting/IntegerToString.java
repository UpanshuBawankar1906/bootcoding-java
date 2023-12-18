public class IntegerToString
{
    public static void main (String [] args)
      {
          int i = 23456;

          String a = Integer.toString(i);
          System.out.println("Using Integer.toString Method:" + (a + 2) );
          System.out.println("length of Using Integer.toString Method:" + a.length());
      }
}