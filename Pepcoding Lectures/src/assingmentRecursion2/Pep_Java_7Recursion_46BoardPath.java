package assingmentRecursion2;

import java.util.ArrayList;
import java.util.Scanner;

public class Pep_Java_7Recursion_46BoardPath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dest = sc.nextInt();
		int dice = sc.nextInt();
		ArrayList<String> ab = BoardPAth(0, dest, dice);
		System.out.println(ab.size());
		System.out.println(ab);
		// TODO Auto-generated method stub
		
		BoardPathQA(0, dest, dice, "");

	}

	public static ArrayList<String> BoardPAth(int src, int dest, int dice) {
		if (src == dest) {
			ArrayList<String> f = new ArrayList<String>();
			f.add("");
			return f;

		}

		ArrayList<String> pathfromstod = new ArrayList<String>();
		for (int i = 1; i <= dice; i++) {
			if (src + i <= dest) {
				ArrayList<String> pathsfromitodest = BoardPAth(src + i, dest, dice);
				for (String res : pathsfromitodest) {
					pathfromstod.add(i + res);
				}
			}

		}
		return pathfromstod;

	}
	public static void BoardPathQA(int src,int des,int dice,String ans){
		if(src==des){
			System.out.println(ans);
			return;
		}
		
		
		
		for(int i=1;i<=dice;i++){
			if(i+src<=des){
			BoardPathQA(src+i, des, dice, ans+i);
			
			}
		}
		
		
		
	}
}
