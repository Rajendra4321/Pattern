package starPattern;

public class pattern7 {
//	*******
//	 *****
//	  ***
//	   *
	public static void main(String[] args) {
		int space=0;
		int star=7;
		int count = 4;
		for (int i = 0; i < count; i++) {
			
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < star; j++) {
				System.out.print("*");
				
			}
			space++;
			star=star-2;
			System.out.println("");
			
		}

	}

}
