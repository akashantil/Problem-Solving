package C14June27;

import java.util.Scanner;

public class FindCorrespondingExcelColumnName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int not = scn.nextInt();
		for (int i = 0; i < not; i++) {
			int num = scn.nextInt();

			String ans = "";

			while (num-- > 0) {

				char ch = (char) ('A' + (num % 26));
				ans = ch + ans;

				num /= 26;
			}
			System.out.println(ans);
		}

	}
	public static int getColNo(String inp){
		
	}

}
