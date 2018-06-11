package GeeksArraysArrangements;

import java.util.Arrays;
import java.util.Scanner;

public class SortAccToGivenValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n1;
    int n2;
    
    Scanner sc =new Scanner(System.in);
    n1=sc.nextInt();
    n2=sc.nextInt();
    
    
    
    int [] arr = new int [n1];
    int [] arr2=new int[n2];
    for(int i=0;i<n1;i++){
    	arr[i]=sc.nextInt();
    	
    }
    for(int i=0;i<n2;i++){
    	arr2[i]=sc.nextInt();
    	
    }
    
    Arrays.sort(arr);
    int [] temp = new int [n1];
    
    int j=0;
    int tin=0;
    while(j<n2-1){
    	int in=Arrays.binarySearch(arr, arr2[j]);
    	System.out.println(in);
    	
    }
    
    
	}

}
