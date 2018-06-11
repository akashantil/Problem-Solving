package feb07;

import java.util.Scanner;

public class pattern157 {

	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no of rows");
		n=sc.nextInt();
		
		int i,j,value;
		for(i=0;i<n;i++){
			value=1;
			for(j=0;j<=i;j++){
				
				System.out.print(value + "\t");
				value=(value*(i-j))/(j+1);
			}
			System.out.println();
		}
		
		// TODO Auto-generated method stub

	}

}
