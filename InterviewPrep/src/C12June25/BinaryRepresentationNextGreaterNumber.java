package C12June25;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryRepresentationNextGreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		char[] arr = a.toCharArray();

		int si = -1;

		for (int i = a.length() - 1; i > 0; i--) {
			int curr = a.charAt(i) - '0';
			int prev = a.charAt(i - 1) - '0';
			if (curr <= prev)
				continue;
			else {
				si = i - 1;
				break;
			}

		}
		
		if(si>=0){
		arr[si] = '1';

		for (int i = si + 1; i < arr.length; i++) {
			if (arr[i] == '1') {
				arr[i] = '0';
				break;
			}
		}

		String bp = "";
		for (int i = 0; i <= si; i++) {
			bp += arr[i];
		}
		String ap = "";
		for (int i = si + 1; i < arr.length; i++) {
			ap += arr[i];
		}
		char[] temp = ap.toCharArray();
		Arrays.sort(temp);
		ap = "";
		for (int i = 0; i < temp.length; i++) {
			ap += temp[i];
		}

		System.out.println(bp + ap);

	}
	
	else
		System.out.println(si);
	}

}
