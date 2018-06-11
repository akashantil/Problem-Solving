package asssingmentfeb07;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
        Scanner sc =new Scanner(System.in);
        number=sc.nextInt();
        int i=0;
        while(i<number){
        	int j=0;
            while(j<=i){
                System.out.print("* ");
                    j++;
            }
            i++;
            System.out.println("");
            
        }
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}