package assingmentRecursion;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int id;
		Scanner sc = new Scanner(System.in);
		i=sc.nextInt();
		
		int [] arr= new int [i];
		for(int j=0;j<i;j++){
			arr[j]=sc.nextInt();
		}
		int [] temp = new int[arr.length];
		id=sc.nextInt();
		int [] res = reverseOfArray(arr, 0, temp);
		for(int j=0;j<i;j++){
			System.out.print(res[j]+" ");
		}
		System.out.println();
		System.out.println(temp[id]);

	}
	public static int [] reverseOfArray(int [] arr,int idx,int []temp){
		if(idx==arr.length){
			return temp;
		}
		temp[Math.abs(arr.length -1-idx)]=arr[idx];
	int rarr[]=	reverseOfArray(arr, idx+1,temp);
		return rarr;
		
		
	}

}
