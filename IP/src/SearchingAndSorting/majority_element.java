package temp;

import java.util.Scanner;

public class majority_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// element occuring more than n/2 times is called majority element

		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();

		}

		int idx = 0;
		int count = 1;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == arr[idx])
				count++;
			else if (arr[i] != arr[idx] && count != 0)
				count--;
			else if (arr[i] != arr[idx] && count == 0) {
				idx = i;
				count = 1;
			}

		}
		int fc=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==arr[idx]){
				fc++;
			}
		}
		if(fc>(arr.length/2))
			System.out.println("Majority Elemt is "+ arr[idx]);
		else{
			System.out.println("No Majority Element Exist");
		}

	}

}
