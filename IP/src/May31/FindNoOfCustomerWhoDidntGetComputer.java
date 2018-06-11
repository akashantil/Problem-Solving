package May31;

import java.util.HashSet;

public class FindNoOfCustomerWhoDidntGetComputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noc = 1;
		String cust = "ABCBCA";

		System.out.println(solve(noc, cust));

	}

	public static int solve(int noc, String cust) {

		HashSet<Character> set = new HashSet<>();
		int nowc = 0;

		for (int i = 0; i < cust.length(); i++) {
			char x = cust.charAt(i);

		
			if(noc>0 && 
					set.contains(x)==false){
				set.add(x);
				noc--;
			}
			else if(noc>=0 && set.contains(x)==true){
				set.remove(x);
				noc++;
			}
			else if(noc<=0 && set.contains(x)==false){
				nowc++;
				noc--;
				set.add(x);
			}
			else  if(noc<=0 && set.contains(x)==true) {
				set.remove(x);
				noc++;
				
			}
			
			
		
		}
		return nowc;

	}

}
