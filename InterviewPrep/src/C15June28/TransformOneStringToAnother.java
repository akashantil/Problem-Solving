package C15June28;

import java.util.Scanner;

public class TransformOneStringToAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a= sc.next();
		String b=sc.next();
		
		if(a.length()!=b.length()){
			System.out.println("Invalid");
			return;
		}
		int i=a.length()-1;
		int j=b.length()-1;
		int noc=0;
		while(i>=0){
			char ca= a.charAt(i);
			char cb= b.charAt(j);
			if(ca==cb){
				i--;
				j--;
			}
			else{
				i--;
				noc++;
			}
		}
		System.out.print(noc);

	}

}
