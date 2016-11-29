package maingame;

import java.util.*;

public class GameSession {

	public void start() {
		String playerName;
		Scanner sc = new Scanner(System.in);
		playerName = this.nameSelection(sc);
		
	}

	private String nameSelection(Scanner sc) {
		System.out.println("Hello, player! What is your name?");
		String playerName = sc.next();
		while (playerName.length() > 20) {
			System.out
					.println("The chosen name is too long. Please select a new, shorter name.");
			playerName = sc.next();
		}
		if(playerName.length() <= 0){
			playerName = "Player1";
		}
		System.out.println(String.format("Excellent, %s! Shall we begin the game?",playerName));
		return playerName;

	}
}