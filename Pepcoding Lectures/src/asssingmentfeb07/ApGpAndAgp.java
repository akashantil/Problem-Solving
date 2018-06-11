package asssingmentfeb07;

import java.util.Scanner;

public class ApGpAndAgp {

	public static void main(String[] args) {
		int a, d, r, n;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		d = sc.nextInt();
		r = sc.nextInt();
		n = sc.nextInt();
		
		int fap = FtAp(a,d,n);
		int fgp=FtGp(a,r,n);
		int fagp=FtAgp(a,d,r,n);
		int sap=SAp(a,d,n);
		int sgp=FsGp(a,r,n);
		int sagp=FsAgp(a,d,r,n);
		System.out.println(fap +" "+ fgp+" "+fagp+" "+ sap+" "+ sgp+" "+sagp);
		// TODO Auto-generated method stub

	}

	public static int FtAp(int a, int d, int n) {
		int fap = 0;
		fap = a + (n - 1) * d;
		return fap;

	}

	public static int SAp(int a, int d, int n) {
		int fap = FtAp(a, d, n);
		int sap = 0;
		sap = (n * (a + fap)) / 2;
		return sap;

	}

	public static int FtGp(int a, int r, int n) {
		int fgp = 0;
		fgp = (int) (a * Math.pow(r, (n - 1)));
		return fgp;

	}
	public static int FsGp(int a,int r,int n ){
		int fsgp=0;
		if(r>=1){
			fsgp=(int) (a*(Math.pow(r,n)-1))/(r-1);
		}
		else{
			fsgp=(int) (a*(1-(Math.pow(r,n))))/(1-r);

			
		}
		return fsgp;
		
	}
public static int FtAgp(int a,int d,int r,int n){
	int ft=0;
	ft=(int) ((a+(n-1)*d)*Math.pow(r, (n-1)));
	return ft;
			
}
	public static int FsAgp(int a,int d,int r,int n){
		int sum=0;
		int term1=(int) ((a-(a+(n-1)*d)*Math.pow(r, n))/(1-r));
		int term2=(int) ((d*r)*(1-(Math.pow(r, n-1)))/(Math.pow(1-r, 2)));
		sum =term1+term2;
		return sum;
	}
	
}
