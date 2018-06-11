package march17;

import java.util.ArrayList;

public class NokiaKeypad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "157";

		ArrayList<String> sses = keyPad(s);
		System.out.println(sses);
	}

	static String[] codes = { "abc", "de", "fgh", "ijkl", "m", "nop", "qrs", "tuv", "wxyz", "." };

	public static ArrayList<String> keyPad(String str) {
		if (str.length() == 0) {
			ArrayList<String> res = new ArrayList<String>();
			res.add("");
			return res;
		}

		char ch = str.charAt(0);
		String f1=codes[(int)(ch-'0')];
//		System.out.println(f1);
		String rem = str.substring(1);

		ArrayList<String> res = keyPad(rem);
		ArrayList<String> mres = new ArrayList<String>();

		for (String rstr : res) {
			int i=0;
			while(i<f1.length()){
				char f=f1.charAt(i);
				mres.add(rstr+f);
				i++;
				
			}
		}
		return mres;

		

	}
}
