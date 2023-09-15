package it.polito.tdp;

public class MagicSquare {
    
	
	public static void main(String[] args) {
        int n = 3; // Cambia n con l'ordine desiderato del quadrato magico
        int[][] magicSquare = new int[n][n];

// comment
        fillSquare(magicSquare, n);
        printMagicSquare(magicSquare);
    }

    public static void fillSquare(int[][] square, int n) {
        int row = 0;
        int col = n / 2;
        int maxNum = n * n;

        for (int num = 1; num <= maxNum; num++) {
            square[row][col] = num;
            row--;
            col++;

            if (num % n == 0) {
                row += 2;
                col--;
            } else {
                if (row < 0) {
                    row = n - 1;
                }
                if (col == n) {
                    col = 0;
                }
            }
        }
    }

    public static void printMagicSquare(int[][] square) {
        int n = square.length;

        System.out.println("Quadrato Magico di ordine " + n + ":");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(square[i][j] + "\t");
            }
            System.out.println();
        }
    }
}