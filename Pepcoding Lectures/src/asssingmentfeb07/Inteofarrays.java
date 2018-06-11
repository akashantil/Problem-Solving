package asssingmentfeb07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Inteofarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr1 = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();

		}
		int m;
		m=sc.nextInt();
		int [] arr2 =new int[m];
		for (int i = 0; i < n; i++) {
			arr2[i] = sc.nextInt();

		}

		Intersection(arr1,arr2);


	}
public static void Intersection(int[]arr1,int []arr2){
	ArrayList<Integer> arli =new ArrayList<Integer>(arr1.length);
	
	int n=arr1.length;
	int m=arr2.length;

	
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			if(arr1[i]==arr2[j]){
				arli.add(arr2[j]);
				
				arr2[j]=arr2[m-1];
				m--;
				
				break;
			}
		}
		
	}
	Collections.sort(arli);
	System.out.println(arli);
}
}
