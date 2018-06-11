package BitMAnipulation;

import java.util.Scanner;

public class JosephusProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();

		// works if k=2;

		int prev = 0;
		int curr = 0;
		for (int i = 0; i < no; i++) {

			curr = (1 << i);
			if(curr==no){
				System.out.println(1);
				return;
			}
			if (curr > no && prev < no) {
				break;
			}
			prev = curr;

		}
		int len=no-prev;
		System.out.println(2*len +1);

	}

}
