package HackerRankAlgo;

import java.util.Scanner;

public class SherlockAndValidString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc = new Scanner(System.in);
		s=sc.next();
		int count =0;
		
		int [] arr = new int [26];
		for(int i=0;i<s.length();i++){
			char x= s.charAt(i);
			arr[x-'a']++;
		}
		for(int j=0;j<arr.length-1;j++){
			if(Math.abs(arr[j]-arr[j+1])==0 && count==0){
				continue;
				
			}
			else if(Math.abs(arr[j]-arr[j+1])==1 && count==0){
				count =1;
				arr[j+1]++;
				continue;
				
			}
			
			else if(Math.abs(arr[j]-arr[j+1])==0 && count==1){
				continue;
				
			}
			if(arr[j]!=0 &&arr[j+1]!=0){
			 if(Math.abs(arr[j]-arr[j+1])==1 && count==1){
				System.out.println("NO");
				return;
			}
			}
			if(arr[j]!=0 &&arr[j+1]!=0){
			 if(Math.abs(arr[j]-arr[j+1]) > 1 ){
				
				System.out.println("NO");
				return;
				
			}
			}
		}
		System.out.println("YES");
		

	}

}
