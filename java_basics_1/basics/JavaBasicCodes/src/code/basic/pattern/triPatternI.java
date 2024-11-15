package code.basic.pattern;

public class triPatternI {

	public static void main(String[] args) {

		int n=7;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
	    		{
	        			System.out.print("*");
	    		}
	    	
	    	System.out.println("");
		}
		
		for(int i=n;i>=1;i--)
		{
			
			 for(int j=0;j<=n-i;j++)
			 {
				 System.out.print(" ");
			 }
			 for(int j=i-1;j>0;j--) 
			 { 
				 System.out.print("*"); 
			 }
			 System.out.println("");
				
	}
	

	}

}
