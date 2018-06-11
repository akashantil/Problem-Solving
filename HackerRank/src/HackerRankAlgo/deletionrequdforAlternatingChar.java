package HackerRankAlgo;

import java.util.Scanner;

public class deletionrequdforAlternatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		String s;
		String temp;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			StringBuilder sb = new StringBuilder("");
			
			s = sc.next();
			for (int j = 0; j < s.length() - 1; j++) {

				char c = s.charAt(j);

				char ne = s.charAt(j + 1);

				if (c !=ne) {
					sb.append(s.charAt(j));
					
				}
				

			}
			
				sb.append(s.charAt(s.length()-1));
				
				 temp=sb.toString();
			
			int dc=((s.length()-temp.length()));
			if(dc>0){
			System.out.println(dc);
			}
			else{
				System.out.println(0);
			}

		}

	}

}
