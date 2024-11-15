package code.basic.pattern;

public class triPatternD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		for (int i = 1; i <=n; i++) {
			for (int j=1;j<=n-i;j++) {
				System.out.print(" ");
				
			}
			for(int k=(n-1);k>=(n-i);k--)
			{
				System.out.print("*");
			}
			
			System.out.println("");
			
		}

	}

}
