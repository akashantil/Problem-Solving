package NonCategory;

import java.util.Scanner;

public class Pep_Java_8NonCategory_7_UjjwalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int not = sc.nextInt();

		for (int j = 0; j < not; j++) {
			int soa = sc.nextInt();
			int[] arr = new int[soa];
			for (int i = 0; i < soa; i++) {
				arr[i] = sc.nextInt();

			}
			int cl=0;
			int ml=0;
			int s=0;
			int e=arr.length-1;
			while(s<arr.length){
			 e=arr.length-1;
				while(e>s){
					if(arr[s]>arr[e]){
						cl=(e-s)+1;
						if(ml<cl){
							ml=cl;
							
						}
					}
					e--;
				}
				s++;
			}
			System.out.println(ml);

		}

	}

}
