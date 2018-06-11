package assingmentRecursion2;

import java.util.ArrayList;
import java.util.Scanner;

public class Pep_Java_7Recursion_38ASCIISubsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner sc = new Scanner(System.in);
				String a=sc.nextLine();
				ArrayList<String> res=subsequence(a);
				System.out.println(res.size());
				System.out.println(res);
				
				subsequenceQA(a, "");

			}
			public static ArrayList<String> subsequence(String s){
				if(s.length()==0){
					ArrayList<String> ab= new ArrayList<String>();
					ab.add("");
					return ab;
					
				}
				
				char ch= s.charAt(0);
				String ros=s.substring(1);
				ArrayList<String> result= subsequence(ros);
				ArrayList<String> myresult= new ArrayList<String>();
				
				for(String rstr:result){
					myresult.add(rstr);
					myresult.add(rstr+ch);
					myresult.add(rstr+(int)(ch));
					
				}
				return myresult;
				
				
			}
			public static void subsequenceQA(String ques,String ans){
				if(ques.length()==0){
					System.out.println(ans);
					return;
				}
				
				char ch=ques.charAt(0);
				String roq=ques.substring(1);
				subsequenceQA(roq, ans);
				subsequenceQA(roq, ans+ch);
				subsequenceQA(roq, ans+(int)(ch));
				
				
				
			}

		}
