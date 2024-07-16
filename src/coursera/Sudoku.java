package coursera;
import java.util.Scanner;
import java.io.PrintWriter;
public class Sudoku {
    static final int N = 9;
    static final int[][] GRID = new int[N][N];

    /* Takes a partially filled-in grid and attempts
    to assign values to all unassigned locations in
    such a way to meet the requirements for
    Sudoku solution (non-duplication across rows,
    columns, and boxes) */
    static boolean solveSudoku(int row, int col) {
 
        /*if we have reached the 8th
           row and 9th column (0
           indexed matrix) ,
           we are returning true to avoid further
           backtracking       */
        if (row == N - 1 && col == N)
            return true;

        // Check if column value  becomes 9 ,
        // we move to next row
        // and column start from 0
        if (col == N) {
            row++;
            col = 0;
        }

        // Check if the current position
        // of the grid already
        // contains value >0, we iterate
        // for next column
        if (GRID[row][col] != 0)
            return solveSudoku(row, col + 1);

        for (int num = 1; num <= N; num++) {

            // Check if it is safe to place
            // the num (1-9)  in the
            // given row ,col ->we move to next column
            if (isSafe(row, col, num)) {
 
                /*  assigning the num in the current
                (row,col)  position of the grid and
                assuming our assigned num in the position
                is correct */
                GRID[row][col] = num;

                // Checking for next
                // possibility with next column
                if (solveSudoku(row, col + 1))
                    return true;
            }
            /* removing the assigned num , since our
               assumption was wrong , and we go for next
               assumption with diff num value   */
            GRID[row][col] = 0;
        }
        return false;
    }

    // Check whether it will be legal
    // to assign num to the
    // given row, col
    static boolean isSafe(int row, int col, int num) {
        // Check if we find the same num
        // in the similar row , we
        // return false
        for (int x = 0; x < N; x++)
            if (GRID[row][x] == num)
                return false;

        // Check if we find the same num
        // in the similar column ,
        // we return false
        for (int x = 0; x < N; x++)
            if (GRID[x][col] == num)
                return false;

        // Check if we find the same num
        // in the particular 3*3
        // matrix, we return false
        int startRow = row - row % 3, startCol
                = col - col % 3;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (GRID[i + startRow][j + startCol] == num)
                    return false;

        return true;
    }

    static void print() {
        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                pw.print(GRID[i][j] + " ");
            pw.println();
        }
        pw.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            String[] line = sc.nextLine().split(" ");
            for (int j = 0; j < N; j++) {
                GRID[i][j] = Integer.parseInt(line[j]);
            }
        }

        if (solveSudoku(0, 0)) print();
        else System.out.println("No Solution exists");
        sc.close();
    }
}