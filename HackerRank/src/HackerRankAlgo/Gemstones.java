package HackerRankAlgo;

import java.util.Scanner;

public class Gemstones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		String s;

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			s = sc.next();
			
			if(i==0){

			for (int j = 0; j < s.length(); j++) {
				char x = s.charAt(j);
				arr[x - 'a'] += 1;
			}
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] > i+1) {
					arr[j] = i+1;
				}
			}
			
			}
			else{
				for (int j = 0; j < s.length(); j++) {
					char x = s.charAt(j);
					if(arr[x-'a']==0){
						//means previous string doesnt contain these characters so leave them
					}
					else{
						
					
					arr[x - 'a'] += 1;
					}
				}
				for (int j = 0; j < arr.length; j++) {
					if (arr[j] > i+1) {
						arr[j] = i+1;
					}
					else if(arr[j]<i+1){
						arr[j]=0;
					}
			}
		}
		}
		int count =0;

		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] == n){
				count++;
//				char x = (char) (i+'a');
			}
			
			
				
		}
		System.out.println(count);

	}

}
