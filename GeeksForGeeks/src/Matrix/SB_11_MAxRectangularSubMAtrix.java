package Matrix;

public class SB_11_MAxRectangularSubMAtrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] arr= { 
				{0, 1, 1, 0},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 0, 0},
              };
		int [][] temp=new int [arr.length][arr[0].length];
		
		
		for(int i=1;i<arr[0].length;i++){
			temp[0][i]=arr[0][i];
			
		}
		
			for(int j=0;j<arr[0].length;j++){
				for(int i=1;i<arr.length;i++){
				if(arr[i][j]==1){
					temp[i][j]=1+temp[i-1][j];
							
				}
			}
		}
		
		
		
		int masf=0;
		
		
		for(int i=0;i<arr.length;i++){
			int count=0;
			int minofrow=Integer.MAX_VALUE;
			int maor=0;
			for(int j=0;j<arr[0].length;j++){
				if(temp[i][j]>0){
					count++;
					if(temp[i][j]<minofrow)
						minofrow=temp[i][j];
				}
					
				
			}
			maor=minofrow*count;
			if(maor>masf)
				masf=maor;
			
		}
		System.out.println("Maximum no of ones in rectangular square submatrix is " + masf);
		
		

	}

}
