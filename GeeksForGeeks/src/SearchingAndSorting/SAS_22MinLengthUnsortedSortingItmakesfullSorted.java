package SearchingAndSorting;

public class SAS_22MinLengthUnsortedSortingItmakesfullSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
		int i=0;
		int j=arr.length -1;
		while(i<arr.length-1){
			if(arr[i]>arr[i+1]){
				break;
			}
			i++;
			
		}
		if(i==arr.length-1){
			System.out.println("Already Sorted");
			return;
			
		}
			
		while(j>=1){
			if(arr[j-1]>arr[j]){
				break;
			}
			j--;
		}
		int min=arr[i];
		int max=arr[i];
		for(int s=i+1;s<j;s++){
			if(arr[s]<min)
				min=arr[s];
			if(arr[s]>max)
				max=arr[s];
		
		
	}
		for(int k=0;k<i-1;k++){
			if(arr[k]>min){
				i=k;
				break;
			}
		}
		for(int k=arr.length-1;k>=j+1;k--){
			if(arr[k]<max){
				j=k;
				break;
			}
		}
		System.out.println("Index of subArray Lies Btw " + i+" and "+ j );
		
	}

}
