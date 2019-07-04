package com.epam;

public class Queen {

    private int[] x;
    private int quantity;

    public Queen(int N) {
        x = new int[N];
    }

    public void callplaceNqueens() {
        queensPlaces(0, x.length);
    }

    public int getQuantity() { return quantity; }

    public void queensPlaces(int row, int n) {
        for (int c = 0; c < n; c++) {
            if (canPlaceQueen(row, c)) {
                x[row] = c;
                if (row == n - 1) {
                    printQueens(x);
                } else {
                    queensPlaces(row + 1, n);
                }
            }
        }
    }

    public boolean canPlaceQueen(int row, int c) {
        for (int i = 0; i < row; i++) {
            if (x[i] == c ||(i - row) == (c - x[i]) || (i - row) == (x[i] - c))
            {
                return false;
            }
        }
        return true;
    }

    public void printQueens(int[] x) {
        quantity++;
        int N = x.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (x[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
