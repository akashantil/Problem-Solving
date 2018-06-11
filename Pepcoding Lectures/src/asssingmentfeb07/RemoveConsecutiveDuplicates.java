package asssingmentfeb07;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc = new Scanner(System.in);
		s=sc.nextLine();
		
		RemoveDuplicates(s);

	}
	public static void RemoveDuplicates(String s){
		StringBuilder sb = new StringBuilder("");
		for(int i=0;i<s.length()-1;i++){
			if(s.charAt(i)!=s.charAt(i+1)){
				sb.append(s.charAt(i));
			}
		}
		sb.append(s.charAt(s.length()-1));
		System.out.println(sb);
	}

}
