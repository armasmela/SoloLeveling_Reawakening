/**
 * Collection of enemies which can be encountered throughout the game
 * @author Arjunraj Masmela.
 */
package com.sololevelingreawakening.enemy;

import com.sololevelingreawakening.architectsystem.*;

/**
 * Enemy GodStatue
 * Takes in the architectsystem Enemy class
 * @author Arjunraj Masmela.
 */
public class GodStatue extends Enemy {

	/**
	 * Constructor
	 * Initializes GodStatue
	 */
	public GodStatue() {
		this.setName("\"Statue of God, the Supreme Being.");
		this.setDescription("\nThe gigantic stone copy of the "
				+ "Absolute Being with glowing red eyes, "
				+ "black sclera, and a cruel smile.\"");
	}
}
