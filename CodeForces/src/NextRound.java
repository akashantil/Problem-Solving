import java.util.Scanner;

public class NextRound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int k=sc.nextInt();
		int[] arr = new int[soa];
		
		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();
		}
		int count=0;
		for(int a:arr){
			if(a>=arr[k-1] && a>0)
				count++;
		}
		System.out.println(count);
	}

}
