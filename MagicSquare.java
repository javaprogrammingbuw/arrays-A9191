package array;
//Bonus 2D Arrays
public class MagicSquare {
	
	public static boolean MagicSquare(int msq [][]){
		int n = 3;
		int[][] magic = new int [n][n];
		int resrow = 0;
		int rescol = 0;	
		
		for(int row = 0; row < n; row++) {
			if (row==n) {
				for(int col = 0; col < n; col++) {
					resrow = resrow + magic [row][col]; // row based
				}			
			}
			for(int col = 0; col < n; col++) {
				if (col==n) {
					for(row = 0; row < n; row++) {
						rescol = rescol + magic [col][row]; // col based
					}	
				
					}
				}
		}
		if ((rescol==resrow) && (rescol+resrow) == (resrow+resrow) && (rescol+resrow) == (rescol+rescol))
		{
			return true;
		}
		else {
			return false;
		}	
	}
	public static void main (String[] args){
		int z = 4;
		int[][] square = new int [z][z];
					square [0][0] = 2;
					square [0][1] = 7;
					square [0][2] = 6;
					square [1][0] = 9;
					square [1][1] = 5;
					square [1][2] = 1;
					square [2][0] = 4;
					square [2][1] = 3;
					square [2][2] = 8;		         

					if (MagicSquare(square)==true){
							System.out.println("Magic Square"); 
					}
	    	        else {
	    		    System.out.println("Not a magic Square");
	    	        }				
	}
}
		
	/*
	 * Todo: A magic square is a quadratic matrix where the sums of each row and
	 * each column are equal. All possible numbers from 1 to (side length)^2 have to occur
	 * in the square. Write a method that takes a 2D Array as input and checks if it is a magic
	 * square or not.
	 * */
