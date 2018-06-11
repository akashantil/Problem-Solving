package BackTracking;

import java.util.Scanner;

public class WoedBreakProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] dict = { "mobile", "samsung", "sam", "sung", "man", "mango", "icecream", "and", "go", "i", "love",
				"ice", "cream" };

		String in = "iloveice";
		WordBreaker(in, dict, "");

		// WordBreaker(dict, in, "",0,in.length());

	}

	// fuddu
	// public static void WordBreaker(String[]dict,String inp,String asf,int
	// nos,int l){
	// if(inp.length()==0){
	// if(asf.length()-nos ==l){
	// System.out.println(asf);
	// nos--;
	// return;
	// }
	//
	//
	//
	// }
	//
	//
	//
	//
	// for(int i=0;i<=inp.length();i++){
	// for(int j=i;j<=inp.length();j++){
	// String ab= inp.substring(i, j);
	//
	// String roq=inp.substring(j);
	// for(int k=0;k<dict.length;k++){
	// if(ab.equals(dict[k])){
	// WordBreaker(dict, roq, asf+ab+" ",nos+1,l);
	//
	//
	//
	// }
	//
	// }
	// }
	// }
	// }
	public static void WordBreaker(String in, String[] dict, String asf) {
		if (in.length() == 0) {
			System.out.println(asf);
			return;
		}

		for (int i = 0; i <= in.length(); i++) {
			String a = in.substring(0, i);
			String roq = in.substring(i);
			for (int k = 0; k < dict.length; k++) {
				if (a.equals(dict[k])) {
					WordBreaker(roq, dict, asf + a + " ");

				}
			}

		}
	}

}
