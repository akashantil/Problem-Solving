package April14;

public class FibIterartive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(10));

	}
	public static int fib(int n){
		int [] arr =new int[n+1];
		arr[0]=0;
	arr[1]=1;
	
	for(int x=2;x<arr.length;x++){
		arr[x]=arr[x-1]+arr[x-2];
	}
	
	return arr[n];
	}

}
