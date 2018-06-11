package asssingmentfeb07;

import java.util.Scanner;

public class assingmentStar {
	//Logic behind diamond pattern 
	//sumeet bhaiya

	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner (System.in);
		n=sc.nextInt();
		int i;
		int st=1,sp=n/2;
//		for(i=1;i<=n;i++){
//			System.out.println("star->" + st +  " & " + "spaces->" + sp );
//			if(i<=n/2){
//				sp--;
//				st+=2;
//			}
//			else{
//				sp++;
//				st-=2;
//			}
//		}
//		

	
	
//part1 
	int j,value=1;
	for(i=1;i<=n;i++){
		// part 2
		for(j=1;j<=sp;j++)
		{
			System.out.print(" ");
			
		}
		
		//printing just row no
		//value=i;
		//printing first no of pattern accurate i is row
		value= (i<=n/2)?i:n+1-i;
		for(j=1;j<=st;j++){
			System.out.print(value);
			value=(j<=st/2)?value+1:value-1;
		}
		
		//part3
		if(i<=n/2){
			sp--;
			st+=2;
		}
		else{
			sp++;
			st-=2;
		}
		System.out.println();
	}
	
	
}
	

}
