
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
 
class Main{
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int not = sc.nextInt();
		for (int i = 0; i < not; i++) {
			int soa = sc.nextInt();
			int k = sc.nextInt();
 
			
 
			int[] arr = new int[soa];
			for (int j = 0; j < soa; j++) {
				
				arr[j] = sc.nextInt();
			}
			Arrays.sort(arr);
 
			
			System.out.println(solve3(arr, k));
		
//		
 
		}
		//
 
	}
 
	public static long nck(int n, int k) {
 
		long num = 1;
		long deno = 1;
		if (k == 0)
			return 1;
		for (int i = 1; i <= k; i++) {
			num *= n;
			n--;
			deno *= i;
 
		}
		return num / deno;
 
	}
 
	public static long power(int base, int expo) {
		if (expo == 0)
			return base;
		if (expo == 1)
			return base;
 
		long res = power(base, expo / 2);
 
		if (expo % 2 == 0)
			return ((res * res) % 1000000007);
		else {
			return ((base) * ((res * res) % 1000000007) % 1000000007);
		}
 
	}
 
	public static long not(int n, int k) {
		long nos = nck(n, k);
		nos *= k;
		return nos / n;
	}
 
	
 
	public static int solve3(int[] arr, int k) {
 
		int product = 1;
		int n = arr.length;
		int st = 0;
		int en = arr.length - 1;
		int onot = (int) not(n, k);
		int osize = n;
		int csize = osize;
		int loop = osize - k + 1;
		st++;
		en--;
 
		csize -= 2;
 
		for (int i = 0; i < loop && csize > 0 && st <= en; i++) {
 
			if (csize != 1) {
 
				int start = (int) nck((osize - st - 1), k - 1);
				int noOfMinEle = st;
				int end = (int) nck(noOfMinEle, k - 1);
 
				int pow = onot - start - end;
				int currmin = arr[st];
				int currmax = arr[en];
				st++;
				en--;
 
				product = (int) ((product * power(currmin, pow)) % 1000000007);
				product = (int) ((product * power(currmax, pow)) % 1000000007);
			} else {
 
				//
				int start = (int) nck((osize - st - 1), k - 1);
				int noOfMinEle = st;
				int end = (int) nck(noOfMinEle, k - 1);
				int pow = onot - start - end;
 
				int currmin = arr[st];
				st++;
 
				product = (int) ((product * power(currmin, pow)) % 1000000007);
 
			}
 
			csize -= 2;
 
		}
 
		return product;
 
	}
 
 
 
 
}