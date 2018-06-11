package BackTracking;

public class AllPalindromicPartitionsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String in="bcc";
		Palindromic(in, "");
//		System.out.println(IsPalindrome("abcdba"));
	}
	public static void Palindromic(String in,String asf){
		if(in.length()==0){
			System.out.println(asf);
			return;
		}
		
		for(int i=1;i<=in.length();i++){
			
				String a=in.substring(0,i);
				String ros=in.substring(i);
				if(IsPalindrome(a)==true){
					Palindromic(ros, asf+a+" ");
				}
				
				
			
		}
	}
	public static boolean IsPalindrome(String a){
		
		if(a.length()<=1){
			return true;
		}
		else{int i=0;
			int j=a.length()-1;
			char chi=a.charAt(i);
			char chj=a.charAt(j);
			if(chi!=chj){
				return false;
			}
			else{
				String roq=a.substring(i+1, j);
				 return IsPalindrome(roq);
			}
			
			
			
		}
		
		
	}

}
