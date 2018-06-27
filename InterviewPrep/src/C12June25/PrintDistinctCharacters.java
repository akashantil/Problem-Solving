package C12June25;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDistinctCharacters {

	public static class Pair implements Comparable<Pair> {
		char ch;
		int idx;
		int freq;

		@Override
		public int compareTo(Pair o) {
			// TODO Auto-generated method stub
			return this.idx - o.idx;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		Pair[] arr = new Pair[26];

		for (int i = 0; i < 26; i++) {
			Pair a = new Pair();
			a.ch = '0';
			a.idx = -1;
			a.freq = 0;
			arr[i]=a;

		}
		for (int i = 0; i < inp.length(); i++) {
			char ch = inp.charAt(i);
			arr[ch - 'a'].freq++;
			arr[ch - 'a'].idx = i;
			arr[ch - 'a'].ch = ch;

		}

		Pair[] temp = new Pair[26];
		
		for (int i = 0; i < 26; i++) {
			Pair a = new Pair();
			a.ch = '0';
			a.idx = -1;
			a.freq = 0;
			temp[i]=a;

		}

		
		
		
		int idx = 0;

		for (int i = 0; i < 26; i++) {
			if (arr[i].freq == 1) {
				temp[idx] = arr[i];
				idx++;
			}
		}
		Arrays.sort(temp);
		for(int i=0;i<26;i++){
			if(temp[i].freq==1){
				System.out.print(temp[i].ch);
				
			}
		}

	}

}
