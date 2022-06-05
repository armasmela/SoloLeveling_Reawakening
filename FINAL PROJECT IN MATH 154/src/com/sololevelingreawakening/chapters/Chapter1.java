 * Collection of chapter classes that are playable in the course of the game.
 * @author Arjunraj Masmela.
 */
package com.sololevelingreawakening.chapters;

import com.sololevelingreawakening.architectsystem.Chapter;
import com.sololevelingreawakening.architectsystem.GameSystem;
import com.sololevelingreawakening.architectsystem.Items;
import com.sololevelingreawakening.architectsystem.Player;
import com.sololevelingreawakening.enemy.SteelFangedLycan;

/**
 * Chapter 1 is the first playable chapter in the game
 * Takes in the architectsystem chapter class then uses the chapter manager
 * @author Arjunraj Masmela.
 */
public class Chapter1 extends Chapter  implements ChapterManager{
	
	/**
	 * Controller of the chapter
	 */
	private ChapterController chaptercontrol;
	
	/**
	 * The one playing the game
	 */
	private Player player;
	
	/**
	 * Enemy present in the game
	 */
	private SteelFangedLycan lycan;
	
	/**
	 * Game_system that helps in smooth flow of the chapter
	 */
	private GameSystem gsystem;
	
	/**
	 * Item class of the chapter
	 */
	private Items item;
	
	/**
	 * Checker for both the health of the player and enemy (alive or not)
	 */
	private int health;
	
	/**
	 * Chapter1 constructor
	 * @param chaptercontrol takes the mediator for the chapter
	 * @param gsystem takes the Game_System for the chapter
	 */
	public Chapter1(ChapterController chaptercontrol, GameSystem gsystem) {
		this.chaptercontrol = chaptercontrol;
		this.gsystem = gsystem;
		this.health = 0;
		lycan = new SteelFangedLycan();
		item = new Items();
		setChapter(1);
		setEnemy(lycan);
	}
	
	@Override
	public void setPlayer(Player player) {
		this.player = player;
	}

	@Override
	public Player getPlayer() {
		return this.player;
	}
	
	@Override
	public void setItem(Items item) {
		this.item = item;	
		}

	@Override
	public Items getItem() {
		return this.item;
	}

	@Override
	public void playChapter() {
		int choice;
		if(this.chaptercontrol.getInGame() == this.getChapter()) {
			System.out.println("\n===================================================================================="
					+ "===================");
			System.out.println("======================================================================================"
					+ "=================");
			System.out.println("\n\t\tWelcome to Chapter " + this.getChapter() + "!");
			System.out.println("\n===================================================================================="
					+ "===================");
			System.out.println("======================================================================================"
					+ "=================");
			System.out.println("\nYou have entered the dungeon.\n"
					+ "A monster appeared! "
					+ "It's a Steel Fanged Lycan!");
			gsystem.pressEnterKey();
			System.out.println("Kill it now!");
			gsystem.pressEnterKey();
			
			Loop1: while(health == 0){ 
				gsystem.printMenu("Fight", "Appraisal", "Inventory", "Main Menu");
				choice = gsystem.getIntegerInput("Choice: ");
				System.out.print("");
				switch(choice) {
				case 1:
					this.commandFight();
					break;
				case 2:
					System.out.println("");
					this.lycan.Appraisal();
					gsystem.pressEnterKey();
					break;
				case 3:
					this.commandInventory();
					break;
				default:
					System.out.println("\n>>Invalid Choice. Please Choose Again<<");
					continue Loop1;
				}
				
				switch(health) {
				case 1:
					System.out.println("> You died! Game Over!");
					System.out.println("The chapter will restart.\n");
					Chapter1 restart = new Chapter1(chaptercontrol, gsystem);
					restart.playChapter();
					break;
				case 2:
					System.out.println("You have defeated the Steel-Fanged Lycan!");
					System.out.println("Chapter 1 has ended. Press [Enter] to continue to Chapter 2...");
					gsystem.pressEnterKey();
					this.chaptercontrol.setInGame(2);
					break;
				default:
					break;
				}
			}
		}
	}

