package HackerRankAlgo;

import java.util.Scanner;

public class Anagram {
	//

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		String s;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		

		
			int count =0;
			int[] arr = new int[26];
			int[] arr1 = new int[26];
			s = sc.next();
			
			
			if(s.length() %2==1){
				System.out.println("-1");
				
				
			}
			else {
				for(int i=0;i<s.length()/2;i++){
					char x=s.charAt(i);
					arr[x-'a']++;
				}
				for(int i=s.length()/2;i<s.length();i++){
					char x=s.charAt(i);
					arr1[x-'a']++;
				}
				
				
			}
			for(int i=0;i<arr.length;i++){
			count+=	Math.abs((arr[i]-arr1[i]));
				
					
				}
			if(s.length() %2!=1)
			System.out.println(count/2);
			}
			

		

	}

