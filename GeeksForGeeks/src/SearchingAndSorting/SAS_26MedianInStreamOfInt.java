package SearchingAndSorting;

import java.util.Arrays;

public class SAS_26MedianInStreamOfInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 15, 1, 3 };
		for(int i=0;i<arr.length;i++){
			int [] temp = new int[i+1];
			for(int j=0;j<temp.length;j++){
				temp[j]=arr[j];
			}
			Arrays.sort(temp);
			if(temp.length%2==1){
				System.out.println("After Reading " + (i+1)+"st element median is "+temp[temp.length/2]);
			}
			else{
				int mid=temp.length/2;
				int med=(temp[mid]+temp[mid-1])/2;
				System.out.println("After Reading " + (i+1)+"st element median is "+med);
			}
		}

	}

}
