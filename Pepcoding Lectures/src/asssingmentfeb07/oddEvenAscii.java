package asssingmentfeb07;

import java.util.Scanner;

public class oddEvenAscii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc = new Scanner(System.in);
		s=sc.nextLine();
		evenpone(s);
		

	}
	public static void evenpone(String s){
		StringBuilder sb = new StringBuilder("");
		for(int i=0;i<s.length();i++){
			if(i%2==0){
				char x=s.charAt(i);
				x+=1;
				sb.append(x);
			}
			else if(i%2==1){
				char x=s.charAt(i);
				x-=1;
				sb.append(x);
			}
		}
		System.out.println(sb);
	}

}
