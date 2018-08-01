package DpAndGreedy;

import java.util.Scanner;

public class LcsOfTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b=sc.next();
		String c= sc.next();
		
		int [][][]arr = new int [a.length()+1][b.length()+1][c.length()+1];
		
		
		for(int i=1;i<=a.length();i++){
			char ca=a.charAt(i-1);
			for(int j=1;j<=b.length();j++){
				char cb=b.charAt(j-1);
				for(int k=1;k<=c.length();k++){
					char cc= c.charAt(k-1);
					
					
					if(ca==cb && cb==cc){
						arr[i][j][k]=1+arr[i-1][j-1][k-1];
					}
					else{
						arr[i][j][k]=Math.max(arr[i-1][j][k], Math.max(arr[i][j-1][k], arr[i][j][k-1]));
					}
					
					
					
				}
			}
		}
			System.out.println(arr[arr.length-1][arr[0].length-1][arr[0][0].length-1]);
		
		

	}

}
