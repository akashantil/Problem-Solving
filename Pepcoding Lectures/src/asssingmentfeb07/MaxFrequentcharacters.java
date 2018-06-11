package asssingmentfeb07;

import java.util.Scanner;

public class MaxFrequentcharacters {

	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		maxFrequent(s);

	}

	public static void maxFrequent(String s) {
		int count = 1;
		StringBuilder sb = new StringBuilder("");
		int i = 0;
		int j = s.length() - 1;
		int maxc = 0;
		char maxch = s.charAt(0);
		while (i < s.length()) {
			if (i<j && s.charAt(i) == s.charAt(j)) {
				count++;
				if (count > maxc) {
					maxc = count;
					maxch = s.charAt(i);
				}

				j--;
			}
			else if(i<j && s.charAt(i)!=s.charAt(j)){
				j--;
			}
			if(i==j ){
				i=i+1;
				j=s.length()-1;
				count =1;
			}
			

		}
		System.out.println(maxch);
	}
}
