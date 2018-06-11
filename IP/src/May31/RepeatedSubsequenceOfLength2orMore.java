package May31;

public class RepeatedSubsequenceOfLength2orMore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inp="AABBC";
		
		int [] arr = new int [26];
		for(int i=0;i<inp.length();i++){
			char x=inp.charAt(i);
			arr[x-'A']++;
		}
		
		for(int i=0;i<26;i++){
			if(arr[i]>=3){
				System.out.println("True");
				return;
			}
		}
		String ns="";
		
		for(int i=0;i<inp.length();i++){
			char x= inp.charAt(i);
			if(arr[x-'A']>1)
				ns+=x;
		}
		
		if(checkpalindrome(ns))
			System.out.println("False");
		else
			System.out.println("True");

	}

	private static boolean checkpalindrome(String ns) {
		// TODO Auto-generated method stub
		
		int i=0;
		int j=ns.length()-1;
		while(i<=j){
			if(ns.charAt(i)!=ns.charAt(j))
				return false;
			
			i++;
			j--;
		}
		return true;
	}

}
