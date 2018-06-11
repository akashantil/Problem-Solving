package SearchingAndSorting;

public class SAS_52FreqCountInO1space {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 3, 3, 2, 5};

		
		
		int i=0;
		while(i<arr.length){
			if(arr[i]<=0){
				i++;
				continue;
			}
			else{
				
				int idx=arr[i]-1;
				if(arr[idx]>0){
				arr[i]=arr[idx];
				
				arr[idx]=-1;
				}
				else{
					arr[idx]--;
					arr[i]=0;
					i++;
				}
			}
		}
		for(int j=0;j<arr.length;j++){
			System.out.println("Freq of"+(j+1)+"is "+Math.abs(arr[j]));
		}
		
	}
	
	

}
