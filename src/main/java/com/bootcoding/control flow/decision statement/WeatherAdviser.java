public class WeatherAdviser
{
   public static void main(String [] args)
    {
       float f = -2.0f;

       if(f>=25.0)
        {
           System.out.println("Weather is hot you should wear shorts and t-shirt ");
        }
       else if(f<25 && f >=10)
        {
           System.out.println("Weather is cold you should wear coat");
        }
       else if(f<10 && f >=1)
        {
           System.out.println("Weather is extremely you should wear coat");
        }
       else 
        {
           System.out.println("Weather is freezing. Don't go outside the home");
        }
    }
}