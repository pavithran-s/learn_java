package guessGamePackage;

import java.util.Scanner;

public class Player {
    private String playerName;
    private Scanner inputRead = new Scanner(System.in);

    public void setPlayerName(String name) {
        this.playerName = name;
    }

    public String getPlayerName() {
        return this.playerName; 
    }
    public int guess() {
        System.out.print(String.format("[%s] Guess the number: ", this.playerName));
        String inputFromUserString = this.inputRead.nextLine();
        return Integer.parseInt(inputFromUserString);
    }
}
