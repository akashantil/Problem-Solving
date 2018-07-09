package FenwickTree;

public class SegmentTreeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, -5, 4, 11, -7, 6, 3, 8 };

		FenwickTree ft = new FenwickTree(arr);
		System.out.println(ft.querySum(2, 5));

	}

}
