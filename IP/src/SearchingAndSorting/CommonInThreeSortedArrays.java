package temp;

import java.util.Scanner;

public class CommonInThreeSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] a = new int[soa];
		for (int i = 0; i < soa; i++) {
			a[i] = sc.nextInt();

		}
		
		int sob = sc.nextInt();
		int[] b = new int[sob];
		for (int i = 0; i < sob; i++) {
			b[i] = sc.nextInt();

		}
		
		int soc = sc.nextInt();
		int[] c = new int[soc];
		for (int i = 0; i < soc; i++) {
			c[i] = sc.nextInt();

		}
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<a.length && j<b.length && k<c.length){
			if(a[i]==b[j] && a[i]==c[k]){
				System.out.print(a[i]+" ");
				i++;
				j++;
				k++;
			}
			else if(a[i]<b[j] && a[i]<c[k]){
				i++;
				
			}
			else if(b[j]<a[i] && b[j]<c[k]){
				j++;
			}
			else if(c[k]<a[i] && c[k]<b[j]){
				k++;
				
			}
			
		}
		

	}

}
