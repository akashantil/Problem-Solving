package asssingmentfeb07;

import java.util.Scanner;

public class ToggleCharacters {

	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		s=sc.nextLine();
		ToggleAllCharacters(s);
		
	}
	public static void ToggleAllCharacters(String s){
		StringBuilder sb = new StringBuilder("");
		for(int i=0;i<s.length();i++){
			char x= s.charAt(i);
			if(x>='a'&& x<='z'){
				x=(char)(x-'a'+'A');
				
				
			}
			else if(x>='A'&&x<='Z'){
				x=(char)(x-'A'+'a');
			}
			else{
				x=x;
			}
			sb.append(x);
			
		}
		System.out.println(sb);
		
	}

}
