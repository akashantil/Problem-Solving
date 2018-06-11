package GeeksArraysArrangements;

import java.util.Scanner;

public class oneDArrayWaveform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		
		for(int i=0;i<n;i+=2){
			if(i==0){
				if(arr[i]<arr[i+1]){
					int temp=arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=temp;
				}
			}
			else if(i>0&&i<n-1){
				
					if(arr[i-1]>arr[i+1]){
						int temp=arr[i-1];
						arr[i-1]=arr[i];
						arr[i]=temp;
						
						
					}
					else if(arr[i-1]<arr[i+1]){
						int temp=arr[i+1];
						arr[i+1]=arr[i];
						arr[i]=temp;
						
						
					}
					
				}
			else if(i==n-1){
				if(arr[i]<arr[i-1]){
					int temp=arr[i-1];
					arr[i-1]=arr[i];
					arr[i]=temp;
					
				}
			}
			}
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
			
		}

	}


