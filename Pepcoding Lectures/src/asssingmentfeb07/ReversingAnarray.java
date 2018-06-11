package asssingmentfeb07;

import java.util.Scanner;

public class ReversingAnarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		int i = 0;
		int j = arr.length - 1;
		for( i=0;i!=j;i++){
			int temp;
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j--;
			
		}
for(int i1=0;i1<n;i1++){
	System.out.print(arr[i1]+" ");
}
	}

}
