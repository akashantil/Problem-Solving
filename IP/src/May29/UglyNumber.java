package May29;

public class UglyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 150;
		int[] arr = new int[no];

		arr[0] = 1;
		int a = 0;
		int b = 0;
		int c = 0;

		for (int i = 1; i < no; i++) {

			int pa = 2 * arr[a];
			int pb = 3 * arr[b];
			int pc = 5 * arr[c];

			if (pa < pb && pa < pc) {
				arr[i] = pa;
				a++;
			} else if (pb < pa && pb < pc) {
				arr[i] = pb;
				b++;
			} else if (pc < pb && pc < pa) {
				arr[i] = pc;
				c++;
			}

			else if (pa == pb && pa < pc) {
				arr[i] = pb;
				a++;
				b++;

			}

			else if (pa == pc && pa < pb) {
				arr[i] = pa;
				a++;
				c++;

			}

			else if (pb == pc && pb < pa) {
				arr[i] = pb;
				c++;
				b++;

			} else {
				arr[i] = pa;
				a++;
				b++;
				c++;
			}

		}
		System.out.println(arr[arr.length - 1]);

	}

}
