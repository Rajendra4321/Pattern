package starPattern;

import java.util.Iterator;

//* 
//** 
//*** 
//**** 
public class Pattern2 {
	public static void main(String[] args) {

		int star = 1;
		int count = 4;

		for (int i = 0; i < count; i++) {

			for (int j = 0; j < star; j++) {
				System.out.print("*");
			}
			star++;
			System.out.println(" ");
		}

		int s = 1;
		int c = 4;
		int n = 2;

		for (int i = 0; i < c; i++) {

			for (int j = 0; j < s; j++) {
              
				if (j>=1) {
					
				
				if (j == 1) {
					System.out.print("*" + (n + 2));
				} else if (j == 2) {

					System.out.print("*" + (n + 4));
				} else if (j == 3) {

					System.out.print("*" + (n + 6));
				}
				else if (j == 4) {

					System.out.print("*" + (n + 2));
				}
				else {
					System.out.print("*" );

				}
				
				}
				else {
					System.out.print("*" + n);

			}

		}
		s++;
		n = n * 3;

		System.out.println(" ");
	}
	}
}
