package July9;

import java.util.Scanner;

public class CountBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nok = sc.nextInt();
		
		
		int [] arr= new int [nok+1];
		//Catalan no
		
		arr[0]=1;
		arr[1]=1;
		arr[2]=2;
		
		for(int i=3;i<=nok;i++){
			
			for(int j=0;j<i;j++){
				arr[i]+= arr[j]*arr[i-j-1];
			}
		}
		
		System.out.println(arr[arr.length-1]);
		

	}

}
