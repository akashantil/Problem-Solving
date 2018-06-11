package Feb14;

import java.util.Scanner;

public class FunWithChars {

	public static void main(String[] args) {
		char a;
		Scanner sc = new Scanner(System.in);
		a = sc.next().charAt(0);
//		boolean case1 = false;
//		boolean case2 = false;
//		for (char ch = 'a'; ch <= 'z'; ch++) {
//			if (ch == a) {
//				System.out.println(ch);
//				case1 = true;
//
//			}
//		}
//		for (char ch = 'A'; ch <= 'Z'; ch++) {
//			if (ch == a) {
//				System.out.println(ch);
//				case2 = true;
//			}
//			
//		}
//		if (case1 == false && case2 == false)
//			System.out.println("enter valid character");
//
//
//		// TODO Auto-generated method stub
if(a>='a'&&a<='z'){
	System.out.println(a);
}
else if(a>='A'&&a<='Z'){
	System.out.println(a);
}
	else{
		System.out.println("enter valid character");
	}
}
	}


