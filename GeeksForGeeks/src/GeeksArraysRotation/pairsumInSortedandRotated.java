package GeeksArraysRotation;

import java.util.Scanner;

public class pairsumInSortedandRotated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int s;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		s = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}

		int maxi = 0, mini = 0;
		int maxe = Integer.MIN_VALUE;
		int mine = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			if (arr[i] > maxe) {
				maxe = arr[i];
				maxi = i;
			}
			mini=(maxi+1)%arr.length;
			mine=arr[mini];

		}
		
		
		int m=arr.length;
		while(mini!=maxi){
			
			if(arr[mini]+arr[maxi]<s){
				mini=(mini+1)%m;
			}
			else if(arr[mini]+arr[maxi]>s){
				maxi=(maxi-1)%m;
			}
			else if(arr[mini]+arr[maxi]==s){
				System.out.println("Pair is -->"+ arr[mini]+" "+arr[maxi]);
				if(maxi>0&&mini<m){
				break;
			}
				
			
		}

	}
	}

}
