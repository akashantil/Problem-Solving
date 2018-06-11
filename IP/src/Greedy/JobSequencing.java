package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class JobSequencing {
	
	public static class job implements Comparable<job> {
		char id;
		int deadline;
		int profit;

		job(char id,int deadline, int profit) {
			this.id=id;
			this.deadline=deadline;
			this.profit=profit;
		}

		@Override
		public int compareTo(job o) {
			// TODO Auto-generated method stub
			return  o.profit -this.profit;
		}

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		int soa= sc.nextInt();
		job [] arr = new job[soa];
		
		int maxt=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			char id=sc.next().charAt(0);
			int dead=sc.nextInt();
			int pro=sc.nextInt();
			if(dead>maxt)
				maxt=dead;
			job a= new job(id, dead, pro);
			arr[i]=a;
		}
		
		char [] res= new char[maxt];
		
		Arrays.fill(res, '0');
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++){
			int itp=arr[i].deadline;
			
			for(int j=itp-1;j>=0;j--){
				if(res[j]=='0'){
					res[j]=arr[i].id;
					break;
					
				}
			}
			
			
			
		}
		String ans="";
		for(int i=0;i<res.length;i++){
			if(res[i]!='0'){
				ans+=res[i]+" ";
			}
		}
		System.out.println(ans);
		
		
		
		
		
		

	}

}
