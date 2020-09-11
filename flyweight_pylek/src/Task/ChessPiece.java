package Task;

/**
 * Created by PZON_SM on 12.08.2020.
 **/
public abstract class ChessPiece {
    private String name;
    private int nrPos;
    private char ltrPos;

    private Color color;


    public ChessPiece(String name, int nrPos, char ltrPos, String tmpColor) {
        this.name = name;
        this.nrPos = nrPos;
        this.ltrPos = ltrPos;
        switch (tmpColor.toLowerCase()) {
            case "white":
                this.color = ColorRepository.getWhite();
                break;
            case "black":
                this.color = ColorRepository.getBlack();
                break;
            default:
                throw new UnsupportedOperationException("No such a color");
        }
    }

    public Color getColor() {
        return color;
    }
}
