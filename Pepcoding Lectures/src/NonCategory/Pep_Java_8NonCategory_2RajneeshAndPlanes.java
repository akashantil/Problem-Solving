package NonCategory;

import java.util.Scanner;

public class Pep_Java_8NonCategory_2RajneeshAndPlanes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in );
		int not=sc.nextInt();
		
		for(int i=0;i<not;i++){
			
			int x1=sc.nextInt();
			int y1=sc.nextInt();
			int z1=sc.nextInt();
			
			int x2=sc.nextInt();
			int y2=sc.nextInt();
			int z2=sc.nextInt();
			
			int x3=sc.nextInt();
			int y3=sc.nextInt();
			int z3=sc.nextInt();
			
			int x4=sc.nextInt();
			int y4=sc.nextInt();
			int z4=sc.nextInt();
			
			
			if(x1==x2&&x1==x3&&x1==x4){
				System.out.println("YES");
				continue;
			}
			else if(y1==y2&&y1==y3&&y1==y4){
				System.out.println("YES");
				continue;
			}
			else if(z1==z2&&z1==z3&&z1==z4){
				System.out.println("YES");
				continue;
			}
			else{
				System.out.println("NO");
			}
			
			}
		

	}

}
