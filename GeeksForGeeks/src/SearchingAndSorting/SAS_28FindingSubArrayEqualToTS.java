package SearchingAndSorting;

public class SAS_28FindingSubArrayEqualToTS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr ={15, 2, 4, 8, 9, 5, 10, 23};
		int sum =0;
		findindexes(arr, sum);

	}
	public static void findindexes(int[]arr,int ts){
		int i=0;
		int j=1;
		
		int sum=arr[i];
		boolean found=false;
		while(j<arr.length){
			
			if(sum<ts){
				sum=sum+arr[j];
				j++;
			}
			else if(sum>ts){
				sum-=arr[i];
				i++;
			}
			else{
				found=true;
				break;
			}
			
		}
		if(found==true && i<=(j-1))
			System.out.println("Sum found between" + i +" and "+(j-1));
		else {
			System.out.println("Such Subarray Doesn't exist");
		}
			
		
	}

}
