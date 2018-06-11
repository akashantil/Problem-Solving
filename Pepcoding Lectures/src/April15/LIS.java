package April15;

public class LIS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 22, 9, 33, 21, 50, 41, 60, 80, 11, 12, 13, 14, 15, 16, 17, 18, 19 };
		liss(arr);

	}

	public static void liss(int[] arr) {
		
		int [] length= new int [arr.length];
		String [] content= new String[arr.length];
		
		length[0]=1;
		int oml=0;
		String asf="";
		content[0]=arr[0]+" ";
		
		for(int i=1;i<arr.length;i++){
			for(int j=0;j<i;j++){
				if(arr[j]<arr[i]){
					if(length[j]>length[i]){
						length[i]=length[j];
						content[i]=content[j];
					}
				}
			}
				length[i]++;
				content[i]+=arr[i]+" ";
				
				if(length[i]>oml){
					oml=length[i];
					asf=content[i];
				}
				
			}
		System.out.println(oml);
		System.out.println(asf);
		}
		
		
public static void lissmemo(int[] arr) {
		
		int [] length= new int [arr.length];
		String [] content= new String[arr.length];
		int [] qb= new int[arr.length];
		
		length[0]=1;
		int oml=0;
		String asf="";
		content[0]=arr[0]+" ";
		
		for(int i=1;i<arr.length;i++){
			for(int j=0;j<i;j++){
				if(arr[j]<arr[i]){
					if(length[j]>length[i]){
						length[i]=length[j];
						content[i]=content[j];
					}
				}
			}
				length[i]++;
				content[i]+=arr[i]+" ";
				
				if(length[i]>oml){
					oml=length[i];
					asf=content[i];
				}
				
			}
		System.out.println(oml);
		System.out.println(asf);
		}

		
	}
