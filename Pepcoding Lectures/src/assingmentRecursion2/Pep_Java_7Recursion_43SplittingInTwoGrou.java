package assingmentRecursion2;

import java.util.ArrayList;
import java.util.Scanner;

public class Pep_Java_7Recursion_43SplittingInTwoGrou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		ArrayList<String> ab=Splitting(arr, 0, 0, 0, "", "");
		System.out.println(ab.size());
		System.out.println(ab);
		
		splitArray(arr, 0, 0, 0, "", "");
		
	}
	public static ArrayList<String> Splitting(int[]arr,int idx,int sum1,int sum2,String p1,String p2){
		if(idx==arr.length){
			if(sum1==sum2){
				ArrayList<String> result = new ArrayList<String>();
				result.add(p1 +" and "+p2);
				
				return result;
				
			}
			ArrayList<String> result = new ArrayList<String>();
			return result;
		}
		
		
		ArrayList<String> part1=Splitting(arr, idx+1, sum1+arr[idx], sum2, p1+arr[idx]+" ", p2);
		ArrayList<String> part2=Splitting(arr, idx+1, sum1, sum2+arr[idx], p1, p2+arr[idx]+" ");
		ArrayList<String> myresult = new ArrayList<String>();
		
		for(String ab:part1){
			myresult.add(ab);
		}
		for(String ab:part2){
			myresult.add(ab);
		}
		return myresult;
		
	}
	public static void splitArray(int[]arr,int idx,int s1,int s2,String p1,String p2){
		if(idx==arr.length){
			if(s1==s2){
				System.out.println(p1+"\t"+p2);
			}
			return;
		}
		
		
		
		splitArray(arr, idx+1, s1+arr[idx], s2, p1+arr[idx]+" ", p2);
		splitArray(arr, idx+1, s1, s2+arr[idx], p1, p2+arr[idx]+" ");
		
		
		
		
	}

}
