package HackerRankDs;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2;
		Scanner sc = new Scanner(System.in);

		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		int c = 0;
		int in1 = 0;
		int lastAnswer = 0;
		ArrayList<Integer> seq1 = new ArrayList<Integer>();
		ArrayList<Integer> seq2 = new ArrayList<Integer>();
		while (c < n2) {
			
			int x=sc.nextInt();
			int y=sc.nextInt();
			int z=sc.nextInt();

			
			int sno = ((y ^ lastAnswer) % n1);
			if (x == 1) {// means query 1

				if (sno == 0) {
					seq1.add(z);

				} else if (sno == 1) {
					seq2.add(z);

				}
			} else if (x == 2) {// means query 2
				if (sno == 0) {
					seq1.add(z);

					lastAnswer = (seq1.get(in1));
					in1++;

					System.out.println(lastAnswer);
				} else if (sno == 1) {
					seq2.add(z);

					lastAnswer = (seq2.get(in1));
					in1++;

					System.out.println(lastAnswer);

				}
				c++;
			}

		}

	}
}
