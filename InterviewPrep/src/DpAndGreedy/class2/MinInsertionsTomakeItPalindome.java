package DpAndGreedy.class2;

import java.util.Scanner;

public class MinInsertionsTomakeItPalindome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inp=sc.next();
		
		int [][] arr = new int [inp.length()][inp.length()];
		
		
		for(int i=0;i<arr[0].length;i++){
			int gap=i;
			
			for(int d=0; d+gap<arr.length;d++){
				
				if(gap==0){
					arr[d][d+gap]=1;
				}
				else if(gap==1){
					char ch1=inp.charAt(d);
					char ch2=inp.charAt(d+gap);
					
					if(ch1!=ch2){
						arr[d][d+gap]=1;
					}
					else{
						arr[d][d+gap]=2;
					}
				}
				else{
					char ch1=inp.charAt(d);
					char ch2=inp.charAt(d+gap);
					if(ch1!=ch2){
					
					arr[d][d+gap]=Math.max(arr[d][d+gap-1],arr[d+1][d+gap]);
					}
					else{
						arr[d][d+gap]+=2+arr[d+1][d+gap-1];
						
					}
					
					
				}
				
				
			}		
			
			
		}
		System.out.println(inp.length()-arr[0][arr.length-1]);
		
		

	}

}
