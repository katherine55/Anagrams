import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

import javax.swing.JOptionPane;

public class Anagramss {
	ArrayList<Character> myList = new ArrayList<Character>();
	ArrayList<Character> possibleWord = new ArrayList<Character>();
	ArrayList<String> possibilities = new ArrayList<String>();
	String word;
	Scanner myScanner;
	int length = 0;
	boolean sameLetters = false;

	public static void main(String[] args) throws FileNotFoundException {
		Anagramss myAnagram = new Anagramss();
		myAnagram.scrambler();
	}

	void scrambler() throws FileNotFoundException {
		word = JOptionPane.showInputDialog("Word with out spaces:");

		for (int i = 0; i < word.length(); i++) {
			myList.add(word.charAt(i));
		}

		myScanner = new Scanner(new File("src/words.txt"));
		while (myScanner.hasNextLine()) {
			String check = myScanner.nextLine();
			for (int i = word.length() - 1; i > -1; i--) {
				if (check.contains("" + word.substring(i, i + 1))) {
					length ++;
					possibleWord.add(word.charAt(i));
				}
			}
			
			if (myList.size() == check.length() && sameLetters) {
				possibilities.add(check);
			}
		}
		System.out.println("Here are the anagrams for the word: " + word);
		for (String x : possibilities) {
			System.out.println(x);
		}

	}

}
