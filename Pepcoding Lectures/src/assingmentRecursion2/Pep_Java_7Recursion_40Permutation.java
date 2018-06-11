package assingmentRecursion2;

import java.util.ArrayList;
import java.util.Scanner;

public class Pep_Java_7Recursion_40Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		ArrayList<String> res = permutation(s);
		System.out.println(res.size());
		System.out.println(res);
		
		permutationQA(s, "");

	}
	public static ArrayList<String> permutation (String s){
		if(s.length()==0){
			ArrayList<String> as=new ArrayList<String>();
			as.add("");
			return as;
		}
		
		char ch=s.charAt(0);
		String ros=s.substring(1);
		
		ArrayList<String> res=permutation(ros);
		ArrayList<String> myres= new ArrayList<String>();
		
		for(String ab:res){
			for(int i=0;i<=ab.length();i++){
				StringBuilder sb = new StringBuilder(ab);
				sb.insert(i, ch);
				myres.add(sb.toString());
			}
			
		}
		return myres;
		
		
	}
	public static void permutationQA(String ques,String ans){
		if(ques.length()==0){
			System.out.println(ans);
			return;
		}
		
		char ch=ques.charAt(0);
		
		
		for(int i=0;i<ques.length();i++){
			String bp=ques.substring(0, i);
			String ap=ques.substring(i+1);
			String roq=bp+ap;
			
			permutationQA(roq, ans+ques.charAt(i));
		}
		
		
		
	}

}
