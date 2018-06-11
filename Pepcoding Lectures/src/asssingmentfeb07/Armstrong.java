package asssingmentfeb07;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int no,sr,er;
		Scanner sc = new Scanner(System.in);
		no=sc.nextInt();
		sr=sc.nextInt();
		er=sc.nextInt();
		
		int flag=IsArmstrong(no,er);
		if(no==flag){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		ArmstrongRange(sr,er);
			
		// TODO Auto-generated method stub

	}
	public static int IsArmstrong(int no,int er){
		int flag=0;
		int nd=0;
		
		while(er>0){
			er/=10;
			nd++;
		}
		//System.out.println(nd);
		int sum=0;
		int ano =no;
		while(ano>0){
			int rem=ano%10;
			sum=(int) (sum+Math.pow(rem, nd));
			ano/=10;
		}
//		System.out.println(sum + " "+ no);
		if(sum==no){
			//System.out.println("True");
			flag=1;
		
		}
		else flag=0;
		
		return sum;
		
		//System.out.println("False");
		
		
	}
	public static void ArmstrongRange(int sr,int er){
		for(int i=sr;i<=er;i++){
			int arm=IsArmstrong(i,er);
			if(arm==i){
				System.out.print(arm +" ");
			}
			else{
				
			}
		}
		
	}

}
