package Feb18;

public class Maxofthree {

	public static void main(String[] args) {
		
		int a=3,b=4,c=5;
		MaxOfThree(a,b,c);
		
		// TODO Auto-generated method stub

	}
	public static int MaxOfThree(int a,int b,int c){
		int max=0;
		if(a>=b&&a>=c)  max=a;
		else if(b>=c && b>=a)  max=b;
		else max=c;
		return max;
		
	}
	
	

}
