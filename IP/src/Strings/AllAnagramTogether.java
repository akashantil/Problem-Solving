package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class AllAnagramTogether {

	public static class pair implements Comparable<pair> {
		int idx;
		String q;

		pair(int idx, String q) {
			this.idx = idx;
			this.q = q;
		}

		

		@Override
		public int compareTo(pair o) {
			// TODO Auto-generated method stub
			return this.q.compareTo(o.q);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		String[] arr = new String[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.next();
		
		pair [] res = new pair [soa];
		
		for(int i=0;i<soa;i++){
			int [] fmap = new int[26];
			for(int j=0;j<arr[i].length();j++){
				char ch=arr[i].charAt(j);
				fmap[ch-'a']++;
			}
			String ss="";
			for(int j=0;j<26;j++){
				while(fmap[j]!=0){
					char ch=(char)('a'+j);
					ss+=ch;
					fmap[j]--;
				}
			}
			
			pair a= new pair(i,ss);
			res[i]=a;
		}
		Arrays.sort(res);
		
		for(int i=0;i<soa;i++){
			System.out.println(arr[res[i].idx]);
		}
		

	}
	
	

}
