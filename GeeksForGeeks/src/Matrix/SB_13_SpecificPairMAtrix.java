package Matrix;

public class SB_13_SpecificPairMAtrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = {
                { 1, 2, -1, -4, -20 },
                { -8, -3, 4, 2, 1 },
                { 3, 8, 6, 1, 3 },
                { -4, -1, 1, 7, -6 },
                { 0, -4, 10, -5, 1 }
             };
		
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int maxi=0;
		int maxj=0;
		int mini=0;
		int minj=0;

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				if(max<arr[i][j]){
					max=arr[i][j];
					maxi=i;
					maxj=j;
				}
				if(min>arr[i][j]){
					min=arr[i][j];	
					mini=i;
					minj=j;
				}
				
			}
		}
		
		int minmax=Integer.MIN_VALUE;
		int maxmin=Integer.MAX_VALUE;
		if(maxi>mini && maxj>minj){
			System.out.println("Max Value is " + (max - min));
			return;
		}
		else{
			for(int k=mini+1;k<arr.length;k++){
				for(int l=minj+1;l<arr[0].length;l++){
					if(minmax<arr[k][l])
						minmax=arr[k][l];
					
										
				}
			}
			for(int i=0;i<maxi;i++){
				for(int j=0;j<maxj;j++){
					if(maxmin>arr[i][j])
						maxmin=arr[i][j];
				}
			}
		}
		int fvmin=minmax-min;
		int fvmax=max-maxmin;
		if(fvmin>fvmax)
			System.out.println("Max Value is " + fvmin);
		else
			System.out.println("Max Value is " + fvmax);
			
			

	}
	

}
