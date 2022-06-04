/**
 * Collection of architectsystem classes which is necessary to build the story as well as the better/easier functionality of the game
 * @author Arjunraj Masmela.
 */
package com.sololevelingreawakening.architectsystem;

/**
 * Represents the items in the game
 * Takes in the architectsystem stat class
 * @author Arjunraj Masmela.
 */
public class Items extends Stat {

	/**
	 * Represents the damage done by the item bomb.
	 */
	private int bombDmg;
	
	/**
	 * Represents the healing done by the item potion.
	 */
	private int potionHeal;
	
	/**
	 * Constructor
	 * Sets all items with its respective integer value.
	 */
	public Items() {
		this.setBomb(3);
		this.setBombDmg(30);
		this.setPotion(3);
		this.setPotionHeal(50);
		this.setTeleportation_stone(1);
	}

	/**
	 * @return Returns int the value of the bombDmg.
	 */
	public int getBombDmg() {
		return bombDmg;
	}

	/**
	 * Sets the bombDmg
	 * @param aBombDmg Takes an integer for the bombDmg.
	 */
	public void setBombDmg(int aBombDmg) {
		this.bombDmg = aBombDmg;
	}

	/**
	 * @return Returns int the value of the potionHeal.
	 */
	public int getPotionHeal() {
		return potionHeal;
	}

	/**
	 * Sets the potionHeal
	 * @param apotionHeal Takes an integer for the potionHeal.
	 */
	public void setPotionHeal(int apotionHeal) {
		this.potionHeal = apotionHeal;
	}
	
}
