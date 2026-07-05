class pr26 {

    static final int N = 4;

    static boolean isSafe(int[][] board, int row, int col) {

        for (int i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        for (int i = row, j = col; i < N && j >= 0; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    static boolean solve(int[][] board, int col) {

        if (col == N)
            return true;

        for (int i = 0; i < N; i++) {

            if (isSafe(board, i, col)) {

                board[i][col] = 1;

                if (solve(board, col + 1))
                    return true;

                board[i][col] = 0;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[][] board = new int[N][N];

        solve(board, 0);

        for (int[] row : board) {
            for (int x : row)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}