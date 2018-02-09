import java.util.*;

public class QueenBoard{

    //instance variables
    private int[][] board;
    private int size = 0; 

    //constructor
    public QueenBoard(int n){
	board = new board[n][n];
	size = n;
    }

    //private methods
    private boolean addQueen(int r, int c){
	board[r][c] == -1;

	for(int j = r; j < size; j++){
	    for(int i = c; i < size; i++){
		board[j][i] += 1;
	    }
	}
	
    }
    //helper methods
    
    private boolean removeQueen(int r, int c){

    }
    //helper methods


    //public methods
    /**
     *@return The output string formatted as follows:
     *All numbers that represent queens are replaced with 'Q' 
     *all others are displayed as underscores '_'
     *There are spaces between each symbol:  
     *Q _ _ _
     *_ _ Q _
     * etc.
    */
    public String toString(){}

    /**
     *@return false when the board is not solveable and leaves the board filled with zeros; 
     *        true when the board is solveable, and leaves the board in a solved state
     *@throws IllegalStateException when the board starts with any non-zero value
    */
    public boolean solve(){
	return solveHelp(board, size);  
    }
    public boolean solveHelp(int[][] board, int size){
	//2x2 and 3x3 are unsolveable
	if(size == 2 || size == 3){
	    for(int j = 0; j < size; j++){
		for(int i = 0; i < size; i++){
		    board[j][i] == 0;
		}
	    }
	}

	
    }
  
    /**
     *@return the number of solutions found, and leaves the board filled with only 0's
     *@throws IllegalStateException when the board starts with any non-zero value
    */
    public int countSolutions(){}
  


}
