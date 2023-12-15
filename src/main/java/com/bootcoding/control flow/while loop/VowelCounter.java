public class VowelCounter
{
   public static void main(String [] args)
    {
      String str = "upanshu bawankar";

      char vowels[] = {'a','e','i','o','u'};
      int i = 0;

       for (char c : str.toCharArray()) 
        {
           
         for (char vowel : vowels) 
           {
             if (c == vowel) 
                {
                  i++;
                }
           }
       }
      System.out.println(i);
   
    }
}