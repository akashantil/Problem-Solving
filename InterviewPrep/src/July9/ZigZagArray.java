package July9;

import java.util.Scanner;

public class ZigZagArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];

		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();
		}

		if (arr.length <= 2) {
			for (int i = 0; i < arr.length; i++)
				System.out.print(arr[i] + " ");
		} else {
			
			for(int i=1;i<arr.length-1;i+=2){
				int a=arr[i-1];
				int b=arr[i];
				int c=arr[i+1];
				
				if(a>b){
					int temp=a;
					a=b;
					b=temp;
				}
				if(b<c){
					int temp=b;
					b=c;
					c=temp;
					
				}
				
				arr[i-1]=a;
				arr[i]=b;
				arr[i+1]=c;
				
			}
			for (int i = 0; i < arr.length; i++)
				System.out.print(arr[i] + " ");

		}

	}

}
