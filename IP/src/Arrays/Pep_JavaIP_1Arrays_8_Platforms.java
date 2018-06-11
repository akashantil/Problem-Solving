package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Pep_JavaIP_1Arrays_8_Platforms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();

		int[] arr = new int[soa];
		int[] dept = new int[soa];

		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < soa; i++) {
			dept[i] = sc.nextInt();
		}
	
		Arrays.sort(arr);
		Arrays.sort(dept);
		
		int i=0;
		int j=0;
		int nop=0;
		
		while(i<arr.length){
			if(arr[i]<dept[j]){
				nop++;
				i++;
			}
			else if(arr[i]>dept[j]){
				nop--;
				j++;
			}
			else{
				i++;
				j++;
			}
			
		}
		System.out.println(nop);
		

	}

}
