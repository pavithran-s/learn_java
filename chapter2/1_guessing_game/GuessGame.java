package guessGamePackage;

import java.util.Random;

public class GuessGame {
    Player p1;
    Player p2;
    Random randGenerator = new Random();

    private void initPlayer() {
        this.p1 = new Player();
        this.p1.setPlayerName("Amazon");

        this.p2 = new Player();
        this.p2.setPlayerName("Flipkart");
    }

    private int getRandomNumber() {
        System.out.println("Number generated");
        return randGenerator.nextInt(10);
    }

    public void startGame() {
        initPlayer();
    
        int numberToGuess = getRandomNumber();
        while (true) {
            int p1Number = this.p1.guess();
            int p2Number = this.p2.guess();

            if (p1Number == numberToGuess || p2Number == numberToGuess) {
                if (p1Number == numberToGuess) {
                    System.out.println("Player " + this.p1.getPlayerName() + " won!");
                }
                if (p2Number == numberToGuess) {
                    System.out.println("Player " + this.p2.getPlayerName() + " won!");
                }
                break;
            }
            System.out.println("Wrong re-try :(");
        }
    }
}
