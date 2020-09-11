package Task;

/**
 * Created by PZON_SM on 12.08.2020.
 **/
public class Demo {
    public static void main(String[] args){
        ChessPiece blackPawn = new BlackPiece("BPionek",7,'d');
        ChessPiece whitePawn = new WhitePiece("WPionek",3,'f');
        ChessPiece whiteQueen = new WhiteQueen("Queen white");
        ChessPiece blackKing = new BlackKing("King black");

        System.out.println(blackPawn.getColor()==blackKing.getColor());
        System.out.println(blackPawn.getColor()==whiteQueen.getColor());
    }
}
