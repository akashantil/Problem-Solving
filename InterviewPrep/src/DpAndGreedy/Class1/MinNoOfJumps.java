package DpAndGreedy;

import java.util.Scanner;

public class MinNoOfJumps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa=sc.nextInt();
		int [] arr = new int [soa];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		int [] minJumps=new int [soa];
		
		for(int i=0;i<arr.length;i++)
			minJumps[i]=Integer.MAX_VALUE -1000;
		minJumps[soa-1]=0;
		
		
		for(int i=soa-2;i>=0;i--){
			
			
			int jump=arr[i];
			if(jump!=0){
			for(int j=1;j<=jump && j+i<soa;j++){
				minJumps[i]=Math.min(minJumps[i], 1+minJumps[j+i]);
			}
			}
			
			
		}
		System.out.println(minJumps[0]);

	}

}
