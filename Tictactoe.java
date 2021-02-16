package tiktaktoe;

public class Tictactoe {
	static char []arr=new char[10];
	public  static char[] board() {
		for(int i=1 ; i<10 ; i++) {
			arr[i]=' ';
	
		}
		//This method create a board
		return arr;
	}

	public static void main(String[] args) {
			board();
	}

}
