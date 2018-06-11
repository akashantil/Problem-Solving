package Arrays;

import java.util.Scanner;

public class CircularPetrolPump {

	public static class pair {
		int fuel;
		int dist;

		pair(int fuel, int dist) {
			this.fuel = fuel;
			this.dist = dist;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		pair[] arr = new pair[soa];

		for (int i = 0; i < soa; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			pair ab = new pair(x, y);
			arr[i] = ab;
		}

		int si = 0;
		int sub = 0;
		int pet = 0;
		for (int i = 0; i < soa; i++) {

			pet += arr[i].fuel;

			if (pet - arr[i].dist >= 0) {
				pet=pet-arr[i].dist;
				

			} else {
				sub = pet - arr[i].dist;
				pet = 0;
				si = i+1;

			}

		}
		if (pet + sub >= 0) {
			System.out.println(si);
		} else {
			System.out.println("Not Possible");
		}

	}

}
