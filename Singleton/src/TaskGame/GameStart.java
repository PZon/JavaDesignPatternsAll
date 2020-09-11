package TaskGame;

/**
 * Created by PZON_SM on 07.08.2020.
 **/
public class GameStart {
    public static void main(String[] args) {
        Game game = Game.getInstance();
        game.letsPlay();

        int score2 = game.getScore();
        Game game2 = Game.getInstance();

        if(game == game2){
            System.out.println("Singleton");
            if(score2 == game2.getScore()) System.out.print("Points are the same");
        }
    }
}
