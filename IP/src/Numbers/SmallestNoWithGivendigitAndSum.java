package Numbers;

import java.util.Scanner;

public class SmallestNoWithGivendigitAndSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		int dig = sc.nextInt();
		String pre = "";
		String suff = "";

		while(dig>0) {

			if (sum < 9 * dig && sum <= 9 * (dig - 1) && dig != 1) {
				pre += "1";
				sum -= 1;
				
			} else if (sum < 9 * dig && sum > 9 * (dig - 1) && dig != 1) {
				suff += "9";
				sum -= 9;
				
			}
			else if(dig==1){
				pre+=sum;
				
			}
			dig--;

		}
		System.out.println(pre+suff);

	}

}
