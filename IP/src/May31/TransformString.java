package May31;

public class TransformString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String one = "AAA";
		String two = "AA";
		
		
		int [] a = new int [26];
		int [] b = new int [26];
		
		for(int i=0;i<one.length();i++){
			char x= one.charAt(i);
			a[x-'A']++;
		}
		for(int i=0;i<two.length();i++){
			char x= two.charAt(i);
			b[x-'A']++;
		}
		
		for(int i=0;i<26;i++){
			if(a[i]!=b[i]){
				System.out.println("Invalid");
				return;
			}
			
		}
		
		
		

		int i = one.length() - 1;
		int j = two.length() - 1;
		int res = 0;

		while (j >= 0) {
			
			if(i<0)
				break;

			char x = one.charAt(i);
			char y = two.charAt(j);
			if (x == y) {
				i--;
				j--;

			}

			else if (x != y) {
				i--;
				res++;
			}

		}
		System.out.println(res);

	}

}
