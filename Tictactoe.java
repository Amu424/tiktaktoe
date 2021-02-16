package tiktaktoe;

import java.util.Scanner;

public class Tictactoe {
	static char []arr=new char[10];
	public  static char[] board() {
		for(int i=1 ; i<10 ; i++) {
			arr[i]=' ';
	
		}
		//This method create a board
		return arr;
	}
	public static void mkChoice() {//to make user choice
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x or o");
		char player1=sc.next().charAt(0);
		char comp=' ';
		if(player1=='o'||player1=='O' ) {
			comp='X';
		}
		else if(player1=='x'||player1=='X') {
			comp='O';
			}
		else {
			System.out.println("invalid entry");
		}
		System.out.println("Player is"+player1+" "+"computer is"+comp);
	sc.close();
	}
public static void disBoard (char[]board) {
	System.out.println(board[1]+"|"+board[2]+"|"+board[3]);
	System.out.println("-------");
	System.out.println(board[4]+"|"+board[5]+"|"+board[6]);
	System.out.println("-------");
	System.out.println(board[7]+"|"+board[8]+"|"+board[9]);
	System.out.println(board);
	
}
public static void mkMove(char[]board) {               //for making move on board
	Scanner sc1=new Scanner(System.in);
	System.out.println("Enter location where you want");
	int location=sc1.nextInt();
	if(0 < location && location<10) {
		if(board[location]==' ') {
			System.out.println(" Your input is at valid location");
		}
		else {
			System.out.println("Your input is invalid");
		}
	}
	sc1.close();
}
	public static void main(String[] args) {
			board();
			mkChoice();
			disBoard(board());
			mkMove(board());
	}

}
