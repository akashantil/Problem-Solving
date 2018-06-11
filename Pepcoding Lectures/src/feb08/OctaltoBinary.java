package feb08;

import java.util.Scanner;

public class OctaltoBinary {

	public static void main(String[] args) {
		int sn;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no to convert");
		sn = sc.nextInt();
		int rem,bnum=0,bin=0,j=1;
		while(sn!=0){
			rem=sn%10;
		 switch(rem)
		 {
			         case 0:bin=000;break;					
					 case 1:bin=001;break;
					 case 2:bin=010;break;
					 case 3:bin=011;break;
					 case 4:bin=100;break;
					 case 5:bin=101;break;
					 case 6:bin=110;break;
					 case 7:bin=111;break;
					 
					 
		 }
		 bnum=bnum+bin*j;
		 j=j*1000;
		 sn=sn/10;
			
			
		}
		System.out.println(bnum);
		// TODO Auto-generated method stub

	}

}