	/**
	 * Method that shows what happens if the player chooses to fight
	 */
	public void commandFight() {
	    int atk = (int) (10 + Math.random() * 30 - 10 + 1);
	    player.setAttack(atk);
	    int enemyHp = lycan.getHp();
	    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	    System.out.println("> You have done: "
	        + atk + " damage");
	    enemyHp = enemyHp - atk;
	    lycan.setHp(enemyHp);
	    System.out.println("The Lycan has: "
	        + lycan.getHp() + " HP left!");	
	    gsystem.pressEnterKey();
	    this.lycanAttack();
		this.alive(player.getHp(), lycan.getHp());
	}
	
	/**
	 * Method that shows what happens if the player chooses to inventory
	 */
	public void commandInventory() {
	    int bomb = item.getBomb();
	    int potion = item.getPotion();
	    int potionheal = item.getPotionHeal();
	    int bombdmg = item.getBombDmg();
	    int enemyHp = lycan.getHp();
	    int playerHp = player.getHp();
	    int item_choice = 0;

		Loop2: while (item_choice == 0) {
			System.out.println("");
			gsystem.printMenu("Bomb", "Potion", "Teleportation Stone", "Inventory");
			item_choice = gsystem.getIntegerInput("Choice: ");
			switch(item_choice) {
			case 1:
				if(item.getBomb() > 0) {
					System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
					System.out.println("> You used a Bomb: "
							+ "You have dealt " + bombdmg + " damage.");
					bomb = item.getBomb() - 1;
					enemyHp = enemyHp - bombdmg;
					item.setBomb(bomb);
					lycan.setHp(enemyHp);
					System.out.println("The Steel Fanged Lycan has: "
							+ lycan.getHp() + " HP left!\n");	
					System.out.println("You have: "
							+ item.getBomb() + " bombs left!\n");	
				} else {
					System.out.println("No [Item] Bomb left.");
				}
				this.lycanAttack();
				break;
			case 2:
				if(item.getPotion() > 0) {
					System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
					System.out.println("> You used a Potion: "
							+ "You have gained " + potionheal + " HP");
					potion = potion - 1;
					playerHp = playerHp + potionheal;
					item.setPotion(potion);
					player.setHp(playerHp);
					System.out.println("You now have "
							+ player.getHp() + " HP!\n");
					System.out.println("You have: "
							+ item.getPotion() + " potions left!\n");	
					} else {
						System.out.println("No [Item] Potion left.");
					}
				this.lycanAttack();
				break;
			case 3:
				int teleport_stone = item.getTeleportation_stone();
				if(teleport_stone > 0) {
					System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
					System.out.println("> You used a Teleportation Stone: "
					        + "You are back to the beginning of Chapter 1."
					        + "\nAll stats were the same as before the teleportation happened.");
					teleport_stone = teleport_stone - 1;
					item.setTeleportation_stone(teleport_stone);
					gsystem.pressEnterKey();
					this.playChapter();
					break;
				}
			default:
				System.out.println("\n>>Invalid Choice. Please Choose Again<<");
				continue Loop2;
			}
			this.alive(player.getHp(), lycan.getHp());
		}
	}

	/**
	 * Method that shows the enemy attacking the player
	 */
	public void lycanAttack() {
		int dmg = (int) (10 + Math.random() * 5 - 10 + 1);
	    lycan.setAttack(dmg);
		int enemyHp = lycan.getHp();
		int playerHp = player.getHp();
		if(enemyHp > 0){
	    	System.out.println("> The enemy attacked in retaliation.");
		    playerHp = playerHp - dmg; 
		    player.setHp(playerHp);
		    System.out.println("> The Steel Fanged Lycan has done: " + dmg 
		            + " HP of damage to you!\n" + "> You have: " + player.getHp() + "hp left!");
		    gsystem.pressEnterKey();
		}
	}
	
	/**
	 * Method that takes care whether to continue the game or not, based from the Hp of the player or the enemy
	 * @param HPplayer takes the int of playerHp
	 * @param HPenemy takes the int of enemyHp
	 * @return health takes the int of resulting if statements
	 */
	public int alive(int HPplayer, int HPenemy) {
		if (HPplayer <= 0) {
			return this.health = 1; 
		} else if (HPenemy <= 0) {
			return this.health = 2;
		} else {
			return this.health = 0;
		}
	}
	
}
