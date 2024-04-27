package backtracking;
import javax.swing.plaf.IconUIResource;
public class N_Queens {

    public static void main(String[] args) {
        // Големината на шаховската табла
        int n = 4;
        // Иницијализација на шаховска табла
        boolean[][] board = new boolean[n][n];//таблата
        // Печатење на бројот на валидни начини за поставување на кралици
        System.out.println(queens(board, 0));
    }
    // Метод за поставување на кралиците на шаховската табла
    static int queens(boolean[][] board, int row) {
        // Ако сме стигнале до крајот на таблата, прикажи решение и врати 1
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }
        // Бројач за валидни начини за поставување на кралиците
        int count = 0;
        // Поставување на кралицата и проверка за секоја колона
        for (int col = 0; col < board.length; col++) {
            // Постави ја кралицата ако е безбедно
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += queens(board, row + 1);
                board[row][col] = false;  // Backtrack ако е потребно
            }
        }
        // Врати вкупниот број на валидни начини за поставување
        return count;
    }
    // Метод за прикажување на решението на шаховската табла
    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q ");  // Прикажи кралица
                } else {
                    System.out.print("X ");  // Прикажи празно место
                }
            }
            System.out.println();
        }
    }
    // Метод за проверка дали е безбедно поставување на кралица на дадено место
    static boolean isSafe(boolean[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;  // Проверка за колизија по вертикала
            }
        }
        // Проверка за дијагонала лево
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }
        // Проверка за дијагонала десно
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }
        return true;  // Нема колизии, безбедно за поставување на кралица
    }
}
