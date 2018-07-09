package SegmentTree;

public class SegmentClient {

	public static void main(String[] args) {
		int[] arr = { 2, -5, 4, 11, -7, 6, 3, 8 };

		SegmentTree st = new SegmentTree(arr, new MinRangeOperator());
		st.display();

		System.out.println(st.query(3, 5));
		st.update(4, 15);
		System.out.println(st.query(3, 5));

	}

	
	
	
	
	
	
	
	public static class SumRangeOperator implements IRangeOperator {

		@Override
		public int operation(int op1, int op2) {
			// TODO Auto-generated method stub
			return op1 + op2;
		}

		@Override
		public int Identity() {
			// TODO Auto-generated method stub
			return 0;
		}

	}

	public static class DiffRangeOperator implements IRangeOperator {

		@Override
		public int operation(int op1, int op2) {
			// TODO Auto-generated method stub
			return op1 - op2;
		}

		@Override
		public int Identity() {
			// TODO Auto-generated method stub
			return 0;
		}

	}

	public static class ProdRangeOperator implements IRangeOperator {

		@Override
		public int operation(int op1, int op2) {
			// TODO Auto-generated method stub
			return op1 * op2;
		}

		@Override
		public int Identity() {
			// TODO Auto-generated method stub
			return 1;
		}

	}

	public static class MaxRangeOperator implements IRangeOperator {

		@Override
		public int operation(int op1, int op2) {
			// TODO Auto-generated method stub
			return Math.max(op1, op2);
		}

		@Override
		public int Identity() {
			// TODO Auto-generated method stub
			return Integer.MIN_VALUE;
		}

	}

	public static class MinRangeOperator implements IRangeOperator {

		@Override
		public int operation(int op1, int op2) {
			// TODO Auto-generated method stub
			return Math.min(op1, op2);
		}

		@Override
		public int Identity() {
			// TODO Auto-generated method stub
			return Integer.MAX_VALUE;
		}

	}

}
