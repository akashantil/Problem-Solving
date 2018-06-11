package HackerRankAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class TwoCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.next();

		int[] arr = new int[26];
		for (int i = 0; i < s.length(); i++) {
		char x= s.charAt(i);
		arr[x-'a']++;
		}
	
		Arrays.sort(arr);
		int si=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){
				si++;
			}
		}
		int i=si;
		int cm=0;
		int om=0;
		int j=25;
		while(i<j){
			if((arr[j]-arr[i])==0 || (arr[j]-arr[i])==1){
				cm=arr[i]+arr[j];
				
				if(cm>om) om=cm;
				
				i++;
				continue;
				
			}
			else if((arr[j]-arr[i])>1){
				
				j--;
				continue;
				
			}
			
		}
		System.out.println(om);

	}

}
