// 1 2 3 4 5 6 7 8
//  2 3 4 5 6 7 8
//   3 4 5 6 7 8
//    4 5 6 7 8
//     5 6 7 8
//      6 7 8
//       7 8
//        8
//       7 8
//      6 7 8
//     5 6 7 8
//    4 5 6 7 8
//   3 4 5 6 7 8
//  2 3 4 5 6 7 8
// 1 2 3 4 5 6 7 8


public class MirriorImage
{  
   public static void main(String [] args) 
     { 
	int i, j; 
        int n = 8;
		
	for (i = 1; i <= n; i++) 
           { 
	     for (j = 1; j < i; j++) 
                { 
		   System.out.print(" "); 
	        } 
			
		for (j = i; j <= n; j++) 
                   { 
			System.out.print(j + " "); 
		   } 
			
		    System.out.println(); 
	  } 
     		
	for (i = n - 1; i >= 1; i--) 
           { 
	     for (j = 1; j < i; j++) 
                { 
		   System.out.print(" "); 
	        } 
			
		for (j = i; j <= n; j++) 
                   { 
			System.out.print(j + " "); 
		   } 
			
		    System.out.println(); 
	  } 
     }
}