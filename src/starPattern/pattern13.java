package starPattern;

public class pattern13
{
//  ****
//	***
//	**
//	*
//	**
//	***
//	****


	
	public static void main(String[] args)
	{
		int star=4;
		int count=7;
		for(int i=1; i<=count; i++)   //1<7
		{
			for(int j=1; j<=star; j++) //1<4
			{
				System.out.print("*");  
			}
			System.out.println();
					
			if(i<4)
			{
				star--;
			}
			else
			{
				star++;
			}
		
		}

	}

}

