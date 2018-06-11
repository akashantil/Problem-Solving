package NonCategory;

import java.util.Scanner;

public class Pep_Java_8NonCategory_5RajneeshOnDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int nos=sc.nextInt();
//    int fsv=Integer.MIN_VALUE;
//    int minor=Integer.MAX_VALUE;
    int  fs=0;
    int  fa=0;
    int fav=Integer.MAX_VALUE;
    int noa=sc.nextInt();
    int[][] pli=new int[nos][noa];
    for(int i=0;i<nos;i++){
    	for(int j=0;j<noa;j++){
    		pli[i][j]=sc.nextInt();
    	}
    }
    
    int [] minarr= new int[nos];
    for(int i=0;i<nos;i++){
    	int min=Integer.MAX_VALUE;
    	for(int j=0;j<noa;j++){
    	min	=Math.min(pli[i][j], min);
    	}
    	minarr[i]=min;
    }
    int max=Integer.MIN_VALUE;
//    for(int j=0;j<minarr.length;j++){
//    	System.out.println(minarr[j] +" ");
//    	}
//    
    for(int j=0;j<minarr.length;j++){
    	if(max<minarr[j]) {
    		fs=j;
    		max=minarr[j];
    	}
    	
    	
    	
    }
    
    	for(int j=0;j<noa;j++){
    		if(fav>pli[fs][j]){
    			fav=pli[fs][j];
    			fa=j;
    			
    		}
    	}
    System.out.println(pli[fs][fa]);
    
    
	}

}
