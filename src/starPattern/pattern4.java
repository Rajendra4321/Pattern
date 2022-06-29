package starPattern;


public class pattern4 {
//	    * 
//	   ** 
//	  *** 
//	 **** 

	public static void main(String[] args) {
        int space = 3;
		int star = 1;
		int count = 4;

		for (int i = 0; i < count; i++) {
             
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j1 = 0; j1 < star; j1++) {
				System.out.print("*");
			}
			System.out.println(" ");
			star++;
			space--;
			
			
		}

	}
}