package backtracking;
public class N_Knights {//ime na klasa
    public static void main(String[] args) {//glaven metod
        int n = 4;//4 redovi i 4 koloni
        boolean[][] board = new boolean[n][n];//dodeluvame vrednost na board -> vrednosta ja zema od n -> znaci 4 redovi i 4 koloni
        knight(board, 0, 0, 4);//povkuvanje na metodot knight vo glavnata funkcija
    }
    static void knight(boolean[][] board, int row, int col, int knights) {//metod za raspredeluvanje na konji na shahovskata tabla
        if (knights == 0) {//ako site konji se postaveni prikazi resenie
            display(board);//prikaz
            System.out.println();//pecatenje nov red
            return;//zavrsuvanje na programata i se vrakja od kaj so bila povikana
        }

        if (row == board.length - 1 && col == board.length) {//dokolku smo stignale do poslednio red i kolona da se zavrse
            return;//zavrsuvanje na programata i se vrakja od kaj so bila povikana
        }

        if (col == board.length) {//ako sme na krajo od kolonata pomini na sleden red
            knight(board, row + 1, 0, knights);
            return;//zavrsuvanje na programata i se vrakja od kaj so bila povikana
        }

        if (isSafe(board, row, col)) {//proverka na metodot isSafe -> dokolku postavuvanjeto e bezbedno togas probaj
            board[row][col] = true;
            knight(board, row, col + 1, knights - 1);
            board[row][col] = false;  //Backtrack ako e potrebno
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {//metod za proverka na toa dali e bezbedno postavuvanjeto na konjite
        if (isValid(board, row - 2, col - 1) && board[row - 2][col - 1]) {//proveruvame gi site 4 mozni napadnati pozicii od strana na konjot
            return false; //ako e napadnata vrati false inaku true
        }
        if (isValid(board, row - 1, col - 2) && board[row - 1][col - 2]) {
            return false;
        }
        if (isValid(board, row - 2, col + 1) && board[row - 2][col + 1]) {
            return false;
        }
        if (isValid(board, row - 1, col + 2) && board[row - 1][col + 2]) {
            return false;
        }
        return true;
    }
    static boolean isValid(boolean[][] board, int row, int col) {//metod za proverka na validnosta na pozicijata
        return row >= 0 && row < board.length && col >= 0 && col < board.length; //vrakja true ako e ispolnet uslovot , inaku false
    }
    private static void display(boolean[][] board) {//funkcija za prikazuvanje na resenieto na sahovskata tabla
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("K ");  //prikazi konj
                } else {
                    System.out.print("X ");  //prikazi prazno sahovsko mesto
                }
            }
            System.out.println();//pecatenje na nova linija
        }
    }
}
