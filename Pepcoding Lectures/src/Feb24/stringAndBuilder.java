package Feb24;

public class stringAndBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aaabbaaaaacccccccd";
		// toggle(s);
		// Modify2(s);
		compression2Sb(s);
	}

	public static void toggle(String s) {

		StringBuilder sb1 = new StringBuilder(s);
		int l = sb1.length();
		for (int i = 0; i < l; i++) {
			char c = sb1.charAt(i);
			if (c >= 'a' && c <= 'z') {
				sb1.setCharAt(i, (char) (c - 32));
			} else if (c >= 'A' && c <= 'Z') {
				sb1.setCharAt(i, (char) (c + 32));

			} else {
				sb1.setCharAt(i, c);
			}
		}
		System.out.println(sb1);

	}

	public static void Modify1(String s) {
		StringBuilder sb = new StringBuilder(s);
		int l = sb.length();
		for (int i = 0; i < l; i += 2) {
			char ch = sb.charAt(i);
			ch--;
			sb.setCharAt(i, (ch));

		}
		for (int i = 1; i < l; i += 2) {
			char ch = sb.charAt(i);
			ch++;
			sb.setCharAt(i, (ch));

		}
		System.out.println(sb);

	}

	public static void Modify2(String s) {
		// Wrong Approach
		StringBuilder sb = new StringBuilder(s);
		int l = sb.length();
		l = l + l - 1;
		int i = 0;
		while (i < l - 1) {
			int j = i + 1;
			char c1 = sb.charAt(i);
			char c2 = sb.charAt(j);

			int re = c2 - c1;
			if (re > 0) {
				i += 2;
			} else {
				i += 3;
			}
			sb.insert(j, re);

		}
		System.out.println(sb);

	}

	// Bhaiya Approach
	public static void Modify22(String s) {
		StringBuilder sb = new StringBuilder(" ");
		for (int i = 0; i < s.length(); i++) {
			char fch = s.charAt(i);
			char nch = s.charAt(i + 1);
			sb.append(fch);
			sb.append(nch - fch);
		}
		sb.append(s.charAt(s.length() - 1));

	}

	public static void compression1(String s) {
		// bad approach order of n^2
		StringBuilder sb = new StringBuilder(s);
		int i = 0;
		int j = 1;
		while (i < sb.length() && j < sb.length()) {

			char fch = sb.charAt(i);
			char sch = sb.charAt(j);
			if (fch == sch) {
				sb.deleteCharAt(j);

			} else {
				i++;
				j++;
			}
		}
		System.out.println(sb);

	}
	
	public static void compressionSb(String s){
		StringBuilder sb = new StringBuilder(" ");
		for(int i=0;i<s.length()-1;i++){
			char fch=s.charAt(i);
			char nch=s.charAt(i+1);
			if(fch!=nch){
				sb.append(fch);
			}
		}
		sb.append(s.charAt(s.length()-1));
		System.out.println(sb);
	}
	public static void compression2Sb(String s){
		StringBuilder sb = new StringBuilder(" ");
		int count=1;
		for(int i=0;i<s.length()-1;i++){
			
			char fch=s.charAt(i);
			char nch=s.charAt(i+1);
			if(fch!=nch){
				
				sb.append(fch);
				if(count>1){
					sb.append(count);
					count=1;
				}
			}
			else{
				count++;
			}
			
		}
		sb.append(s.charAt(s.length()-1));
		if(count>1){
			sb.append(count);
		}
		
		System.out.println(sb);
	}


}
