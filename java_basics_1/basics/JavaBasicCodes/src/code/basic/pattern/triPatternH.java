package code.basic.pattern;

public class triPatternH {

	public static void main(String[] args) {
		int n=7;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
	    		{
	        			System.out.print("* ");
	    		}
	    	
	    	System.out.println("");
		}
		
		for(int i=n;i>=1;i--)
		{
			
			 for(int j=i-1;j>1;j--) 
			 { 
				 System.out.print("* "); 
			 }
			 System.out.println("");
				
	}
	}

}