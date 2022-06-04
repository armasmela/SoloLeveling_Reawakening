/**
 * Collection of chapter classes that are playable in the course of the game.
 * @author Arjunraj Masmela.
 */
package com.sololevelingreawakening.chapters;

/**
 * Chapter Control take control of all the chapters in the game.
 * It inhibits the player from moving on to the next chapter without first completing the qualification. 
 * @author Arjunraj Masmela.
 */
public class ChapterControl implements ChapterController {

	/**
	 * Current chapter in game
	 */
	private int currentChapter;
	
	/**
	 * Constructor
	 * Initially set to 0 to initialize the start of the game
	 */
	public ChapterControl() {
		this.currentChapter = 0;
	}
	
	@Override
	public void setInGame(int currentChapter) {
		this.currentChapter = currentChapter;
	}
	
	@Override
	public int getInGame() {
		return this.currentChapter;
	}

}
