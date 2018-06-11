package HackerRankAlgo;

import java.util.Scanner;

public class PalindromicPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1;
		
		Scanner sc = new Scanner(System.in);

		int count = 0;
		int[] arr = new int[26];
		
		s1 = sc.nextLine();
		

		for (int i = 0; i < s1.length(); i++) {
			char x = s1.charAt(i);
			arr[x - 'a']++;
		}
		
		if((s1.length())%2==0){
			for(int i=0;i<arr.length;i++){
				if(arr[i]%2==1){
					System.out.println("NO");
					return;
				}
				else{
					continue;
				}
			}
			System.out.println("YES");
		}
		else{
			for(int i=0;i<arr.length;i++){
				if(arr[i]%2==1 && count ==0){
					count =1;
					
				}
				else if(arr[i]%2==1 && count ==1){
					System.out.println("NO");
					return;
				}
				else{
					continue;
				}
				
			
		}
			System.out.println("YES");
	}

}
}
