package SearchingAndSorting;

public class SAS_10KadanesExcludin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {3, 4, 5, -4, 6};
		int [] ete={1, 8, 5};
		//sort the ete array and apply binary search to reduce time complexity from
		//O(n*m) to O(mlogm)+O(n*logm)
		
		int sum=Integer.MIN_VALUE;
		int maxsum=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++){
			if(findele(ete, arr[i])==true){
				sum=0;
				continue;
				
			}
			if(sum<0 && arr[i]>0){
				sum=arr[i];
				if(sum>maxsum)
					maxsum=sum;
				
			}
			else if(sum>=0){
				sum+=arr[i];
				if(sum>maxsum)
					maxsum=sum;
			}
			
		}
		System.out.println(maxsum);
		
		
	}
	public static boolean findele(int [] ete,int ele){
		for(int i=0;i<ete.length;i++){
			if(ele==ete[i]){
				return true;
			}
		}
		return false;
	}
	}

