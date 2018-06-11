package asssingmentfeb07;

import java.util.Scanner;

public class CompressionwithCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();

		compression(s);
	}

	public static void compression(String s) {
		int count = 1;
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < s.length()-1; i++) {

			if (s.charAt(i) == s.charAt(i + 1)) {
				count++;

			} else if (s.charAt(i) != s.charAt(i + 1)) {
				sb.append(s.charAt(i));
				if (count > 1) {
					sb.append(count);
					count=1;
				}
			}
		}
		sb.append(s.charAt(s.length()-1));
		if(count>1){
			sb.append(count);
		}
		System.out.println(sb);
	}

}
