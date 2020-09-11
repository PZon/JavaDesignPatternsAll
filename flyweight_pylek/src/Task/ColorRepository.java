package Task;

/**
 * Created by PZON_SM on 12.08.2020.
 **/
public class ColorRepository {
    private static Color white = new Color(0,0,0);
    private static Color black = new Color(255,255,255);

    public ColorRepository() {
    }

    public static Color getWhite() {
        return white;
    }

    public static Color getBlack() {
        return black;
    }

}
