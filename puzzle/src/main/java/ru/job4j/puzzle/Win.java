package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[0][i] == 1) {
                rsl = checkVertical(board, i);
                break;
            }
            if (board[i][0] == 1) {
                rsl = checkHorizontal(board, i);
                break;
            }
        }
        return rsl;
    }

    public static boolean checkVertical(int[][] board, int number) {
        boolean rsl = true;
        for (int[] ints : board) {
            if (ints[number] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean checkHorizontal(int[][] board, int number) {
        boolean rsl = true;
        for (int i = 0; i < board[number].length; i++) {
            if (board[number][i] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
