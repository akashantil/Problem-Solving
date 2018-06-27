package C12June25;

import java.util.Scanner;

public class FindFirstNonRepeatingCharacter {

	public static class Pair {
		char ch;
		int ind;
		int freq;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		Pair[] arr = new Pair[26];
		for (int i = 0; i < 26; i++) {
			Pair j = new Pair();
			j.ch = (char) ('a' + i);
			j.freq = 0;
			j.ind = 0;
			arr[i] = j;
		}

		for (int i = 0; i < inp.length(); i++) {
			char ch = inp.charAt(i);
			arr[ch - 'a'].freq++;
			arr[ch - 'a'].ind = i;

		}
		int miidx = Integer.MAX_VALUE;
		char ch = '0';

		for (int i = 0; i < 26; i++) {
			if (arr[i].freq == 1 && arr[i].ind < miidx){
				miidx=arr[i].ind;
				ch = arr[i].ch;
			}

		}
		System.out.println(ch);

	}

}
