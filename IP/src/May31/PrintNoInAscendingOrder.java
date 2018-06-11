package May31;

import java.util.Arrays;

public class PrintNoInAscendingOrder {

	public static class pair implements Comparable<pair> {

		int no;
		boolean present;

		public pair(int no, boolean present) {

			this.no = no;
			this.present = present;

		}

		@Override
		public int compareTo(pair o) {
			// TODO Auto-generated method stub
			return this.no - o.no;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numbers[] = { 123, 1232, 456, 234, 32145 };

		pair[] arr = new pair[numbers.length];

		for (int i = 0; i < numbers.length; i++) {

			if (contains(numbers[i])) {
				pair a = new pair(numbers[i], true);
				arr[i] = a;

			} else {
				pair a = new pair(numbers[i], false);
				arr[i] = a;
			}
		}
		Arrays.sort(arr);
		for (int i = 0; i < numbers.length; i++){
			if(arr[i].present==true)
				System.out.print(arr[i].no+" ");
		}

	}

	public static boolean contains(int no) {

		String temp = Integer.toString(no);
		if (temp.contains("2") && temp.contains("1") && temp.contains("3"))
			return true;

		return false;
	}

}
