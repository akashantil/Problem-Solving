package BackTracking;

import java.util.ArrayList;

public class PartitionAsetIntoKsubsetsWithEqualSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 5, 2, 1, 6 };
		int k = 3;
		int[] ssum = new int[k];
		String [] ssarr= new String[k];
		for(int i=0;i<ssarr.length;i++){
			ssarr[i]="";
		}
		
		kSubsets(arr, 0, ssum, ssarr, k);
		
		//method 2
		//
		
		ArrayList[] sets = new ArrayList[k];
		
		for(int i = 0; i < sets.length; i++){
			sets[i] = new ArrayList<>();
		}
		
		kSubsets2(arr, 0, ssum, sets, k);

	}

	public static void kSubsets(int[] arr, int idx, int ssum[], String ssarr[], int k) {
		if (idx == arr.length) {
			for (int i = 0; i < k - 1; i++) {
				if (ssum[i] != ssum[i + 1]) {
					
					return;

				}

			}
			System.out.println("Yes");
			for (int i = 0; i < k; i++) {
				System.out.print(ssarr[i] + "-->");
			}
			System.out.println(".");
			return;
		}

		for (int i = 0; i < k; i++) {
			ssum[i] += arr[idx];
			ssarr[i] += arr[idx] + " ";
			kSubsets(arr, idx + 1, ssum, ssarr, k);
			int tm = ssarr[i].length() - (arr[idx] + " ").length();
			String bp = ssarr[i].substring(0, tm);
			ssarr[i] = bp;
			ssum[i] -= arr[idx];
		}

	}

	//var2
	public static void kSubsets2(int[] arr, int idx, int ssum[], ArrayList[] sets, int k) {
		if(idx==arr.length){
			for(int i=0; i<ssum.length-1; i++){
				if(ssum[i]!=ssum[i+1])
					return;
			}
			
			for(int i = 0; i < sets.length; i++){
				System.out.print(sets[i] + "_");
			}
			System.out.println(".");
			return;
		}
		
		
		for(int i=0; i<k; i++){
			ssum[i]+=arr[idx];
			sets[i].add(arr[idx]);
			kSubsets2(arr, idx+1, ssum, sets, k);
			sets[i].remove(sets[i].size()-1);
			ssum[i]-=arr[idx];
		}
	}

}
