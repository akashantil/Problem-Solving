package Strings;

import java.util.Scanner;

public class SmallestWindowThatContainAllCharOFString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String ques = sc.nextLine();

		char[] arr = ques.toCharArray();
		

		boolean[] unique = new boolean[26];
		for (int i = 0; i < arr.length; i++) {
			char x = arr[i];
			if (unique[x - 'a'] == false)
				unique[x - 'a'] = true;

		}

		int[] check = new int[26];
		int start = 0;
		int end = 0;
		int ml = Integer.MAX_VALUE;

		while (true) {

			if (checkvalid(check, unique) == false) {
				check[arr[end] - 'a']++;
				end++;
			} else {
				check[arr[start] - 'a']--;
				start++;
			}

			if (checkvalid(check, unique) == true && (end - start) < ml) {
//				System.out.println(ques.substring(start, end));
				ml = end - start + 1;
			}
			
			if (end == arr.length) {
				break;
			}
		}
		
		while(start < arr.length){
			if (checkvalid(check, unique) == true) {
				
//				System.out.println(ques.substring(start, end));
				check[arr[start] - 'a']--;
				start++;
				ml = end - start+1;
			} else {
				break;
			}
		}

		System.out.println(ml);
		

	}

	public static boolean checkvalid(int[] check, boolean[] tobechecked) {

		for (int i = 0; i < tobechecked.length; i++) {
			if (tobechecked[i] == true) {
				if (check[i] > 0)
					continue;
				else
					return false;
			}
		}
		return true;
	}

}
