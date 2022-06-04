/**
 * Collection of architectsystem classes which is necessary to build the story as well as the better/easier functionality of the game
 * @author Arjunraj Masmela.
 */
package com.sololevelingreawakening.architectsystem;

/**
 * Represents an enemy in the game
 * Takes in the architectsystem stat class
 * @author Arjunraj Masmela.
 */
public abstract class Enemy extends Stat{
	
	/**
	 * Name of the enemy
	 */
	private String name;
	
	/**
	 * Description of the enemy
	 */
	private String description;
	
	/**
	 * Method in setting the name of the enemy
	 * @param aName Takes a string for the enemy name.
	 */
	public void setName(String aName) {
		this.name = aName;
	}
	
	/**
	 * @return Returns string the name of the enemy
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Method in setting the description of the enemy
	 * @param aDescription Takes a string for the enemy description.
	 */
	public void setDescription(String aDescription) {
		this.description = aDescription;
	}
	
	/**
	 * @return Returns string the description of the enemy
	 */
	public String getDescription() {
		return this.description;
	}

}
