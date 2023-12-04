public class Increment 
{

	public static void main(String[] args) 
       {

		int variable = 15;
		System.out.println("Original value of the variable = " + variable);

		
		variable++; 	 
		System.out.println("variable++ = " + variable);

		++variable;		
		System.out.println("++variable = " + variable);
             
                variable--;
		System.out.println("variable-- = " + variable);
            
                --variable;
		System.out.println("--variable = " + variable); 
	}
}