package assingmentRecursion;

import java.util.Scanner;

public class removeHiwithoutHit {

	public static void main(String[] args) {
		int i;
		String s;

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder("");
		s = sc.next();
		i = sc.nextInt();

		StringBuilder a = removeHi(s, false, sb, 0);
		
		System.out.println(a.charAt(i));
		System.out.println(a);

	}

	
	public static StringBuilder removeHi(String s, boolean c, StringBuilder sb, int idx) {

		if (idx + 1 >= s.length()) {
			if ((s.charAt(s.length() - 2) == 'h' && s.charAt(s.length() - 1) == 'i')) {
				return sb;
			}
			else {
				sb.append(s.charAt(s.length()-1));
				return sb;
			}

			
		}
		char x = s.charAt(idx);
		char y = s.charAt(idx + 1);
		if (x == 'h' && y == 'i') {
			if(idx+2<s.length()){
				if(s.charAt(idx+2)!='t'){
					sb.append("pep");
				}
				else{
					
				}
			}
			else{
				sb.append("pep");
			}
			c = true;

			return removeHi(s, c, sb, idx + 1);

		} else if (x == 'i' && c == true && y=='t') {
			
			sb.append("hi");
			c = false;
			return removeHi(s, c, sb, idx + 1);
		}
		
		 else if (x == 'i' && c == true ) {
			 
				
				c = false;
				return removeHi(s, c, sb, idx + 1);
			}

		else {
			sb.append(x);
			return removeHi(s, false, sb, idx + 1);

		}

	}

}
