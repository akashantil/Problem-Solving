package SearchingAndSorting;

public class SAS_20FindtwoReapeatingfrom1ton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 2, 4, 5, 2, 3, 1 };

		int n = 5;
		int[] count = new int[n + 1];

		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;

		}
		for (int i = 1; i < count.length; i++) {
			if (count[i] != 1)
				System.out.println(i);
		}

		findingrepeating(arr);
		

	}

	public static void findingrepeating(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[Math.abs(arr[i])] > 0)
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			else
				System.out.print(Math.abs(arr[i]) + " ");

		}
	}

}
