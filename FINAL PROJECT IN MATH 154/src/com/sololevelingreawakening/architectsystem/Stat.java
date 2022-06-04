/**
 * Collection of architectsystem classes which is necessary to build the story as well as the better/easier functionality of the game
 * @author Arjunraj Masmela.
 */
package com.sololevelingreawakening.architectsystem;

/**
 * Represents the statistics of player/enemies in the game.
 * @author Arjunraj Masmela.
 */
public abstract class Stat{

	/**
	 * Healthpoints number of player/enemy.
	 */
	private int hp;
	
	/**
	 * Attack number of the player/enemy.
	 */
    private int attack;
    
    /**
     * Rank character of the enemy. (e.g. A, B, C, D, E)
     */
    private char rank;
    
    /**
     * Type string of the enemy (e.g. Monster)
     */
    private String type;
    
    /**
     * Potion number of the player
     */
	private int potion;
	
	/**
	 * Bomb number of the player
	 */
	private int bomb;
	
	/**
	 * Teleportation Stone number of the player
	 */
	private int teleportation_stone;
	
	/**
	 * Integer variables to be used on the Constructor
	 */
    int aHP; 
    int anAttack;
    int aBomb;
    int aPotion;
    int aStone;
    
    /**
	 * Character variables to be used on the Constructor
	 */
    char aRank;
    
    /**
	 * String variables to be used on the Constructor
	 */
    String aType;
   
	/**
	 * Constructor
	 * Sets all stat to corresponding variables
	 */
    public Stat() {
    	this.setHp(aHP);
        this.setAttack(anAttack);
        this.setRank(aRank);
        this.setType(aType);
        this.setBomb(aBomb);
        this.setPotion(aPotion);
        this.setTeleportation_stone(aStone);
    }

    /**
     * @return Returns int the Hp of the player/enemy
     */
	public int getHp() {
		return hp;
	}

	/**
	 * Method in setting the Hp of the player/enemy
	 * @param aHp Takes a number for the integer value of Hp
	 * An if-else...if-else statement is used in order to control the data. (Valid HP are between the inclusive interval of 0 to 100)
	 */
	public void setHp(int aHp) {
	      if(aHp >= 100) {
	          this.hp = 100;          
	       } else if ((aHp < 100) && (aHp > 0)) {
	    	  this.hp = aHp;
	       }else {
	          this.hp = 0;
	       }
	}

	/**
	 * @return Returns int the attack of the player/enemy
	 */
	public int getAttack() {
		return attack;
	}

	/**
	 * Method in setting the attack of the player/enemy
	 * @param anAttack. Takes an int for the attack of the player/enemy
	 */
	public void setAttack(int anAttack) {
		this.attack = anAttack;
	}

	/**
	 * @return Returns char the rank of the enemy
	 */
	public char getRank() {
		return rank;
	}

	/**
	 * Method in setting the rank of the enemy
	 * @param aRank Takes a char for the rank of the enemy
	 */
	public void setRank(char aRank) {
		this.rank= aRank;
	}

	/**
	 * @return Returns string the type of the enemy
	 */
	public String getType() {
		return type;
	}

	/**
	 * Method in setting the type of the enemy
	 * @param aType Takes an string for the type of the enemy
	 */
	public void setType(String aType) {
		this.type = aType;
	}

	/**
	 * @return Returns int the bomb of the player
	 */
	public int getBomb() {
		return bomb;
	}

	/**
	 * Method in setting the bomb of the player
	 * @param aBomb Takes an int for the bomb of the player
	 */	
	public void setBomb(int aBomb) {
		this.bomb = aBomb;
	}
	
	/**
	 * @return Returns int the potion of the player
	 */
	public int getPotion() {
		return potion;
	}

	/**
	 * Method in setting the potion of the player
	 * @param aPotion Takes an int for the potion of the player
	 */
	public void setPotion(int aPotion) {
		this.potion = aPotion;
	}

	/**
	 * @return Returns int the teleportation stone of the player
	 */
	public int getTeleportation_stone() {
		return teleportation_stone;
	}

	/**
	 * Method in setting the teleportation stone of the player
	 * @param aTeleportation_stone Takes an int for the teleportation stone of the player
	 */
	public void setTeleportation_stone(int aTeleportation_stone) {
		this.teleportation_stone = aTeleportation_stone;
	}

}