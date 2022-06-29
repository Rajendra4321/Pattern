package starPattern;

//**** 
//*** 
//** 
//* 
public class Pattern3 {
	public static void main(String[] args) {

		int star = 4;
		int count = 4;

		for (int i = 0; i < count; i++) {

			for (int j = 0; j < star; j++) {
				System.out.print("*");
			}
			star--;
			System.out.println(" ");
		}

	}
}