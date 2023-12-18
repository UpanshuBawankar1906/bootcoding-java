public class FloatToString4
{
    public static void main (String [] args)
      {
          float f = 23.456f;

          String str = String.format("%f",f);
          System.out.println("Using String.format Method:" + (str + 5));
          System.out.println("Length of String.format Method:" + str.length());
      }
}