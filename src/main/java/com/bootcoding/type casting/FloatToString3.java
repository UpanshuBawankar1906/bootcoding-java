public class FloatToString3
{
    public static void main (String [] args)
      {
          float f = 23.456f;

          String str = "" + f;
          System.out.println("Using Concatination method:" + (str + 4));
          System.out.println("length of Concatination method:" + str.length());
      }
}