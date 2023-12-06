public class FloatToString2
{
    public static void main (String [] args)
      {
          float f = 23.456f;

          String str = String.valueOf(f);
          System.out.println("Using String.valueOf Method:" + (str + 3));
          System.out.println("length of String.valueOf Method:" + str.length());
      }
}