package C06July19;

import java.util.HashMap;
import java.util.Scanner;

public class MinSwapsToMakeTwoArrayIdentical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();

		int[] temp = new int[soa];
		for (int i = 0; i < soa; i++)
			temp[i] = sc.nextInt();

		int[] index = new int[soa];

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < soa; i++)
			map.put(arr[i], i);
		for (int i = 0; i < soa; i++) {
			index[i] = map.get(temp[i]);
		}

		// for(int i=0;i<soa;i++){
		// int j=i;
		// while(temp[j]!=arr[i]){
		// j++;
		//
		// }
		// index[i]=j;
		// }
		int mnos = 0;
		for (int i = 0; i < soa; i++) {
			while (index[i] != i) {
				mnos++;
				int temp1 = temp[i];
				temp[i] = temp[index[i]];
				temp[index[i]] = temp1;

				temp1 = index[i];
				index[i] = index[index[i]];
				index[temp1] = temp1;

			}

		}
		System.out.println(mnos);

	}

}
