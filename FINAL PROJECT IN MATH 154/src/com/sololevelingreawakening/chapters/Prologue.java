/**
 * Collection of chapter classes that are playable in the course of the game.
 * @author Arjunraj Masmela.
 */
package com.sololevelingreawakening.chapters;

//import java.util.Scanner;
import com.sololevelingreawakening.architectsystem.*;

/**
 * GameStarter class that does the job in initially starting the game
 * @author Arjunraj Masmela.
 */
public class Prologue {
	
	/**
	 * Player for the game
	 */
	private Player player; 
	
	/**
	 * Player for the game
	 */
	private GameSystem gsystem;
	
	/**
	 * Constructor
	 */
	public Prologue() {
		this.gsystem = new GameSystem();
	}
	
	/**
	 * Initializes the player for the game
	 * @param player_Name Takes a string for the player name
	 */
	public void setPlayer(String player_Name) {
		this.player = new Player(player_Name);	
		}
	
	/**
	 * @return Returns the player to be taken later by the chapters
	 */
	public Player getPlayer() {
		return this.player;
	}
	
	/**
	 * Prologue starter Method
	 */
	public void startprologue() { 
		String Player_Name = null;
		
		System.out.println("\t\t\t~~~~~~~~~~~ SOLO LEVELING: REAWAKENING ~~~~~~~~~~~\n");
		System.out.println("=========================================================================================="
				+ "=============");
		gsystem.pressEnterKey();
		
		System.out.println("It started a few years ago, when the existence of Hunters and dungeons first appeared.");
		System.out.println("Hunters are superhuman beings with remarkable abilities.");
		System.out.println("Every hunter has a rank, with Rank E as its lowest and Rank S as its highest.");
		System.out.print("They are the ones tasked to safeguard humanity that lie within dungeons "
				+ "where lethal monsters are found.\n");
		gsystem.pressEnterKey();
		
		System.out.print("\n=========================================================================================="
				+ "=============\n");
		Player_Name = gsystem.getStringInput("\nPlease enter your name: ");
		this.setPlayer(Player_Name);
		System.out.println("\n========================================================================================"
				+ "===============");
		
		System.out.println("\nGreetings, Hunter " + this.player.getName() + "!");
		System.out.println("You have entered the world of Solo Leveling! However, you are currently a Rank E hunter.");
		System.out.println("Today, you will enter a dungeon. Kill the enemy boss to seal the dungeon.");
		System.out.println("Best of luck, Hunter!");
		gsystem.pressEnterKey();
	}

}
