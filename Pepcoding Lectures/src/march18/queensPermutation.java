package march18;

public class queensPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		queen("12345", "");
	}
	
	public static void queen(String ques,String ans){
		if(ans.length()==3){
			System.out.println(ans);
			return;
		}
		
		
		for(int i=0;i<ques.length();i++){
			char ch = ques.charAt(0);
			
			String bp="";
			String ap="";
			if(i>0){
				bp=ques.substring(0, i-1);
				
			}
			if(i<ques.length()-1){
				ap=ques.substring(i);
			}
			String roq=bp+ap;
			queen(roq, ans+ch);
		}
	}

}
