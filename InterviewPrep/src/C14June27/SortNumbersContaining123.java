package C14June27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class SortNumbersContaining123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();
		String [] temp = new String [soa];
		for (int i = 0; i < soa; i++)
			temp[i]=arr[i]+"";
		
		
		
		ArrayList<Integer> res= new ArrayList<>();
		for (int i = 0; i < soa; i++){
			if(temp[i].contains("1") && temp[i].contains("2")&&temp[i].contains("3")){
				res.add(Integer.parseInt(temp[i]));
			}
		}
		Collections.sort(res);
		System.out.println(res);
		

	}

}
