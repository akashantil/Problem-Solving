package April21;

import java.util.ArrayList;

public class coinChangeperm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] denoms={2,3,5,6};
		int amt =10;
		ccpt(denoms, amt);
		//System.out.println(ccpm(denoms, amt, new ArrayList[amt+1]).size());
		//System.out.println(ccpm(denoms, amt, new ArrayList[amt+1]));

	}
	
	public static void ccpt(int[] denoms, int amt) {

		int[] ways = new int[amt + 1];

		ArrayList<String>[] path = new ArrayList[amt + 1];
		for (int i = 0; i < path.length; i++) {

			path[i] = new ArrayList<>();

		}
		ways[0] = 1;
		path[0].add("");

		
			for (int j = 1; j <= amt; j++) {
				for (int i = 0; i < denoms.length; i++) {
					
					if(j-denoms[i]>=0){
				
				 ways[j]+=ways[j-denoms[i]];
					
				 for(int k=0;k<path[j-denoms[i]].size();k++){
					 String ab= path[j-denoms[i]].get(k);
					 path[j].add(ab+denoms[i]+"");
				 }
					}

			}

		}
		System.out.println(ways[amt]);
		System.out.println(path[amt]);

	}

public static ArrayList<String> ccpm(int [] denoms,int amt,ArrayList [] qb){
	
	if(amt==0){
		ArrayList<String> bres= new ArrayList<>();
		bres.add("");
		return bres;
	}
	if(amt<0){

		ArrayList<String> bres= new ArrayList<>();
		
		return bres;
	}
	
	if(qb[amt]!=null){
		return qb[amt];
	}
	
	ArrayList<String> myres= new ArrayList<>();
	
	
	
	for(int i=0;i<denoms.length;i++){
		ArrayList<String> rresult=ccpm(denoms, amt-denoms[i], qb);
		
		for(String ab:rresult){
			myres.add(ab+denoms[i]+"");
			
		}
		
	}
	qb[amt]=myres;
	return myres;
	
}
}
