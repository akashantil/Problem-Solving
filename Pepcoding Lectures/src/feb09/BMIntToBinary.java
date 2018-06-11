package feb09;

import java.util.Scanner;

public class BMIntToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte no;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no");
		no = sc.nextByte();
		byte temp;
			
		for (byte i = 7; i >=0; i--) {

			byte fb = (byte) ((1) << i);
			temp = (byte) (no & fb);
			if(temp!=0){
				System.out.print("1");
			}
			else{
				System.out.print("0");
			}
			
		}

	}

}