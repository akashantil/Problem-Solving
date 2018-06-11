package assingmentRecursion2;

import java.util.ArrayList;
import java.util.Scanner;

public class Pep_Java_7Recursion_48MazzePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		ArrayList<String> f = Maze(0, 0, n, m);
		System.out.println(f.size());
		System.out.println(f);

		mazeQA(0, 0, n, m, "");
	}

	public static ArrayList<String> Maze(int r, int c, int x, int y) {
		if (r == x && c == y) {
			ArrayList<String> ab = new ArrayList<String>();
			ab.add("");
			return ab;
		}
		if (r > x || c > y) {
			ArrayList<String> ab = new ArrayList<String>();
			
			return ab;

		}
		ArrayList<String> myresult = new ArrayList<String>();

		ArrayList<String> homove = Maze(r, c + 1, x, y);

		ArrayList<String> vemove = Maze(r + 1, c, x, y);

		
		
		for (String ab : homove) {
			myresult.add("H"+ab );

		}
		for (String ab : vemove) {
			myresult.add("V"+ab);

		}

		return myresult;

	}
	public static void mazeQA(int r,int c,int x,int y,String ans){
		if(r==x && c==y){
			System.out.println(ans);
			return;
		}
		if(r>x || c>y){
			return;
		}
		mazeQA(r, c+1, x, y, ans+"H");
		mazeQA(r+1, c, x, y, ans+"V");
		
		
	}
}
