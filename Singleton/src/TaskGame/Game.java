package TaskGame;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by PZON_SM on 07.08.2020.
 **/
public class Game {
    private static Game instance = new Game();
    private int score = 0;
    private Random randomNr = new Random();
    private Scanner inputNr = new Scanner(System.in);

    private Game() {
    }

    public static Game getInstance(){
        return instance;
    }

    protected Object readResolve(){
        return getInstance();
    }

    public int getScore() {
        return score;
    }

    public void letsPlay(){
        for(int i=10; i>0; i--){
            int nr = randomNr.nextInt(9);
            System.out.print("\nYou have still: "+i+" attempt/s. Give me a number: ");
            int guessNr = inputNr.nextInt();
            if(nr==guessNr){
                score++;
                System.out.println("victory!!! Your score is:"+score);
            }else{
                System.out.println("Sorry I thought about nr: "+nr+" try again.");
            }
        }
        System.out.println("Your score is: "+score);
    }
}

