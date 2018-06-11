package march18;

public class QueenInBoxes {

	public static void main(String[] args) {
		String s= "12345";
		
		placingQueen(s, "");
		// TODO Auto-generated method stub

	}
	 static int c=0;
	public static void placingQueen(String ques,String ans){
		if(ans.length()==3){
			c++;
			System.out.println( c +"-->" +ans);
			return;
		}
		
		
		for(int i=0;i<ques.length();i++){
			
			String bp=ques.substring(0, i);
			String ap = ques.substring(i+1);
			String roq=bp+ap;
			
			
			placingQueen(roq, ans+ques.charAt(i));
			
			
		}
		
		
	}

}
