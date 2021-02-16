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
	public static void mkChoice() {
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

	public static void main(String[] args) {
			board();
			mkChoice();
	}

}
