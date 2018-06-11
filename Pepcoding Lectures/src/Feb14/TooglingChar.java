package Feb14;

import java.util.Scanner;

public class TooglingChar {

	public static void main(String[] args) {
		char a;
		char up;
		char lo;
		Scanner sc = new Scanner(System.in);
		a = sc.next().charAt(0);
		if(a>='a'&&a<='z'){
			up=(char) (a+'A'-'a');
			System.out.println(up);
			
			
		}
		else if(a>='A'&&a<='Z'){
			lo=(char) (a+'a'-'A');
			System.out.println(lo);
		}
			else{
				System.out.println("enter valid character");
			}

		
		// TODO Auto-generated method stub

	}

}
