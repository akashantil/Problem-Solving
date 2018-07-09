package FenwickTree;

public class FenwickTree {
	int[] farr;

	public FenwickTree(int[] arr) {

		farr = new int[arr.length + 1];

		for (int i = 0; i < arr.length; i++) {
			update(i, arr[i]);

		}

	}

	public int prefixSum(int index) {
		index++;

		int sum = 0;
		while (index > 0) {

			sum += farr[index];

			// this flips all bits from last set bit to lsb

			index -= Integer.lowestOneBit(index);

			// index &= (index - 1);

		}
		return sum;

	}

	public int querySum(int si, int ei) {
		return prefixSum(ei) - prefixSum(si - 1);
	}

	public void update(int idx, int delta) {
		idx++;
		while (idx < farr.length) {
			farr[idx] += delta;
			idx += Integer.lowestOneBit(idx);
		}
	}
}
