package Feb24;

public class StringStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nitin";
		printChars(s);
		System.out.println();
		allSubstrings(s);
		System.out.println();
	boolean r=	IsPalindrome(s);
	System.out.println(r);
	System.out.println();
allPalindromicSubstrings(s);
		
	}

	public static void printChars(String a) {
		for (int i = 0; i < a.length(); i++) {
			System.out.println(a.charAt(i));
		}
	}

	public static void allSubstrings(String s) {
		for (int i = 0; i <= s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				System.out.println(s.substring(i, j));
			}
		}
	}

	public static boolean IsPalindrome(String s) {
		int half = s.length() / 2;
		int flag = 0;
		int i=0;
		int j=s.length()-1;
		 while( i <=half){
			 if(s.charAt(i)==s.charAt(j)){
				 flag=1;
				 i++;
				 j--;
			 }
			 else{
				 return false;
			 }
			 
			
				}
		 if(flag==1){
			 return true;
		 }
		 else{
			 return false;
		 }

}
	public static void allPalindromicSubstrings(String s){
		for (int i = 0; i <= s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String temp=s.substring(i, j);
				int half = temp.length() / 2;
				int flag = 0;
				int st=0;
				int e=temp.length()-1;
				 while( st<=half){
					 if(temp.charAt(st)==temp.charAt(e)){
						 flag=1;
						 st++;
						 e--;
					 }
					 else{
						 flag=0;
						 break;
					 }
					 
					
						}
				 if(flag==1){
					 
					 System.out.println(temp);;
				 }
				 else{
					 
				 }

		
		}
		
		
	}
}
}