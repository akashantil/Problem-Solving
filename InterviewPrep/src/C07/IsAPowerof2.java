package C11;

import java.util.Scanner;

public class IsAPowerof2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int not = sc.nextInt();
		for(int i=0;i<not;i++){
			
		int no=sc.nextInt();
		
		if((no & (no-1))!=0){
			System.out.println("False");
			
		}
		else{
			System.out.println("True");
		}
		}
	}

}
