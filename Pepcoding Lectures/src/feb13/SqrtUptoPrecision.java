package feb13;
//Doubt
import java.util.Scanner;

public class SqrtUptoPrecision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no, prc;
		Scanner sc = new Scanner(System.in);
		no = sc.nextInt();
		prc = sc.nextInt();
		double fno = 0;
		double ipr = 0;
		double inc=1.0;
		while (ipr <= prc) {

			while (fno * fno <= no) {
				fno = fno + inc;
				

			}
			fno=fno-inc;
			inc=inc*0.1;
			ipr++;

		}
		
		System.out.println(fno);

	}

}
