// 1 2 3 4 5 6
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1

public class NumberIncreasingRevers
{ 
  public static void main (String [] args)
   { 
     int i, j; 
     int n = 9;
      
     for (i = n; i >= 1; i--) 
        { 
	  for (j = 1; j <= i; j++) 
            {  
	      System.out.print(j + " "); 
	    } 
	     System.out.println(); 
        } 
   } 
}