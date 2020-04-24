package application;

import chess.ChessPiece;

public class UI {


    public static void printBoard (ChessPiece[][] pieces){
        int i,j;

        for ( i = 0; i < pieces.length; i++){
            System.out.print((8 - i) + " ");

            for ( j = 0; j < pieces.length; j++){
                printPiece(pieces[i][j]);
            }
            System.out.println();
        }
        System.out.println("  A B C D E F G H");

    }

    private static void printPiece(ChessPiece piece){
        if (piece == null){
             System.out.print("-");
         }else{
            System.out.print(piece);
          }
        System.out.print(" ");
    }//metodo auxiliar para imprimir uma peça
}
