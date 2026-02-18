package boardgame;

public class Piece {
    protected Position position;
    private Board board;

    //position = null; Posição sempre começa com 0
    public Piece(Board board) {
        this.board = board;
        position = null;
    }
    //protected tabuleiro nao pode ser acessado por outras camadas, apenas pela camada de tabuleiro e as subclasses de peças
    protected Board getBoard() {
        return board;
    }
}
