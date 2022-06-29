package starPattern;


public class pattern14 {

	//*
	//**
	//*
	//**
	//***
	//**
	//*
	//**
	//*
	
	public static void main(String[] args)
	{
		int star=1;
		int count = 9;
		for(int i=1; i<=count; i++) 
		{
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
						
			if(i<5)
			{
				star++;
			}
			else
			{
				star--;
			}
			
		}
	}
}