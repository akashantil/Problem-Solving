package Feb15;

import java.util.Scanner;

public class BinarySequencePossible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4;
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter how many ");
		int [] rem;
		rem= new int[n];
		for(int i=0;i<(1<<n);i++){
			int temp=i;
			for(int j=0;j<rem.length;j++){
				
				int remn =temp%2;
				temp=temp/2;
				
				rem[(rem.length)-1-j]=remn;
				
			}
			for(int k=0;k<n;k++){
				if(rem[k]==1){
					System.out.print(rem[k] + " ");
				}
				else{
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		
		

		
	}



	}


