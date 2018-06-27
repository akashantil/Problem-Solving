package C03July15;

import java.util.Arrays;
import java.util.Scanner;

public class NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		char[] arr = inp.toCharArray();

		int idx = -1;

		for (int i = arr.length - 1; i > 0; i--) {
			int cno = arr[i] - '0';
			int pno = arr[i - 1] - '0';
			if (cno > pno){
				idx = i;
				break;
			}

		}
		if (idx == -1) {
			Arrays.sort(arr);
			String ans="";
			for(int i=0;i<arr.length;i++)
				ans+=arr[i];
			System.out.println(ans);
				

		} else {
			int tbs=arr[idx-1]-'0';
			int min=Integer.MAX_VALUE;
			int sidx=-1;
			for(int i=idx;i<arr.length;i++){
				int cno=arr[i]-'0';
				if(cno>tbs && cno<min){
					min=cno;
					sidx=i;
				}
				
			}
			char temp=arr[idx-1];
			arr[idx-1]= (char) (min+'0');
			arr[sidx]=temp;
			String ques="";
			for(int i=0;i<arr.length;i++)
				ques+=arr[i];
			
			String fp=ques.substring(0, idx);
			String sp=ques.substring(idx);
			char [] sorted=sp.toCharArray();
			Arrays.sort(sorted);
			sp="";
			for(int i=0;i<sorted.length;i++)
				sp+=sorted[i];
			
			System.out.println(fp+sp);
			
			
				
			

		}
	}
}
