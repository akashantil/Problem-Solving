package April8;

public class Sort01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr={0,1,0,1,1,1,0,0,0,1,1,1};
		
		int i=0;
		int j=arr.length-1;
		while(i<j){
			if(arr[i]==0){
				i++;
			}
			else if(arr[j]==1){
				j--;
			}
			else if(arr[i]!=0 && arr[j]!=1){
				arr[i]=0;
				arr[j]=1;
				i++;
				j--;
			}
		}
		for(int i1=0;i1<arr.length;i1++){
			System.out.print(arr[i1] +" ");
		}

	}

}
