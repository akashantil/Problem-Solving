package Feb18;

public class MinOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int a=2,b=1,c=2;
		int min =MinofThree(a,b,c);
		System.out.println(min);
		
		// TODO Auto-generated method stub

	}
	public static int MinofThree(int a,int b,int c){
		int min=0;
		if(a<=b&&a<=c)  min=a;
		else if(b<=c && b<=a)  min=b;
		else min=c;
		return min;
		
	}
	
	

}
