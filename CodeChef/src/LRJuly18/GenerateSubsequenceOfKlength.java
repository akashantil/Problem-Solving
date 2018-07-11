package LRJuly18;

import java.util.ArrayList;

public class GenerateSubsequenceOfKlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   int [] arr={1,3,4,7,8,9,10};
	   int k=4;
	   solve(arr,k,0,new ArrayList<>());
	   
	}

	private static void solve(int[] arr, int k, int idx,ArrayList<Integer> res) {
		if(res.size()==k){
			System.out.println(res);
			return;
		}
		if(idx==arr.length)
			return;
		
		
		res.add(arr[idx]);
		solve(arr, k, idx+1,res);
		res.remove(res.size()-1);
		solve(arr, k, idx+1, res);
		
	}

}
