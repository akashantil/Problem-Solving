package asssingmentfeb07;

import java.util.Scanner;

public class Kadanes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		int s;
		
		Scanner sc = new Scanner (System.in);
		n=sc.nextInt();
		
		for(int j=1;j<=n;j++){
			s=sc.nextInt();
		
		int [] arr = new int[s];
		for (int i=0;i<s;i++){
			arr[i]=sc.nextInt();
			
		}
		int cmax=arr[0];
		int omax=arr[0];
		
		boolean winner=false;
		if(arr[0]>0) winner=true;
		for(int i=1;i<s;i++){
			if(winner==true ){
				cmax=cmax+arr[i];
				if(cmax>0) winner=true;
				else winner=false;
			}
			else if(winner ==false ){
				
				cmax=arr[i];
				if(cmax>0) winner=true;
				else winner=false;
			}
			
			if(cmax>omax){
				omax=cmax;
			}
		}
		System.out.println(omax);
		
		}
	}

}
