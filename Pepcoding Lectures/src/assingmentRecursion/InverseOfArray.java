package assingmentRecursion;

import java.util.Scanner;

public class InverseOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		int [] arr = new int [n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int id =sc.nextInt();
		inverse(arr, 0);
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(arr[id]);
	}
	public static void inverse(int [] arr ,int idx){
		if(idx==arr.length){
			return;
		}
		int count =arr[idx];
		inverse(arr, idx+1);
		arr[count]=idx;
	}
}
