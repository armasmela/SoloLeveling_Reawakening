/**
 * Collection of enemies which can be encountered throughout the game
 * @author Arjunraj Masmela.
 */
package com.sololevelingreawakening.enemy;

import com.sololevelingreawakening.architectsystem.*;

/**
 * Enemy SteelFangedLycan
 * Takes in the architectsystem Enemy class
 * @author Arjunraj Masmela.
 */
public class SteelFangedLycan extends Enemy {

	/**
	 * Constructor
	 * Initializes SteelFangedLycan
	 */
	public SteelFangedLycan() {
		this.setName("Steel Fanged Lycan");
		this.setDescription("A wolf-like creature that has steel fangs protruding on its mouth");
		this.setHp(100);
		this.setRank('D');
		this.setType("Monster (Beast)");
	}
	
	/**
	 * Method that lets the player appraise the steelfangedlycan
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
