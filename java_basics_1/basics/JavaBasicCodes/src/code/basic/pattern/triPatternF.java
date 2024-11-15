package code.basic.pattern;

public class triPatternF {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			
			for(int j=n;j>n-i;j--)
    		{
        			System.out.print(" ");
    		}
			for(int j=i;j<=n;j++)
    		{
        			System.out.print("* ");
    		}
    		System.out.println("");
			
				
		}

	}


}
