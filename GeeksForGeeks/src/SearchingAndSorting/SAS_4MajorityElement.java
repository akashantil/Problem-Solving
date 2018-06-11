package SearchingAndSorting;

import java.util.Arrays;

public class SAS_4MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int [] arr =	{3, 3, 0, 2, 7, 9, 2, 4, 4};
	
	Arrays.sort(arr);
	int mfe=0;
	int mf=1;
	int cf=1;
	int prev =arr[0];
	for(int i=1;i<arr.length;i++){
		if(prev==arr[i]){
			cf++;
			if(cf>mf){
				mf=cf;
				mfe=arr[i];
			}
		}
		else{
			prev=arr[i];
			cf=1;
			
		}
		
	}
	if(mf>=arr.length/2)
		System.out.println("Majority element is-->"+mfe+" &its freq is--> "+mf);
	else {
		System.out.println("No Majority Element");
	}
	

	}

}
