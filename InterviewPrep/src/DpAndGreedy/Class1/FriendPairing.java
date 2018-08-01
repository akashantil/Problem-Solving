package DpAndGreedy.Class1;

import java.util.Scanner;

public class FriendPairing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int no=sc.nextInt();
		int [] arr = new int [no+1];
//		int count=2;
//		int first=1;
//		int sec=2;
//		
//		
//		
//		while(count<no){
//		int third=first + (no-1)*sec;
//		count++;
//		first=sec;
//		sec=third;
//		no--;
//		}
//		System.out.println(sec);
//		
		arr[0]=0;
		arr[1]=1;
		arr[2]=2;
		
		for(int i=3;i<arr.length;i++){
			arr[i]=arr[i-1]+arr[i-2]*(i-1);
		}
		
		System.out.println(arr[no]);
		
		

	}

}
