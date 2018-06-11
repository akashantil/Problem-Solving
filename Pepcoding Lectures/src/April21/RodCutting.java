package April21;

public class RodCutting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr ={0,3,5,6,15,10,25,12,24};
		
		int[] maxcst= new int[arr.length];
		String [] path= new String[arr.length];
		
		
		maxcst[0]=arr[0];
		maxcst[1]=arr[1];
		path[0]=0+ "  ";
		path[1]=1+" ";
		
		for(int i=2;i<arr.length;i++){
			
			int right=i-1;
			int left=1;
			maxcst[i]=arr[i];
			path[i]=i+" ";
			
			
			while(left<=right){
				if(right+left==i && maxcst[left]+maxcst[right]>maxcst[i]){
					maxcst[i]=maxcst[left] +maxcst[right];
					path[i]=path[left] +" "+path[right]+" ";
					
					
				}
				left++;
				right--;
			}
		}
		System.out.println(maxcst[arr.length-1]);
		System.out.println(path[arr.length-1]);
		

	}

}
