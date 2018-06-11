package GeeksArraysArrangements;

public class createSortedarrayFromTwoSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 10, 15, 25 };
		int[] b = { 1, 5, 20, 30 };
		print(a, b, 0, 0, Integer.MIN_VALUE, "", false, false);

	}

	public static void print(int[] a, int[] b, int idxa, int idxb, int lno, String asf, boolean aa, boolean ab) {
		if (idxa == a.length -1 && idxb == b.length-1 && aa == true && ab == true) {
			System.out.println(asf);
			return;
		}
		if(isValid(a, idxa, b, idxb)==false){
			return;
		}
		if (a[idxa] > lno)
			print(a, b, idxa + 1, idxb, a[idxa], asf + a[idxa] + " ", true, ab);

		print(a, b, idxa + 1, idxb, lno, asf, aa, ab);
		if (b[idxb] > lno)
			print(a, b, idxa, idxb + 1, b[idxb], asf + b[idxb] + " ", aa, true);

		print(a, b, idxa, idxb + 1, lno, asf, aa, ab);

	}
	public static boolean isValid(int[] a,int idxa,int[]b ,int idxb){
		if(idxa>=a.length){
			return false;
		}
		else if(idxb>=b.length){
			return false;
		}
		else{
			return true;
		}
		
	}

}
