package May30th;

public class SentenceValidOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sent="My name is RamA.";
		
		String arr[] = sent.split(" ");
		if(arr[0].charAt(0)<'A'||arr[0].charAt(0)>'Z'){
			System.out.println("Invalid");
			return;
		}
		else if(arr[arr.length-1].charAt(arr[arr.length-1].length()-1)!='.'){
			System.out.println("Invalid");
			return;
		}
		else{
			for(int i=0;i<arr.length;i++){
				String word=arr[i];
				
				for(int j=0;j<word.length();j++){
					char ch = word.charAt(j);
					if(ch>='A' && ch<='Z' && j!=0){
						System.out.println("Invalid");
						return;
					}
					
				}
				
				
			}
		}
		System.out.println("Valid");

	}

}
