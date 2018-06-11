package April1;

public class PermutationOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permuteStringBuilder(new StringBuilder("abc"),new StringBuilder(""));
	//	permutation2SB(new StringBuilder("abc"),new StringBuilder(""));

	}

	public static void permute(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(0);
		String roq = ques.substring(1);

		for (int i = 0; i <= ans.length(); i++) {
			String lp = ans.substring(0, i);
			String ap = ans.substring(i);
			String asf = lp + ch + ap;

			permute(roq, asf);
		}

	}
	public static void permuteStringBuilder(StringBuilder ques, StringBuilder ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(0);
		ques.deleteCharAt(0);
		

		for (int i = 0; i <= ans.length(); i++) {
			ans.insert(i, ch);
			permuteStringBuilder(ques, ans);
			ans.deleteCharAt(i);
			
			
		}
		ques.insert(0, ch);

	}
	public static void permutation2(String ques, String ans){
		if(ques.length()==0){
			System.out.println(ans);
			return;
		}
		
		
		for(int i=0;i<ques.length();i++){
			char ch = ques.charAt(i);
			String lp=ques.substring(0, i);
			String rp=ques.substring(i+1);
			permutation2(lp+rp, ans+ch);
		}
	}
	
	
	public static void permutation2SB(StringBuilder ques, StringBuilder ans){
		if(ques.length()==0){
			System.out.println(ans);
			return;
		}
		
		
		for(int i=0;i<ques.length();i++){
			char ch = ques.charAt(i);
			ques.deleteCharAt(i);
			ans.append(ch);
			permutation2SB(ques, ans);
			ans.deleteCharAt(ans.length()-1);
			ques.insert(i, ch);
			
			
		}
	}
	


}
