package GeeksArraysArrangements;

import java.util.Scanner;

public class FindIndexOfZeroToBeReplaced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1;

		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();

		int[] arr = new int[n1];

		for (int i = 0; i < n1; i++) {
			arr[i] = sc.nextInt();

		}
		boolean winner=false;
		boolean fz=false;
		int count =0;
		int azc=0;
		int max=0;
		int cin=0;
		int min=0;
		
		if(arr[0]==1){
			winner=true;
			cin=0;
			min=0;
			count++;
			
		}
		
		else {
			winner=false;
		}
		for(int i=1;i<arr.length;i++){
			
			if(winner==true && arr[i]==1){
				count++;
				if(max<count){
					max=count;
					
				}
				continue;
				
			}
			else if(winner==true && arr[i]==0 && fz==false){
				count++;
				cin=i;
				if(max<count){
					max=count;
					min=cin;}
				
					fz=true;
				
				
			}
			else if(winner==true && arr[i]==0 && fz==true &&azc==0){
				winner=false;
				fz=false;
				count=count +azc;
				if(max<count){
					max=count;
				}
				
				
			}
			else if(winner==true && arr[i]==0 && fz==true &&azc>0){
				winner=false;
				fz=true;
				count=count +azc;
				if(max<count){
					max=count;
				}
				
				
			}
			
			else if(winner==true && arr[i]==1 && fz==true){
				winner=false;
				fz=false;
				azc++;
				count+=azc;
				if(max<count){
					max=count;
				}
				
			}
			else if(winner==false && arr[i]==1 && fz==false){
				winner =true;
				count++;
				
				fz=false;
				if(max<count){
					max=count;
					
				}
				
			}
			else if(winner==false && arr[i]==0 && fz==false){
				continue;
				
			}
			
			
		}
		System.out.println(max);
		System.out.println(min);
	}

}
