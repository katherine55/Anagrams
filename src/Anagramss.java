import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

import javax.swing.JOptionPane;

public class Anagramss {
	Stack<Character> myList = new Stack<Character>();
	ArrayList<String> possibilities = new ArrayList<String>();
	String word;

	public static void main(String[] args) throws FileNotFoundException {
		Anagramss andy = new Anagramss();
		andy.scrambler();
	}

	void scrambler() throws FileNotFoundException {
		word = JOptionPane.showInputDialog("Word with out spaces:");

		for (int i = 0; i < word.length(); i++) {
			myList.add(word.charAt(i));
		}

		Scanner myScanner = new Scanner(new File("src/words.txt"));
		while (myScanner.hasNextLine()) {
			String check = myScanner.nextLine();
			for (int i = word.length() - 1; i > -1; i--) {
				if (check.contains("" + word.charAt(i))) {
					myList.pop();
				}
			}
			if (myList.isEmpty()) {
				possibilities.add(check);
			}

		}
		System.out.println("Here are the anagrams for the word: " + word);
		for (String x : possibilities) {
			System.out.println(x);
		}

	}

}
