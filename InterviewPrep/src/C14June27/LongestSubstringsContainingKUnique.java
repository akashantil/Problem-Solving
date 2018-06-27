package C14June27;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubstringsContainingKUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		int k = sc.nextInt();

		// HashMap<Character, Integer> map = new HashMap<>();
		HashMap<Character, Integer> window = new HashMap<>();
		
		int osi = 0;
		int oei = 0;

		boolean wfound = false;
		for (int i = 0; i < k; i++) {
			char ch = inp.charAt(i);
			window.put(ch, window.containsKey(ch) ? window.get(ch) + 1 : 1);

		}
		if (window.size() == k) {
			
			osi = 0;
			oei = k - 1;

		}
		int csi = 0;
		int cei = k;
		for (int i = k; i < inp.length(); i++) {
			char ch = inp.charAt(i);
			if (wfound == true) {
				window.put(ch, window.containsKey(ch) ? window.get(ch) + 1 : 1);

				if (window.size() < k) {

					cei++;
				} else if (window.size() == k) {
					
					if (cei - csi + 1 > oei-osi+1) {
						oei = cei;
						osi = csi;

					} else
					
					{
						
					if(window.get(inp.charAt(csi))-1>0){
						window.put(inp.charAt(csi), window.get(inp.charAt(csi)-1));
						
					}
					else
						window.remove(inp.charAt(csi));
					
					csi++;
					
				}

			} else {
				char re = inp.charAt(i - k);
				if (window.get(re) - 1 > 0) {
					window.put(re, window.get(re) - 1);
				} else {

					window.remove(re);

				}
				if (window.size() <= k) {

					csi = i;
					cei = k;
					wfound = true;

				}
			}
			if (cei - csi + 1 > oei - osi + 1) {
				osi = csi;
				oei = cei;

			}
		}
		}
		for (int i = osi; i <= oei; i++) {
			System.out.print(inp.charAt(i));
		}

	}

}
