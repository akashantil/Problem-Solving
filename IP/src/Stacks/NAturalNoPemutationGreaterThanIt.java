package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class NAturalNoPemutationGreaterThanIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int no=sc.nextInt();
		System.out.println(print(no));

	}
	public static int print(int no){
		Stack<Integer> st = new  Stack<>();
		
		for(int i=1;i<=9 && i<no;i++){
			st.push(i);
			for(int j=i;j<=no && j<=9;j++){
				int fno=i*10+j;
				if(fno<=no)
					st.push(fno);
				else
					break;
				
			}
		}
		return st.size();
	}

}
