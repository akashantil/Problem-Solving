package April1;

import java.util.ArrayList;

public class EquiSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
		printEquiSets(arr, 0, "", "", 0, 0);
		printEquiSetsArray(arr, 0, new ArrayList<>(), new ArrayList<>(), 0, 0);

	}

	public static void printEquiSets(int[] arr, int idx, String s1, String s2, int ss1, int ss2) {
		if (idx == arr.length) {
			if (ss1 == ss2) {
				System.out.println(s1 + "  -->  " + s2);
				return;
			}
			return;
		}

		printEquiSets(arr, idx + 1, s1 + arr[idx] + " ", s2, ss1 + arr[idx], ss2);
		printEquiSets(arr, idx + 1, s1, s2 + arr[idx] + " ", ss1, ss2 + arr[idx]);

	}

	public static void printEquiSetsArray(int[] arr, int idx, ArrayList<Integer> s1, ArrayList<Integer> s2, int ss1,
			int ss2) {
		if (idx == arr.length) {
			if (ss1 == ss2) {
				System.out.println(s1 + "  -->  " + s2);
				return;
			}
			return;
		}

		s1.add(arr[idx]);
		
		printEquiSetsArray(arr, idx + 1, s1, s2, ss1 + arr[idx], ss2);
		
		s1.remove(s1.size() - 1);
		
		s2.add(arr[idx]);
		
		printEquiSetsArray(arr, idx + 1, s1, s2, ss1, ss2 + arr[idx]);

		s2.remove(s2.size() - 1);

	}

}
