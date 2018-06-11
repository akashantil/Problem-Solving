package NonCategory;

import java.util.Scanner;

public class Pep_Java_8NonCategory_4PepCodingHiring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new  Scanner(System.in);
		int wq=Integer.MIN_VALUE;
		String wn="";
		
		int not=sc.nextInt();
		for(int i=0;i<not;i++){
			String name=sc.next();
			int noqd=sc.nextInt();
			int noqj=sc.nextInt();
			int diff = noqj-noqd;
			if(diff>wq){
				wn=name;
				wq=diff;
				
			}
		}
		System.out.println( wn +" "+wq );

	}

}
