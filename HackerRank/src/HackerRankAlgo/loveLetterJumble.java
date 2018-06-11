package HackerRankAlgo;

import java.util.Scanner;

public class loveLetterJumble {

	public static void main(String[] args) {
		int n;
		String s ;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(int j=0;j<n;j++){
		s=sc.next();
		
		int count =0;
		char [] arr = new char[s.length()];
		arr=s.toCharArray();
		int i=0;
		int k=arr.length-1;
		while(i<k){
			
			if(arr[i]!=arr[k]){
				count+=Math.abs((arr[k]-arr[i]));
				
			}
			k--;
			i++;
			
			
		}
		System.out.println(count);
		
		}
	}

}
