package NonCategory;

import java.util.Scanner;

public class Pep_Java_8NonCategory_8_RajneeshArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa=sc.nextInt();
		long [] arr = new long[soa];
		
		for(int i=0;i<soa;i++){
			arr[i]=sc.nextLong();
			
		}
		int noh=sc.nextInt();
		for(int i=0;i<noh;i++){
			long x=sc.nextLong();
			for(int k=0;k<soa;k++){
				if(arr[k]>x) arr[k]--;
				
			}
			
			
		}
		for(int i=0;i<soa;i++){
			System.out.print(arr[i] +" ");
			
		}
		

	}

}
