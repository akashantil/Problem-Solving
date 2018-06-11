package NonCategory;

import java.util.Scanner;

public class Pep_Java_8NonCategory_3CircleCity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int not=sc.nextInt();
		for(int i=0;i<not;i++){
			
			int d=sc.nextInt();
			int r=(int)(Math.sqrt(d));
			int nopr=0;
			int zc=0;
			
			int x=sc.nextInt();
			for(int j=0;j<=r;j++){
				int y=(int)(Math.sqrt(d-(j*j)));
				if(y*y==d-(j*j))
				{
					if(y==0||j==0) 
						zc++;
					nopr++;
				}
					
				}
				
				
			nopr*=4;
			nopr-=2*zc;
			System.out.println(nopr);
			if(x>=nopr) System.out.println("possible");
			else System.out.println("impossible");
		}

	}

}
