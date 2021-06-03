package oop.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Exercise 4 - Mad Lib
Mad libs are a simple game where you create a story template with blanks for words.
You, or another player, then construct a list of words and place them into the story,
creating an often silly or funny story as a result.

Create a simple mad-lib program that prompts for a noun, a verb, an adverb, and an
adjective and injects those into a story that you create.

Example Output
Enter a noun: dog
Enter a verb: walk
Enter an adjective: blue
Enter an adverb: quickly
Do you walk your blue dog quickly? That's hilarious!

Constraints
Use a single output statement for this program.
If your language supports string interpolation or string substitution, use it to build up the output.

Challenges
Add more inputs to the program to expand the story.
Implement a branching story, where the answers to questions determine how the story is constructed.
 */
public class App 
{

    public static void main( String[] args ) {
        String noun = requestInput("noun");
        String verb = requestInput("verb");
        String adj = requestInput("adjective");
        String adv = requestInput("adverb");

        var output = String.format("Do you %s your %s %s %s? That's hilarious!", verb, adj, noun, adv);
        System.out.println(output);
    }

    private static String requestInput(String prompt) {
        Scanner in = new Scanner(System.in);

        List<String> vowelsList = new ArrayList<>(5);

        vowelsList.add("a");
        vowelsList.add("e");
        vowelsList.add("i");
        vowelsList.add("o");
        vowelsList.add("u");

        String a;
        var firstChar = String.valueOf(prompt.charAt(0));

        if(vowelsList.contains(firstChar)) {
            a = "an " + prompt;
        } else {
            a = "a " + prompt;
        }

        var output = String.format("Enter %s: ", a);
        System.out.print(output);
        return in.nextLine();
    }
}
