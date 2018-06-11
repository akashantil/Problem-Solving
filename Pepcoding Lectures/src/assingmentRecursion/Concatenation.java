package assingmentRecursion;

import java.util.Scanner;

public class Concatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nt;
		int sa;
		int k;
		Scanner sc = new Scanner(System.in);
		nt=sc.nextInt();
		for(int i=0;i<nt;i++){
			sa=sc.nextInt();
			k=sc.nextInt();
			int [] temp = new int [sa];
			for(int j=0;j<sa;j++){
				temp[j]=sc.nextInt();
			}
			long [] fa=new long [k*sa];
			for(long l=0;l<fa.length;l++){
				fa[(int) l]= temp[(int) (l%temp.length)];
			}
//			for(int l=0;l<fa.length;l++){
//				System.out.print(fa[l] +" ");
//			}
			int max=RecursiveKadanes(fa, Integer.MIN_VALUE,  false, Integer.MIN_VALUE, 0);
//			System.out.println();
			System.out.println(max);}
		
		
		

	}

	public static int RecursiveKadanes(long[]arr,int sum,boolean winner,int om,long idx){
		if(idx==arr.length){
			return om;
		}
		return om;
	}}