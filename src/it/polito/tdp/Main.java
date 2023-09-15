package it.polito.tdp;

public class Main {
    public static void main(String[] args) {
        int n = 201; // Cambia n con l'ordine desiderato del quadrato magico
        
        if (n % 2 != 0) {
            
        	int[][] magicSquare = new int[n][n];

        	MagicSquare.fillSquare(magicSquare, n);
        	MagicSquare.printMagicSquare(magicSquare);
        } else {
        	System.out.println(n + " è un numero pari. Soluzione non implementabile.");
        }
    }
}