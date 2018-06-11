package BackTracking;

import java.util.ArrayList;

public class TugOfWar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {23, 45, -34, 12, 0, 98, -99, 4, 189, -1, 4};

		int target = suma(array, 0, 0);
		System.out.println(target);
		ArrayList<String> part1= new ArrayList<String>();
		ArrayList<String> part2= new ArrayList<String>();
		
		tugofwar(array, target, 0, 0, part1, part2);
	}

	public static int suma(int[] arr, int sum, int idx) {
		if (idx >= arr.length) {
			return sum / 2;
		}

		int a = suma(arr, sum + arr[idx], idx + 1);
		return a;
	}

	public static void tugofwar(int[] array, int target, int sum, int idx, ArrayList<String> part1,
			ArrayList<String> part2) {
		
		if(idx>=array.length){
			if(sum==target && part1.size()==part2.size() && array.length%2==0){
				
				System.out.println(" sum of first pair is -->"+ sum +"and other pair sum is -->" + target);
				System.out.println(part1);
				System.out.println(part2);
				return;
			}
			else if(sum==target && (Math.abs(part1.size()-part2.size())==1) && array.length%2==1){
				
				System.out.println(" sum of first pair is -->"+ sum +"  and other pair sum is -->" + (target +1));
				System.out.println(part1);
				System.out.println(part2);
				return;
			}
			return;
		}

		
		part1.add(array[idx]+"");
		tugofwar(array, target, sum + array[idx], idx + 1,part1,part2);
		part1.remove(part1.size()-1);
		part2.add(array[idx]+"");
		tugofwar(array, target, sum, idx + 1,part1,part2);
		part2.remove(part2.size()-1);

	}

}
