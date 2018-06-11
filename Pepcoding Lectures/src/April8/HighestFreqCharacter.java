package April8;

public class HighestFreqCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String res= "aabbbbbbbbbbbrakadabra";
		
		int [] arr = new int [26];
		
		for(int i=0;i<res.length();i++){
			char ch=res.charAt(i);
			arr[ch-'a']++;
		}
		int ind=-1;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
				ind=i;
			}
			
		}
		System.out.println("Highest Freq Charcter is --->" + (char)('a' +ind)+"  and its freq is -->"+arr[ind]);
		
	}

}
