 * Collection of chapter classes that are playable in the course of the game.
 * @author Arjunraj Masmela.
 */
package com.sololevelingreawakening.chapters;

import com.sololevelingreawakening.architectsystem.Chapter;
import com.sololevelingreawakening.architectsystem.GameSystem;
import com.sololevelingreawakening.architectsystem.Items;
import com.sololevelingreawakening.architectsystem.Player;
import com.sololevelingreawakening.enemy.GodStatue;
import com.sololevelingreawakening.iterables.Statues;
import com.sololevelingreawakening.iterables.StatuesCollection;
import com.sololevelingreawakening.iterables.StatuesIterator;

/**
 * Chapter 3 is the third and last playable chapter in the game
 * Takes in the architectsystem chapter class then uses the chapter manager
 * @author Arjunraj Masmela.
 */
public class Chapter3 extends Chapter implements ChapterManager {
	
	/**
	 * Controller of the chapter 
	 */
	private ChapterController chaptercontrol;
	
	/**
	 * The one playing the game 
	 */
	private Player player;
	
	/**
	 * Enemy present in the game
	 */
	private GodStatue godstatue;
	
	/**
	 * Game_system that helps in smooth flow of the chapter
	 */
	private GameSystem gsystem;
	
	/**
	 * Item class of the chapter
	 */
	private Items item;

	/**
	 * Chapter3 constructor
	 * @param chaptercontrol takes the mediator for the chapter
	 * @param gsystem takes the Game_System for the chapter
	 */
	public Chapter3(ChapterController chaptercontrol, GameSystem gsystem) {
		this.chaptercontrol = chaptercontrol;
		this.gsystem = gsystem;
		godstatue = new GodStatue();
		item = new Items();
		setEnemy(godstatue);
		this.setChapter(3);
	}

	@Override
	public void setPlayer(Player player) {
		this.player = player;
	}

	@Override
	public Player getPlayer() {
		return this.player;
	}

	@Override
	public void setItem(Items item) {
		this.item = item;	
		}

	@Override
	public Items getItem() {
		return this.item;
	}
	
	@Override
	public void playChapter() {
		String answer;
		int answered = 0;
		if(this.chaptercontrol.getInGame() == this.getChapter()) {
			System.out.println("\n===================================================================================="
					+ "===================");
			System.out.println("======================================================================================"
					+ "=================");
			System.out.println("\n\t\tWelcome to Chapter " + this.getChapter() + "!");
			System.out.println("\n===================================================================================="
					+ "===================");
			System.out.println("======================================================================================"
					+ "=================");
			System.out.println("\n After defeating the dungeon boss, Kasaka. A second gate opened."
					+ " It was a Double Dungeon!");
			gsystem.pressEnterKey();
			System.out.println("Upon entering the second gate, "
					+ "you immediately noticed that there is a big statue in the middle of the room.");
			System.out.println("A tablet is held up by a much more smaller statue near the entrance.");
			gsystem.pressEnterKey();
			System.out.println("It contains the words: " + godstatue.getName() + godstatue.getDescription());
			System.out.println("Below those words, a rule is printed in red.");
			System.out.println("\"You must worship the Supreme Being. A trial will be conducted. "
					+ "Different statues will appear in front of you. \nEach of them performs a patterned action. "
					+ "\nChoose carefully which statues to run away from or "
					+ "stay with for it will decide whether you live or die.");
			gsystem.pressEnterKey();
			System.out.println("The trial will start now! Choose [RUN] or [STAY].\n");
			StatuesCollection statuesCollection = new StatuesCollection();
			StatuesIterator statuesIterator = new StatuesIterator(statuesCollection.getStatues());
			Statues[] statues = new Statues[5];
			for(int i = 0; i < 5; i++) {
				statues[i] = (Statues) statuesIterator.randomDraw();
			}
			while(answered < 5) {
				System.out.println("\nStatue #" + (answered+1) + ": " + statues[answered].getStatue_equipment());
				answer = gsystem.getStringInput("Action: ");
				if(statues[answered].checkAction(answer)) {
					System.out.println("Result: " + statues[answered].getResult1());
					answered++;
					gsystem.pressEnterKey();
				} else {
					System.out.println("Result: " + statues[answered].getResult2());	
					gsystem.pressEnterKey();
					this.end();
					break;
				}			
			}	
			
			if(answered == 5) {
				System.out.println("You have passed the trial.");
				gsystem.pressEnterKey();
				System.out.println("The Supreme Being has chosen you to become the player of his game."
						+ " You will now be reawakened!");
				gsystem.pressEnterKey();
				System.out.println("\n\n\nChapter 3 has ended.");
				gsystem.pressEnterKey();
				System.out.println("======================================================================================"
						+ "=================");
				System.out.println("CONGRATULATIONS! You have finished the game!");
				gsystem.pressEnterKey();
				chaptercontrol.setInGame(4);
			}
		}
	}
	
	/**
	 * Method that instantly ends the chapters since the player is killed
	 */
	public void end() {
			System.out.println("> You died! Game Over!");
			System.out.println("The chapter will restart.\n");
			gsystem.pressEnterKey();
		    chaptercontrol.setInGame(3);
	}
	
}
