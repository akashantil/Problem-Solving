package BitMAnipulation;

import java.util.Scanner;

public class CountSetBitsFrom1ton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int num=no;

		
		int ans = 0;
		int count=countbits(no);
		System.out.println(count);
		
		

		for(int i=1;i<=count;i++){

			ans+=(1<<i-1)*((num+1)/(1<<i));
			int factor=1<<i;
			int rem=(num+1)%(1<<i);
			if(factor-rem < factor/2) {
				ans+=rem-factor/2;
			}

		}
		System.out.println(ans);
	}
	public static int countbits(int no){
		
		int b=0;
		while(no>0){
			no/=2;
			b++;
		}
		return b;
	}

}
