package feb17;

public class SpiralDisplaySB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
		SpiralDisplayer(arr);
		// TODO Auto-generated method stub

	}

	public static void SpiralDisplayer(int[][] arr) {
		int rmin=0,cmin=0;
		int rmax=arr.length-1;
		int cmax=arr[0].length-1;
		
		int tn = arr.length * arr[0].length;
		while(tn>0){
			
			//left wall
		for(int i=rmin;i<=rmax && tn>0;i++){
			System.out.print(arr[i][cmin]+" ");
			tn--;
		}
		
		cmin++;
		//bottom wall
		for(int j=cmin;j<=cmax && tn>0;j++){
			System.out.print(arr[rmax][j]+" ");
			tn--;
		}
		rmax--;
		
		// right wall
		for(int i=rmax;i>=rmin && tn>0;i--){
			System.out.print(arr[i][cmax]+" ");
			tn--;
		}
		cmax--;
		//top wall
				for(int j=cmax;j>=cmin && tn>0;j--){
			System.out.print(arr[rmin][j]+" ");
			tn--;
		}
		rmin++;
	}
		System.out.println(".");
	}
}
