package assingmentRecursion;

import java.util.Scanner;

public class daysweekinmonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nt;
		int nod;
		String day;
		Scanner sc = new Scanner(System.in);
		nt=sc.nextInt();
		for(int i=0;i<nt;i++){
			nod=sc.nextInt();
			day=sc.next();
			int sd=tellday(day);
			int [] arr= new int [7];
			for(int j=0;j<arr.length;j++){
				arr[j]=4;
			}
			if(nod==31){
				tellOccurences(nod, sd, sd, arr, (sd+3)%7);
			}
			else if(nod==30){
				tellOccurences(nod, sd, sd, arr, (sd+2)%7);
			}
			else if(nod==29){
				tellOccurences(nod, sd, sd, arr, (sd+1)%7);
			}
			
			for(int k=0;k<arr.length;k++){
				System.out.print(arr[k]+" ");
			}
			System.out.println();
			
		}
		

	}
	public static int tellday(String s){
		
		int day=-1;
		switch(s){
		case "mon":day=0; break;
		case "tues":day=1; break;
		case "wed":day=2; break;
		case "thurs":day=3; break;
		case "fri":day=4; break;
		case "sat":day=5; break;
		case "sun":day=6; 
		
		
		}
		return day;
	}
	public static void tellOccurences(int nod,int sd,int si,int [] arr,int ei){
		
		if(si==ei){
			
			return;
		}
		
			if(nod%7!=0){
				arr[si%7]=5;
				si=(si+1)%7;
				tellOccurences(nod, sd, si, arr, ei);
			
			}
		}
		
		
	}

