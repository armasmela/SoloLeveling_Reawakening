/**
 * Collection of iterable classes
 * Array of objects is a collection of similar data types.
 * @author Arjunraj Masmela.
 */
package com.sololevelingreawakening.iterables;

/**
 * StatueIterator, controller for the statues collection
 * @author Arjunraj Masmela.
 */
public class StatuesIterator implements Iterator {
	
	/**
	 * Statues array
	 */
	private Statues[] myStatues;
	
	/**
	 * Int array of drawn indexes
	 */
	private int[] drawnIndexes;
	
	/**
	 * Current riddle index
	 */
	private int index;
	
	/**
	 * Current drawn index
	 */
	private int drawnIndex;
	
	/**
	 * Constructor
	 * Initializes StatueIterator
	 * @param myStatues Takes the array for myStatues
	 */
	public StatuesIterator(Statues[] myStatues) {
		this.myStatues = myStatues;
		this.index = 0;
		this.drawnIndexes = new int[3];
		this.drawnIndex = 0;
	}
	
	@Override
	public Object randomDraw() {
		int drawnIndex = (int)Math.floor(Math.random()*(9-0+1)+0);
		if(!isIndexDrawn(drawnIndex)) {
				addDrawnIndex(drawnIndex);
			return myStatues[drawnIndex];
			
		} else {
			return randomDraw();
		}
	}

	@Override
	public void addDrawnIndex(int index) {
		drawnIndexes[drawnIndex] = index;
	}
	
	@Override
	public boolean isIndexDrawn(int index) {
		for(int drawnIndex : drawnIndexes) {
			if(drawnIndex == index) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void nextObj() {
		if(index++ < myStatues.length) {
			index++;
		} else {
			resetObj();
		}
	}

	@Override
	public void nextDraw() {
		if(drawnIndex++ < drawnIndexes.length) {
			index++;
		} else {
			index = 0;
		}
		
	}

	@Override
	public void resetObj() {
		index = 0;
		
	}

	@Override
	public void resetDraw() {
		drawnIndex = 0;
	}
	
}
