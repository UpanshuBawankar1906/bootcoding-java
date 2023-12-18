public class Explicite
{
    public static void main(String args [])
    {
       double d = 34;
 
       short s = (short)d;
       int i = (int)d;
       long l = (long)d;
  
       System.out.println("Double Value:" + d);
       System.out.println("Short Value:" + s);
       System.out.println("Int Value:" + i);
       System.out.println("Long Value:" + l);
    }
}