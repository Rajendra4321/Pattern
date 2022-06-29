package starPattern;

public class Pattern_all {

	public void pattern1() {
		int star = 4;
		int count = 4;
		int space = 0;
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < star; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void pattern2() {
		int star = 1;
		int count = 4;
		int space = 0;
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < star; j++) {
				System.out.print("*");
			}
			star++;
			System.out.println();
		}

	}

	public static void pattern3() {
		int stat = 1;
		int count = 4;
		int space = 3;
		for (int i = 0; i < count; i++) {

			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < stat; j++) {
				System.out.print("*");
			}
			space--;
			stat++;
			System.out.println();
		}

	}
	
	public static void pattern4() {
		int stat = 4;
		int count = 4;
		int space = 0;
		for (int i = 0; i < count; i++) {

			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < stat; j++) {
				System.out.print("*");
			}
			space++;
			stat--;
			System.out.println();
		}

	}
	public static void pattern5() {
		int stat = 1;
		int count = 4;
		int space = 3;
		for (int i = 0; i < count; i++) {

			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < stat; j++) {
				System.out.print("*");
			}
			space--;
			stat++;
			System.out.println();
		}

	}
	
	public static void pattern6() {
		int stat = 1;
		int count = 4;
		int space = 3;
		for (int i = 0; i < count; i++) {

			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < stat; j++) {
				System.out.print("*");
			}
			space--;
			stat=stat+2;;
			System.out.println();
		}

	}
	
	public static void pattern7() {
		int stat = 7;
		int count = 4;
		int space = 0;
		for (int i = 0; i < count; i++) {

			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < stat; j++) {
				System.out.print("*");
			}
			space++;
			stat=stat-2;;
			System.out.println();
		}

	}
	public static void pattern8() {
		int stat = 1;
		int count = 4;
		int space = 3;
		int count1=3;
		int space1 = 1;
		int stat1 = 5;
		for (int i = 0; i < count; i++) {

			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < stat; j++) {
				System.out.print("*");
			}
			space--;
			stat=stat+2;;
			System.out.println();
		}
		
		for (int i = 0; i < count1; i++) {

			for (int j = 0; j < space1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < stat1; j++) {
				System.out.print("*");
			}
			space1++;
			stat1=stat1-2;;
			System.out.println();
		}

	}
	

	public static void main(String[] args) {

		Pattern_all p1 = new Pattern_all();
		p1.pattern1();
		System.out.println("--------------2-------------------------------");
		pattern2();
		System.out.println("-------------3--------------------------------");
		pattern3();
		System.out.println("-------------4--------------------------------");
		pattern4();
		System.out.println("--------------5-------------------------------");
		pattern5();
		System.out.println("-------------6-------------------------------");
		pattern6();
		System.out.println("--------------7-------------------------------");
		pattern7();
		System.out.println("-------------8--------------------------------");
		pattern8();
	}

}
