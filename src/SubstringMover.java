import java.util.Scanner;

/**
 * Auto Coin Lab
 * Author: Keira
 * Collaborator(s): Megan
 * On My Honor, I confirm that I followed all collaboration policy guidelines and that the work I am submitting is my own: KAK
 **/

public class SubstringMover {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // creating a new scanner
        System.out.println("Type a sentence with a parenthetical expression"); // prompting the user
        String sentence = s.nextLine(); // creating a string from the users sentence
        int lengthSentence = sentence.length(); // finding the length of the sentence
        int parenthesis1 = sentence.indexOf("("); // finding the index of the first parenthesis
        int parenthesis2 = sentence.indexOf(")"); // finding the index of the second parenthesis
        String parenthetical = sentence.substring(parenthesis1,parenthesis2+1); // finding the string inside the parenthesis
        String beforeParenthetical = sentence.substring(0,parenthesis1); // the string before the parenthetical
        String afterParenthetical = sentence.substring(parenthesis2+2,lengthSentence-1); // the string after the parenthetical
        char punctuation = sentence.charAt(lengthSentence-1); // finding the character of the last index/ the punctuation
        String newSentence = (beforeParenthetical+afterParenthetical+" " +parenthetical+punctuation); // creating the new sentence
        System.out.println("Your new sentence is"); // prompting the user
        System.out.println(newSentence); // printing out the new sentence

    }
}
