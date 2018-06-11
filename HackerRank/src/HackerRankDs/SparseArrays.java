package HackerRankDs;

import java.util.Scanner;

public class SparseArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1;
		int n2;
		int count=0;
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n1++;
		
		String[] arr1 = new String[n1];
		
		for (int i = 0; i < n1; i++) {
			arr1[i] = sc.nextLine();
		}
		n2 = sc.nextInt();
		n2++;
		String[] arr2 = new String[n2];
		for (int i=0;i<n2;i++){
			arr2[i]=sc.nextLine();
		}
		
		
		for(int i=0;i<arr2.length;i++){
			count=0;
			for(int j=0;j<arr1.length;j++){
				String a1=arr1[j];
				String a2=arr2[i];
				if(a1.equals(a2)){
					count++;
				}
			}
			System.out.println(count);
		}

	}

}
