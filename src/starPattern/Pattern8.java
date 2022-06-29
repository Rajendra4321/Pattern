package starPattern;

//   *
//  ***
// *****
//*******
public class Pattern8 {

	public static void main(String[] args) {
		
			int space=3;
			int star=1;
			int count = 4;
			for (int i = 0; i < count; i++) {
			
				
				
				
				for (int j = 0; j < space; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < star; j++) {
					System.out.print("*");
					
				}
				space--;
				star=star+2;
				System.out.println("");
				
			}

		}

	}


