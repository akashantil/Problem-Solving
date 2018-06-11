package HackerRankAlgo;

import java.util.Scanner;

public class SubstringinTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		String s1;
		String s2;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		for(int k=0;k<n;k++){
		
		int[] arr = new int[26];
		int[] arr1 = new int[26];
		
		s1 = sc.next();
		s2 = sc.next();

		for (int i = 0; i < s1.length(); i++) {
			char x = s1.charAt(i);
			arr[x - 'a']++;
		}
			for (int i = 0; i < s2.length(); i++) {
			char x = s2.charAt(i);
			arr1[x - 'a']++;
		}
		for(int i=0;i<26;i++){
			if(arr[i]>0&&arr1[i]>0){
				System.out.println("YES");
				break;
			}
			else if(i==25){
				System.out.println("NO");
				break;
			}
		}
	}

	}

}
