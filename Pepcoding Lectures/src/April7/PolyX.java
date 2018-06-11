package April7;

public class PolyX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =getPolyVal(2, 3);
		System.out.println(sum);

	}
	public static int getPolyVal(int x,int n){
		//SB  approach start from reverse
		int xn=1;
		int i=0;
		while(i<n){
			xn*=x;
			i++;
		}
		int j=1;
		int k=1;
		int sum=0;
		while(j<=n){
			
			sum+=j*(xn/k);
			k=k*x;
			
			j++;
			
		}
		return sum;
		
	}

}
