/**
 * Package for the main class of the game
 * Where the main method is located
 * @author Arjunraj Masmela.
 */
package com.sololevelingreawakening.main;

import com.sololevelingreawakening.architectsystem.GameSystem;
import com.sololevelingreawakening.chapters.Chapter1;
import com.sololevelingreawakening.chapters.Chapter2;
import com.sololevelingreawakening.chapters.Chapter3;
import com.sololevelingreawakening.chapters.ChapterControl;
import com.sololevelingreawakening.chapters.ChapterController;
import com.sololevelingreawakening.chapters.Prologue;

/**
 * Main class of the Solo Leveling Text-Based Console Game
 * @author Arjunraj Masmela
 */
public class SoloLeveling {

	/**
	 * Main method
	 * @param args default main method parameter
	 */
	public static void main(String[] args) {
		
		// Prologue Class
		Prologue prologue = new Prologue();
		
		// Game_System Class
		GameSystem gsystem = new GameSystem();
		
		// boolean to store the choice of the player (whether to play again or not)
		boolean play = true;
		
		// Chapters
		Chapter1 chapter1 = null;
		Chapter2 chapter2 = null;
		Chapter3 chapter3 = null;
		
		// Chapter Mediator
		ChapterController chapterMediator = new ChapterControl();
		
		// loops the whole process
		while(play) {
			switch(chapterMediator.getInGame()) {
			case 0:
				prologue.startprologue();
				chapterMediator.setInGame(1);
				break;
			case 1:
				chapter1 = new Chapter1(chapterMediator, gsystem);
				chapter1.setPlayer(prologue.getPlayer());
				chapter1.playChapter();
				break;
			case 2:
				chapter2 = new Chapter2(chapterMediator, gsystem);
				chapter2.setPlayer(prologue.getPlayer());
				chapter2.playChapter();
				break;
			case 3:
				chapter3 = new Chapter3(chapterMediator, gsystem);
				chapter3.setPlayer(prologue.getPlayer());
				chapter3.playChapter();
				break;
			case 4:
				int choice;
				choice=gsystem.getIntegerInput("Do you want to play again? \n[1]Yes \n[2]No \n\nChoice:");
				if (choice==1) {
					prologue.startprologue();
					chapterMediator.setInGame(1);
				}else {
					play=false;
				}
				/* falls through */
			default:
				break;
			}	
		}
		System.out.println("\n\nThank you for playing SOLO LEVELING: REAWAKENING!");
	}
}
