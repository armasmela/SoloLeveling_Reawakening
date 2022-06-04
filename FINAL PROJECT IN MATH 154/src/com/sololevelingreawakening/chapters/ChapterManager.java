/**
 * Collection of chapter classes that are playable in the course of the game.
 * @author Arjunraj Masmela.
 */
package com.sololevelingreawakening.chapters;

import com.sololevelingreawakening.architectsystem.*;

/**
 * Chapter manager interface class for every chapter
 * @author Arjunraj Masmela.
 */
public interface ChapterManager {
	
	/**
	 * Method that sets the player playing the chapter
	 * @param aPlayer Takes a player object for the chapter
	 */
	public void setPlayer(Player aPlayer);
	
	/**
	 * @return Returns player who finished playing the chapter
	 */
	public Player getPlayer();
	
	/**
	 * Methods that sets the Items of the player
	 * @param item Takes an Item object for the chapter
	 */
	public void setItem(Items item);

	
	/**
	 * @return Returns the Item of the player
	 */
	public Items getItem();
	
	/**
	 * Runs the chapter to be played by the player
	 */
	public void playChapter();



}
