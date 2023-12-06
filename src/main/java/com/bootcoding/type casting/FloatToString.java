public class FloatToString
{
    public static void main (String [] args)
      {
          float f = 23.456f;

          String str = Float.toString(f);
          System.out.println("Using Float.toString Method:" + (str + 2));
          System.out.println("length of Float.toString Method:" + str.length());
      }
}