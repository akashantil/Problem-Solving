package asssingmentfeb07;

import java.util.Scanner;

public class REverseandMirrorInvers {

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		IsMirrorInverse(arr);

	}

	public static void IsMirrorInverse(int[] arr1) {
		int flag = 1;
		int[] inverse = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			inverse[arr1[i]]=i;
					}
		for(int i=0;i<arr1.length;i++){
			System.out.print(inverse[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr1.length;i++){
			if(arr1[i]==inverse[i]){
				flag=0;
			}
			else{
				System.out.println("false");
				return;
			}
		}
		
		if(flag==0){
			System.out.println(true);
		}
	}

}
