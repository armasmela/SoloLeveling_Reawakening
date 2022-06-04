/**
 * Collection of architectsystem classes which is necessary to build the story as well as the better/easier functionality of the game
 * @author Arjunraj Masmela.
 */
package com.sololevelingreawakening.architectsystem;

/**
 * Represents a player in the game
 * Takes in the architectsystem stat class
 * @author Arjunraj Masmela.
 */

public class Player extends Stat {
	
	/**
	 * Name of the player
	 */
	private String name;
	
	/**
	 * Method in setting the name of the player
	 * @param aName Takes a string for the player name.
	 */
	public void setName(String aName) {
		this.name = aName;
	}
	
	/**
	 * @return Returns string the name of the player
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Constructor
	 * Initializes the player
	 * @param aName Takes a string for the player name
	 * Initializes the HP of player to be 100
	 */
	public Player(String aName) {
		this.setName(aName);
		this.setHp(100);
	}

}
