package NonCategory;

import java.util.Scanner;

public class Pep_Java_8NonCategory_9RajneeshAndHulk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int not = sc.nextInt();
		for (int i = 0; i < not; i++) {
			int soa = sc.nextInt();
			int[] arr = new int[soa];
			for (int i1 = 0; i1 < soa; i1++) {
				arr[i1] = sc.nextInt();

			}
			int k=0;
			while(k+3<arr.length){
				boolean res =isSorted(arr, k, k+3);
				if(res==true){
					k+=3;
				}
				
			}

		}

	}
	public static boolean isSorted(int[] arr,int idx,int eidx){
		if(idx==eidx){
			return true;
		}
		boolean res=false;
		if(arr[idx]<=arr[idx+1]){
			 res= isSorted(arr, idx+1, eidx);
		}
		else{
			return false;
		}
		return res;
	}

}
