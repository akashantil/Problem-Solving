package Arrays;

import java.util.Scanner;

public class Pep_JavaIP_1Arrays_5Zigzag {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();

		int[] arr = new int[soa];

		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();
		}
		boolean lessthan = true;
		for(int i=0;i<arr.length-1;i++){
			if(lessthan==true && arr[i]<arr[i+1]){
				lessthan=false;
			}
			else if(lessthan==true && arr[i]>arr[i+1]){
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				lessthan=false;
			}
			else if(lessthan==false && arr[i]<arr[i+1]){
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				lessthan=true;
			}
			else if(lessthan==false && arr[i]>arr[i+1]) {
				lessthan=true;
			}
			
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}

	}

}
