package BackTracking;

import java.util.ArrayList;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="abc";
//		ArrayList<String> ab = permuatations(a);
//		System.out.println(ab);
//		System.out.println(ab.size());
//		permutationsQA(a, "");
		ArrayList<String> ab = permute(a);
		System.out.println(ab);

	}

	public static ArrayList<String> permuatations(String ques) {
		if (ques.length() == 0) {
			ArrayList<String> ab = new ArrayList<String>();
			ab.add("");
			return ab;
		}

		char ch = ques.charAt(0);
		String roq = ques.substring(1);

		ArrayList<String> res = permuatations(roq);
        ArrayList<String> myres=new ArrayList<String>();
        
        
        for(String ab:res){
        	for(int i=0;i<=ab.length();i++){
        		StringBuilder sb = new  StringBuilder(ab);
        		sb.insert(i, ch);
        		myres.add(sb.toString());
        	}
        	
        }
        return myres;
	}
	public static void permutationsQA(String ques,String ans){
		if(ques.length()==0){
			System.out.println(ans);
			return;
		}
		
		char ch = ques.charAt(0);
		String roq=ques.substring(1);
		
		for(int i=0;i<=ans.length();i++){
			StringBuilder sb = new StringBuilder(ans);
			sb.insert(i, ch);
			permutationsQA(roq, sb.toString());
			
		}
		
		
		
	}
	public static ArrayList<String> permute(String ques){
		
		if(ques.length()==0){
			ArrayList<String> ab = new ArrayList<String>();
			ab.add("");
			return ab;
		
		}
		ArrayList<String> myans=new ArrayList<String>();
		
	for(int i=0;i<ques.length();i++){
		char ch =ques.charAt(i);
		String bp=ques.substring(0, i);
		String ap=ques.substring(i+1);
		String roq=bp+ap;
		
		
		ArrayList<String> ans=permute(roq);
		
		
		for(String ab:ans){
			myans.add(ab+ch);
			
		}
		
		
		
	}
	return myans;
	}

}
