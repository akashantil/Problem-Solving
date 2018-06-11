
import java.util.Scanner;

public class sherlockString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		valid(s);
	}

	public static void valid(String s) {
		int[] arr = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			arr[ch - 'a']++;
		}

		int noc = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == 0 ) {
				continue;
			}
			if(arr[i+1]!=0){
			int diff = Math.abs(arr[i] - arr[i + 1]);
			if (diff == 0 && noc < 1) {
				continue;
			} else if (diff != 0 && noc == 0) {
				noc++;

			} else if (diff != 0 && noc == 1) {

				System.out.println("NO");
				return;

			}
			}

		}
		System.out.println("YES");
	}

}