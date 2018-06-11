package Matrix;

import java.util.ArrayList;
import java.util.HashMap;

public class SB_12_CommonElementsinAllrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] matrix={
				 {7, 2, 0, 4, 8},
	             {3, 7, 8, 5, 1},
	             {8, 7, 7, 3, 1},
	             {8, 1, 2, 9, 9},
	            };
		
		HashMap<Integer,Integer> count= new HashMap<>();
		HashMap<Integer,Integer> row= new HashMap<>();
		for(int i=0;i<matrix[0].length;i++){
			int ele=matrix[0][i];
			if(count.containsKey(ele)){
				//
			}
			else{
				count.put(ele, 1);
				row.put(ele, 0);
			}
		}
		
		for(int i=1;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				int ele=matrix[i][j];
				
				if(count.containsKey(ele) && row.get(ele)!=i){
					count.put(ele, count.get(ele)+1);
					row.put(ele, i);
					
				}
				
				
				
			}
		}
		
		ArrayList<Integer> res = new ArrayList<>(row.keySet());
		for(int i=0;i<res.size();i++){
			int a=res.get(i);
			if(count.get(a)==matrix.length){
				System.out.println(" Element found =" +a);
				return;
			}
		}
		System.out.println("No Such Element Found");
		

	}

}
