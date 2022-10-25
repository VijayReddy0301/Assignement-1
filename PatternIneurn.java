
public class PatternIneurn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=8;
		for(int i=0;i<n;i++) {
			
			// Letter I
			for(int j=0;j<n;j++) {
				
				if(j==n/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			//Letter N
              for(int j=0;j<n;j++) {
				
				if((j==0) || (i==j) || j==n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			
              System.out.print("  "); // this is for space between two letters
              
              //Letter E
              
              for(int j=0;j<n;j++) {
  				
  				if((i==0 && j<n-1) || (j==0) || (i==n-1 && j<n-1) || i==(n-1)/2 && j<n-1) {
  					
  					System.out.print("*");
  				}else {
  					System.out.print(" ");
  				}
  			}
			
              System.out.print(" ");// this is for space between two letters
              
              
              //Letter U
              
              for(int j=0;j<n;j++) {
  				
  				if((i==n-1 && j>0 && j<n-1) || (j==0 && i<n-1) || (j==n-1 && i<n-1)) {
  					System.out.print("*");
  				}else {
  					System.out.print(" ");
  				}
  			}
  			
              System.out.print("  ");   // this is for space between two letters
              
              //Letter R
              
              
              for(int j=0;j<n;j++) {
  				
  				if((i==0 && j>0 && j<n-1) || (j==0 && i>0) || (j==n-1 && i>0 && i<(n)/2) || (i==(n)/2 &&  j<n-1) || i-j==(n-5)/2 &&  i>=(n)/2 ) {
  					System.out.print("*");
  				}else {
  					System.out.print(" ");
  				}
  			}
              
                  
              System.out.print("  ");	// this is for space between two letters
              
              //Letter O
              
              for(int j=0;j<n;j++) {
  				
  				if((i==0 && j>0 && j<n-1) || (j==0 && i>0 && i<n-1 ) || (j==n-1 && i>0 && i<n-1 ) || (i==n-1 && j>0 && j<n-1)) {
  					System.out.print("*");
  				}else {
  					System.out.print(" ");
  				}
  			}
              
              System.out.print("  ");		// this is for space between two letters
              
              
              
              //Letter N
			
              for(int j=0;j<n;j++) {
  				
  				if((j==0) || (i==j) || j==n-1) {
  					System.out.print("*");
  				}else {
  					System.out.print(" ");
  				}
  			}
  			
              System.out.print("  ");	// this is for space between two letters
               
                
               System.out.println();
		
		
		}
		
		
		


	}

}
