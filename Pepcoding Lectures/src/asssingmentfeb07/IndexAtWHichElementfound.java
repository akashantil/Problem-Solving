package asssingmentfeb07;

import java.util.Scanner;

public class IndexAtWHichElementfound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		int x;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		x=sc.nextInt();
		
		for(int i=0;i<n;i++){
			if(x<0){
				System.out.println("Invalid Input");
				return;
				
			}
			else if(arr[i]==x){
				System.out.println(i);
				return;
			}
		}

		System.out.println("-1");
	}

}



