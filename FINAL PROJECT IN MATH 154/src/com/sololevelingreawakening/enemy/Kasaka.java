/**
 * Collection of enemies which can be encountered throughout the game
 * @author Arjunraj Masmela.
 */
package com.sololevelingreawakening.enemy;

import com.sololevelingreawakening.architectsystem.*;

/**
 * Enemy Kasaka
 * Takes in the architectsystem Enemy class
 * @author Arjunraj Masmela.
 */
public class Kasaka extends Enemy {

	/**
	 * Constructor
	 * Initializes Kasaka
	 */
	public Kasaka() {
		this.setName("Blue Venom-Fanged Kasaka");
		this.setDescription("A large cobra about the size of a house, "
				+ "with glowing amber eyes, blue scales, "
				+ "and a long black forked tongue.");
		this.setHp(100);
		this.setRank('B');
		this.setType("Monster (Beast_Dungeon-Boss)");
	}
	
	/**
	 * Method that lets the player appraise Kasaka
	 */
	public void Appraisal() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("");
		System.out.println("Name: " + this.getName());
		System.out.println("Description: " + this.getDescription());
		System.out.println("Rank: " + this.getRank());
		System.out.println("Type: " + this.getType());
	}
	
}
