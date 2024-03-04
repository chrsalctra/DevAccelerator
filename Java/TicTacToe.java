import java.util.Scanner;

public class TicTacToe {
    public static void printBoard(char[][] brd) {
        for (int i = 0; i<brd.length; i++){
            for (int j = 0; j<brd[i].length; j++){
            System.out.print(brd[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

    Scanner scan = new Scanner(System.in);

    public int[] askUser(char[][] brd){
        int[] spot = new int[2];
        System.out.println("pick the row and column:");
        spot[0]= scan.nextInt();
        spot[1] = scan.nextInt();
        return spot;
    }

    public static int checkRows(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 'X'){
                    count++;
                } else if (board[i][j] == 'O'){
                    count--;
                }
            }
            if (Math.abs(count) == 3) {
                return count;
            } else {
                count = 0;
            }

        }
        return count;
    }
    
    
    public static int checkColumns(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[j][i] == 'X') {
                    count++;
                } else if (board[j][i] == 'O') {
                    count--;
                }
            }
            if (Math.abs(count) == 3) {
                return count;
            } else {
                count = 0;
            }

        }
        return count; 
    }
    
    
    public static int checkLeft(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X') {
                count++;
            } else if (board[i][i] == 'O') {
                count--;
            }
        }
        return count;
    }
    
    
    public static int checkRight(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            if(board[2 - i][i] == 'X'){
                count++;
            }else if (board[2 - i][i] == 'O') {
                count--;
            }
        }
        return count;
    }
    
    public static int checkWin(char[][] board) {    
        int count = 0;
        int rows = checkRows(board);

        // Math.abs returns the absolute value of a given number, removing any negative sign.
        if (Math.abs(rows) == 3) return rows; // If the block of code consists of only one line, you can omit the curly braces.

        int columns = checkColumns(board);
        if (Math.abs(columns) == 3) return columns;

        int leftDiagonal = checkLeft(board);
        if (Math.abs(leftDiagonal) == 3) return leftDiagonal;

        int rightDiagonal = checkRight(board);
        if (Math.abs(rightDiagonal) == 3) return rightDiagonal;

        return count;
    }
    

    public void main(String[] args) {
        System.out.println("Let's play tic tac toe:\n");
        char board[][] = {
            {'_','_','_'},
            {'_','_','_'},
            {'_','_','_'}
        };
        printBoard(board);
        for (int i = 0; i<9; i++) {
            if (i%2 == 0) {
                System.out.println("Turn: X");
                boolean taken = true;
                while (taken == true){
                int[] spot = askUser(board);
                if(board[spot[0]-1][spot[1]-1] != '_'){
                   System.out.println("spot taken! try again >.> ");
                } else {
                    board[spot[0]-1][spot[1]-1] = 'X';
                    printBoard(board);
                    taken = false;
                }
            }
         
            } else {
                System.out.println("Turn: O");
                boolean taken = true;
                while (taken == true){
                    int[] spot = askUser(board);
                    if(board[spot[0]-1][spot[1]-1] != '_'){
                       System.out.println("spot taken! try again >.> ");
                    } else {
                        board[spot[0]-1][spot[1]-1] = 'O';
                        printBoard(board);
                        taken = false;
                    }
                }
            }
            int count =checkWin(board);
            if (count == 3) {
                System.out.println("X wins!");
                System.exit(0) ;
              } else if (count == -3) {
              System.out.println("O wins!");
              System.exit(0) ;
               } else {
                continue;
               }
        
        }
        System.out.println("Its a tie!");
    }
}