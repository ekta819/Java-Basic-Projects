package code.basic.pattern;

public class triPatternB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		for (int i = 0; i < n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
