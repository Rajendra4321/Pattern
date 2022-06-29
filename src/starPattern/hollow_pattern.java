package starPattern;

public class hollow_pattern {
	public static void main(String[] args) {
		int n=5;
		for (int i = 1; i <=n; i++) {  //5 2
			
			for (int j = 1; j <= n-i+1; j++) { //1<6 2
				
				if (j==1||j ==n-i+1||i==1) {    
					System.out.print("*");
					
				} else {
                   System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

}
