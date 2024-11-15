package code.basic.pattern;

public class triPatternC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		for (int i = 0; i < n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print("*");
			}
			System.out.print("\n");
			for (int k = 0; k <= i; k++) {
				System.out.print(" ");
			}

		}
	}

}
