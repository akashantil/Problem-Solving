package SearchingAndSorting;

public class SAS_56MergeTwoSAO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar1[] = { 1, 5, 9, 10, 15, 20 };
		int ar2[] = { 2, 3, 8, 13 };
		
		int i=0; int j=0;
		while(i<ar1.length){
			if(ar1[i]<=ar2[j]){
				i++;
				continue;
			}
			else {
				//if(ar1[i]>ar2[j])
				int temp =ar1[i];
				ar1[i]=ar2[j];
				ar2[j]=temp;
				i++;
				for(int k=0;k<ar2.length-1;k++){
					if(ar2[k]>ar2[k+1]){
						int temp1=ar2[k];
						ar2[k]=ar2[k+1];
						ar2[k+1]=temp1;
						
					}
				}
			}
		}
		for(int i1=0;i1<ar1.length;i1++){
			System.out.print(ar1[i1]+" ");
		}
		System.out.println();
		for(int i1=0;i1<ar2.length;i1++){
			System.out.print(ar2[i1]+" ");
		}

	}

}
