/**
 * Collection of iterable classes
 * Array of objects is a collection of similar data types.
 * @author Arjunraj Masmela.
 */
package com.sololevelingreawakening.iterables;

/**
 * Statues class with statue equipment and action that has result1 and result2 (consequential)
 * @author Arjunraj Masmela.
 */
public class Statues {
	
	/**
	 * Statues
	 */
	private String statue_equipment;
	
	/**
	 * action towards the statue
	 */
	private String action;
	
	/**
	 *  result of desired action
	 */
	private String result1;
	
	/**
	 *  result of wrong action
	 */
	private String result2;
	
	/**
	 * Constructor
	 * @param statue_equipment Takes the string that contains the equipment held by the statue
	 * @param action Takes the string for action toward the statue
	 * @param result1 Takes the string for the result of desired action
	 * @param result2 Takes the string for the result of wrong action
	 */
	public Statues(String statue_equipment, String action, String result1, String result2) {
		this.statue_equipment = statue_equipment;
		this.action = action;
		this.result1 = result1;
		this.result2 = result2;
	}

	/**
	 * Method that sets the equipment for the statue
	 * @param statue_equipment Takes a string for the statue equipment
	 */
	public void setStatue_equipment(String statue_equipment) {
		this.statue_equipment = statue_equipment;
	}
	
	/**
	 * @return Returns string for the statue equipment
	 */
	public String getStatue_equipment() {
		return this.statue_equipment;
	}
	
	/**
	 * Method that sets the action to the statue
	 * @param action Takes a string for the action
	 */
	public void setAction(String action) {
		this.action = action;
	}
	
	/**
	 * @return Returns string the action
	 */
	public String getAction() {
		return this.action;
	}
	
	/**
	 * @return Returns string the result1
	 */
	public String getResult1() {
		return result1;
	}

	/**
	 * Method that sets the result of the desired action
	 * @param result1 Takes a string for the result of the desired action
	 */
	public void setResult1(String result1) {
		this.result1 = result1;
	}
	
	/**
	 * @return Returns string the result2
	 */
	public String getResult2() {
		return result2;
	}

	/**
	 * Method that sets the result of the wrong action
	 * @param result2 Takes a string for the result of the wrong action
	 */
	public void setResult2(String result2) {
		this.result2 = result2;
	}
	
	/**
	 * Method that checks if player action matches the required action
	 * @param action Takes string the action of the player
	 * @return Returns boolean base on comparison
	 */
	public boolean checkAction(String action) {
		return this.action.equalsIgnoreCase(action);
	}

}
