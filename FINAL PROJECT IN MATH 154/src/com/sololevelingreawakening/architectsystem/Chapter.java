/**
 * Collection of architectsystem classes which is necessary to build the story as well as the better/easier functionality of the game
 * @author Arjunraj Masmela.
 */
package com.sololevelingreawakening.architectsystem;

/**
 * Represents a chapter in the game.
 * Certain chapters can be created and played in the game.
 * @author Arjunraj Masmela.
 */
public abstract class Chapter {
	
	/**
	 * Chapter number of the game.
	 */
	private int chapter;
	
	/**
	 * The enemy present in the game.
	 */
	private Enemy enemy;
		
	/**
	 * Method in setting the chapter of the game.
	 * @param aChapter Takes an integer for the chapter.
	 */
	public void setChapter(int aChapter) {
		this.chapter = aChapter;
	}
	
	/**
	 * @return Returns the current chapter of the game.
	 */
	public int getChapter() {
		return this.chapter;
	}
	
	/**
	 * Method in setting the enemy of the chapter.
	 * @param anEnemy Takes an Enemy object for the enemy in the chapter.
	 */
	public void setEnemy(Enemy anEnemy) {
		this.enemy = anEnemy;
	}
	
	/**
	 * @return Returns the enemy in the chapter.
	 */
	public Enemy getEnemy() {
		return this.enemy;
	}

}
