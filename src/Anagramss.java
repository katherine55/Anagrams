import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Anagramss {
	ArrayList myList = new ArrayList();
	ArrayList possibilities = new ArrayList();
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
		
		Scanner myScanner = new Scanner(new File("words.txt"));
		while (myScanner.hasNextLine()) {

		}

	}


}
