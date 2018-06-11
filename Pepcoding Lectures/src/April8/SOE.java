package April8;

import java.util.Arrays;
import java.util.Scanner;

public class SOE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		boolean [] arr = new boolean[n+1];
		Arrays.fill(arr, true);
		
		
		arr[0]=false;
		arr[1]=false;
		for(int i=2;i*i<=n;i++){
			for(int j=i;j*i<=n && arr[i]==true;j++){
				arr[i*j]=false;
				
			}
		}
		for(int k=0;k<n+1;k++){
			if(arr[k]==true)
				System.out.print(k+" ");
				
			
		}
		

	}
	

}
