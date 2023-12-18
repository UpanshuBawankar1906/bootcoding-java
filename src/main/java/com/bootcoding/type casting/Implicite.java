public class Implicite
{
   public static void main(String [] args)
    {
        
        byte b = 5;
        int i = b;
        float f = i;
        double d = f;        
        //long l = d;
        

        System.out.println("Int Value:"+ i);
        System.out.println("Byte Value:"+ b);
        System.out.println("Double Value:"+ d);
        System.out.println("Float Value:"+ f);
        //System.out.println("Short Value:"+ s);
       // System.out.println("Long Value:"+ l);
    }
}