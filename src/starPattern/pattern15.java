package starPattern;

public class pattern15
{
//	    *
//	   **
//	  ***
//	 ****
//	  ***
//	   **
//	    *
	public static void main(String[] args)
	{
		int space=3;
		int star=1;
		int count = 7;
		for(int i=1; i<=count; i++)
		{
			for(int j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=star; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
			
			if(i<4) 
			{
				space--;
				star++;
			}
			else 
			{
				space++;
				star--;
			}
			
		}
		
		
	}

}