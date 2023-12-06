public class StringToInteger
{
    public static void main(String [] args)
      {
           String s = "34521";

           int i = Integer.valueOf(s);

          System.out.println("StringToInteger Using Integer.valueOf :" + (i + 2));
          
      }
}