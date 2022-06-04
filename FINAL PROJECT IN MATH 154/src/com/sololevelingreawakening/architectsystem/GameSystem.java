/**
 * Collection of architectsystem classes which is necessary to build the story as well as the better/easier functionality of the game
 * @author Arjunraj Masmela.
 */
package com.sololevelingreawakening.architectsystem;

import java.util.Scanner;

/**
 * Game_System class. The "administrator" of the game. Helps ease out some functions in the game.
 * @author Arjunraj Masmela.
 */
public class GameSystem {
	
	/**
	 * Scanner for enters inputs
	 */
	private Scanner scanEnter = new Scanner(System.in);
	
	/**
	 * Scanner for string inputs
	 */
	private Scanner scanString = new Scanner(System.in);
	
	/**
	 * Scanner for integer inputs
	 */
	private Scanner scanInteger = new Scanner(System.in);
	
	/**
	 * Method that commands the player to press the enter key
	 */
	public void pressEnterKey() {
		System.out.println("[ENTER]");
		scanEnter.nextLine();
	}
	
	/**
	 * Method that returns a string input
	 * @param input Takes a string output
	 * @return Returns string the player input
	 */
	public String getStringInput(String input) {
		String string;
		System.out.print(input);
		string = scanString.nextLine();
		return string;
	}
	
	/**
	 * Method that returns an int input
	 * @param string Takes a string output
	 * @return Returns int the player input
	 */
	public int getIntegerInput(String string) {
		int number;
		System.out.print(string);
		number =  scanInteger.nextInt();
		return number;
	}
	
	/**
	 * Method that returns an output
	 * Helps in showing the choices in the game
	 * @param str1 Takes the string for the first choice
	 * @param str2 Takes the string for the second choice
	 * @param str3 Takes the string for the third choice
	 * @param menu Takes the string for what menu to show
	 */
	public void printMenu(String str1, String str2, String str3, String menu) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		if(menu.equals("Main Menu")) {
			System.out.println("What do you do?");
		} else {
			System.out.println("Choose what to use: ");
		}
		System.out.println("[1] " + str1);
		System.out.println("[2] " + str2);
		System.out.println("[3] " + str3);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	}
	
}