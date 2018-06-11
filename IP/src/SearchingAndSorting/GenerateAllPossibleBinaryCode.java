package temp;

import java.util.Scanner;

public class GenerateAllPossibleBinaryCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String ques= sc.nextLine();
		
		char [] arr = ques.toCharArray();
		allpossiblecode(arr, 0, "");
		
		

	}
	public static void allpossiblecode(char [] arr,int idx,String ans){
		if(idx==arr.length){
			System.out.println(ans);
			return;
			
			
		}
			
		
		
		if(arr[idx]=='?'){
			arr[idx]='0';
			allpossiblecode(arr, idx+1,ans+0);
			arr[idx]='1';
			allpossiblecode(arr, idx+1,ans+1);
			arr[idx]='?';
		}
		else 
			allpossiblecode(arr, idx+1,ans+arr[idx]);
		
		
	}

}
