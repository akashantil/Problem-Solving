package GeeksArraysArrangements;

import java.util.Scanner;

public class ReaarangementofpositiveandNegative {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int n;
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();

			}
			int i=-1;
			for(int j=0;j<n;j++){
				if(arr[j]<0){
					i++;
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			for(int b=0;b<n;b++){
				System.out.print(arr[b]+" ");
			}

	}

}
