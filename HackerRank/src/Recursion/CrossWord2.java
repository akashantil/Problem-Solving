package Recursion;

import java.util.ArrayList;

public class CrossWord2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [][] crossword = {
				{'+','-','+','+','+','+','+','+','+','+'},
				{'+','-','+','+','+','+','+','+','+','+'},
				{'+','-','+','+','+','+','+','+','+','+'},
				{'+','-','-','-','-','-','+','+','+','+'},
				{'+','-','+','+','+','-','+','+','+','+'},
				{'+','-','+','+','+','-','+','+','+','+'},
				{'+','+','+','+','+','-','+','+','+','+'},
				{'+','+','-','-','-','-','-','-','+','+'},
				{'+','+','+','+','+','-','+','+','+','+'},
				{'+','+','+','+','+','-','+','+','+','+'}
				
		};
		
		
		

		String words = "LONDON;DELHI;ICELAND;ANKARA";

		String[] arr = words.split(";");
		findspots(crossword,arr);
		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}

	}

	public static void findspots(char[][] crossword,String [] arr) {
		ArrayList<Integer> rsp = new ArrayList<>();
		ArrayList<Integer> csp = new ArrayList<>();
		ArrayList<Integer> rep = new ArrayList<>();
		ArrayList<Integer> cep = new ArrayList<>();
		
		for (int i = 0; i < crossword.length; i++) {
			for (int j = 0; j < crossword[0].length; j++) {
				if (crossword[i][j] == '-') {
									
					findVSpoint(crossword, i, j, rsp, csp,rep,cep);	
					findHSpoint(crossword, i, j, rsp, csp,rep,cep);	
					
					

				}
			}
		}
		
		for(int i=0;i<arr.length;i++){
			if(arr[i].length()==(rep.get(i)-rsp.get(i))|| arr[i].length()==cep.get(i)-csp.get(i)){
				
				
			}
		}
		
		
		System.out.println(rsp);
		System.out.println(csp);
		System.out.println(rep);
		System.out.println(cep);
		

	}

	public static void findVSpoint(char[][] crossword, int row, int col, ArrayList<Integer> rsp,
			ArrayList<Integer> csp, ArrayList<Integer> rep,
			ArrayList<Integer> cep) {
		if (row == -1 || crossword[row][col] == '+') {
			if (row + 2 < crossword.length && crossword[row + 2][col] == '-') {
				boolean pir=false;
				boolean pic=false;
				for(int i=0;i<rsp.size();i++){
					if(rsp.get(i)==row+1)
						pir=true;
					if(csp.get(i)==col)
						pic=true;
					
				}
				if(pir==true && pic==true){
					return;
					
				}
				else{
				rsp.add(row + 1);
				csp.add(col);
				findVEpoint(crossword, row+1, col, rep, cep);
				return;
				}
			}
			return;
		}

		if (checkValid(crossword, row, col) == true)
			findVSpoint(crossword, row - 1, col, rsp, csp,rep,cep);

	}

	public static void findHSpoint(char[][] crossword, int row, int col, ArrayList<Integer> rsp,
			ArrayList<Integer> csp, ArrayList<Integer> rep,
			ArrayList<Integer> cep) {
		if (col == -1 || crossword[row][col] == '+') {
			if (col + 2 < crossword[0].length && crossword[row][col + 2] == '-') {
				boolean pir=false;
				boolean pic=false;
				
				for(int i=0;i<rsp.size();i++){
					if(rsp.get(i)==row)
						pir=true;
					if(csp.get(i)==col+1)
						pic=true;
					
				}
				if(pir==true && pic==true){
					return;
					
				}
				else{
				
				
				rsp.add(row );
				csp.add(col+1);
				findHEpoint(crossword, row, col+1, rep, cep);
				return;
				}
			}
			return;
		}

		if (checkValid(crossword, row, col) == true)
			findHSpoint(crossword, row, col - 1, rsp, csp,rep,cep);

	}
	
	public static void findVEpoint(char[][] crossword,int row,int col,
			ArrayList<Integer>rep,ArrayList<Integer>cep){
		if(row==10 ||crossword[row][col]=='+'){
			if(row-2>=0 && crossword[row-2][col]=='-'){
				
				
				boolean pir=false;
				boolean pic=false;
				for(int i=0;i<rep.size();i++){
					if(rep.get(i)==row-1)
						pir=true;
					if(cep.get(i)==col)
						pic=true;
					
				}
				if(pir==true && pic==true){
					return;
					
				}
				else{
				rep.add(row - 1);
				cep.add(col);
				return;
				}
			}
			return;
		}
		
		
		if(checkValid(crossword, row, col)==true)
			findVEpoint(crossword, row+1, col, rep, cep);
		
	}
	
	public static void findHEpoint(char[][] crossword,int row,int col,
			ArrayList<Integer>rep,ArrayList<Integer>cep){
		if(col==10 ||crossword[row][col]=='+'){
			if(col-2>=0 && crossword[row][col-2]=='-'){
				
				
				boolean pir=false;
				boolean pic=false;
				for(int i=0;i<rep.size();i++){
					
					if(cep.get(i)==col-1)
						pic=true;
					if(rep.get(i)==row)
						pir=true;
					
				}
				if(pir==true && pic==true){
					return;
					
				}
				else{
				rep.add(row );
				cep.add(col-1);
				return;
				}
			}
			return;
		}
		
		
		if(checkValid(crossword, row, col)==true)
			findHEpoint(crossword, row, col+1, rep, cep);
		
	}


	public static boolean checkValid(char[][] crossword, int row, int col) {

		if (row >= 0 && col >= 0 && crossword[row][col] == '-' && row<=9 && col<=9) {
			return true;
		}

		return false;

	}
	

}
