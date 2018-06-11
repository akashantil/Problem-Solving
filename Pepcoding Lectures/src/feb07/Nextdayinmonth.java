package feb07;

import java.util.Scanner;

public class Nextdayinmonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fday, numbdays;
		Scanner scn1 = new Scanner(System.in);
		System.out.println("Enter first day of this month");
		fday = scn1.nextInt();
		Scanner scn2 = new Scanner(System.in);
		System.out.println("enter  number of days in this month");
		numbdays = scn2.nextInt();

		int a = numbdays % 7;

		int nextfirstday = (fday + a) % 7;
		System.out.println("next first day of month is " + nextfirstday);

	}

}
