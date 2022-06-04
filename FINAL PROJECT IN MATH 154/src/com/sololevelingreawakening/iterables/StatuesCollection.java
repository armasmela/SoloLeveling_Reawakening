/**
 * Collection of iterable classes
 * Mostly collection of alike data types like array of objects
 * @author Arjunraj Masmela.
 */
package com.sololevelingreawakening.iterables;


/**
 * 
 * 
 * Array of statues from the statues objects
 * @author Arjunraj Masmela.
 *
 */
public class StatuesCollection {
	/**
	 * Array of trivias
	 */
	private Statues[] statues;
	
	/**
	 * Constructor
	 * Initializes the statues array
	 */
	public StatuesCollection() {
		this.statues = new Statues[10];
		
		statues[0] = new Statues("This statue is holding a spear", "RUN", 
				"You have chosen wisely!", "The statue used its spear to kill you.");
		statues[1] = new Statues("This statue is holding a drum", "STAY", 
				"You have chosen wisely! The statue striked the drum rhythmically to worship the Supreme Being.", 
				"The Statue of God is displeased by your action. It has decided to kill you.");
		statues[2] = new Statues("This statue is holding a warhammer", "RUN", 
				"You have chosen wisely!", "The statue used its warhammer to kill you.");
		statues[3] = new Statues("This statue is holding a harp", "STAY", 
				"You have chosen wisely! "
				+ "The statue plucked the strings of the harp harmoniously to worship the Supreme Being.", 
				"The Statue of God is displeased by your action. It has decided to kill you.");
		statues[4] = new Statues("This statue is holding an axe", "RUN", 
				"You have chosen wisely!", "The statue used its axe to kill you.");
		statues[5] = new Statues("This statue is holding a flute", "STAY", 
				"You have chosen wisely! The statue blew the flute euphoniously to worship the Supreme Being.", 
				"The Statue of God is displeased by your action. It has decided to kill you.");
		statues[6] = new Statues("This statue is holding a shield", "RUN", 
				"You have chosen wisely!", "The statue used its shield to kill you.");
		statues[7] = new Statues("This statue is holding a banjo", "STAY", 
				"You have chosen wisely! The statue strummed the banjo symphoniously to worship the Supreme Being.", 
				"The Statue of God is displeased by your action. It has decided to kill you.");
		statues[8] = new Statues("This statue is holding a sword", "RUN", 
				"You have chosen wisely!", "The statue used its sword to kill you.");
		statues[9] = new Statues("This statue is holding a book", "STAY", 
				"You have chosen wisely! The statue sang melodiously to worship the Supreme Being.", 
				"The Statue of God is displeased by your action. It has decided to kill you.");
		}
	
	/**
	 * 
	 * @return Returns the statues array
	 */
	public Statues[] getStatues() {
		return this.statues;
	}
}
