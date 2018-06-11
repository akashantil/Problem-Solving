package feb08;

import java.util.Scanner;

public class BinaryToOctal {

	public static void main(String[] args) {
		int sn;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no to convert");
		sn = sc.nextInt();
		int j = 1, rem, oct=0 ,foct=0;
		while (sn != 0) {
			rem = sn % 1000;
			switch (rem) {
			case 0:
				oct = 0;
				break;
			case 1:
				oct = 1;
				break;
			case 10:
				oct = 2;
				break;
			case 11:
				oct = 3;
				break;
			case 100:
				oct = 4;
				break;
			case 101:
				oct = 5;
				break;
			case 110:
				oct = 6;
				break;
			case 111:
				oct = 7;
				break;
			}
			foct = foct + oct * j;
			j = j * 10;
			sn = sn / 1000;
		}
		System.out.println(foct);

		// TODO Auto-generated method stub

	}

}
