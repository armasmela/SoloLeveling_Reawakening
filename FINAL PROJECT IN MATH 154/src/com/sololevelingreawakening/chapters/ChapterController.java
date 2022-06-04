/**
 * Collection of chapter classes that are playable in the course of the game.
 * @author Arjunraj Masmela.
 */
package com.sololevelingreawakening.chapters;

/**
 * Chapter interface class for the driver of the chapters
 * @author Arjunraj Masmela.
 */
public interface ChapterController {

	/**
	 * Sets the chapter in game
	 * @param currentChapter int takes the current chapter
	 */
	public void setInGame(int currentChapter);
	
	/**
	 * 
	 * @return Returns int the current chapter in game
	 */
	public int getInGame();

}
