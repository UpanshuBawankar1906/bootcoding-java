public class DiamondHoloPattern
{
    public static void main(String[] args)
    {

        for (int i=1; i<= 8 ; i++)
        {
            for (int j = 8; j > i ; j--)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 1; k < 2*(i -1) ;k++)
            {
                System.out.print(" ");
            }
            if( i==1)
            {
                System.out.println();
            }
            else
            {
                System.out.println("*");
            }
        }
        for (int i=8-1; i>= 1 ; i--)
        {
            for (int j = 8; j > i ; j--)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 1; k < 2*(i -1) ;k++)
            {
                System.out.print(" ");
            }
            if(i==1)
                System.out.println(" ");
            else
                System.out.println("*");
        }
    }
}



