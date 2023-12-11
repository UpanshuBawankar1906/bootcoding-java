/*Develop a program that takes a string as input and prints each character on a new line using a for loop.*/

public class Print
{
  public static void main(String [] args)
     {
        String s = "1234";
        int i;
        for(i = 0; i<s.length(); i++)
           {
                System.out.println(s.charAt(i));
           }
     }
}
