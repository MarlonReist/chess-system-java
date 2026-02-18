package chess;

import boardgame.Board;

public class ChessMatch {
    //Esta Classe é o 'coração' do sistema de xadrez.
    //Aqui serão colocadas as regras do jogo.

    private Board board;

    public ChessMatch(){
        board = new Board(8,8);
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i=0; i<board.getRows(); i++){
            for (int j=0; j<board.getColumns(); j++){
                mat[i][j] = (ChessPiece) board.piece(i, j); //Há um 'downcast' aqui.
            }
        }
        return mat;
    }
}
