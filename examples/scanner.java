import java.util.Scanner;
public class scanner {
//Code this command as an example to the newbies
//Be sure to look back into the documentation in order to research it.
//The purpose of this exercise is to get newbies to learn how to use a library. A big part is documentation
//documenation link: https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html
//alternatively, google "scanner class java"

//Make sure that the newbies understand what is happening. They should already know about classes and objects
//Ask questions like: what is the class here, what is the object here, and stuff like that

/*Example Code To Show newbies*/
  public static void printInt() {
    System.out.println("Input a number");
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    System.out.println("Your number was " + input);
  }

  public static void printLine() {
    System.out.println("Input a string");
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    System.out.println("Your string was " + input);
  }

/*Answers to activities -- try to get newbies to code this as a group*/

  public static void grandparentsVisit() {
    System.out.println("What do you want to repeat?");
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    for (int i = 0;i <= 5;i++) {
      System.out.println(input);
    }
  }

  public static void annoyingSibling() {
    System.out.println("What did your annoying sibling say?");
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    System.out.println(input + " dab");
  }

  public static void jamesBond() {
    System.out.println("What is your first name?");
    Scanner initial = new Scanner(System.in);
    String firstName = initial.nextLine();
    Scanner last = new Scanner(System.in);
    String lastName = last.nextLine();
    System.out.println("The name's " + lastName + " , " + firstName + lastName);
  }

//Wait until the end of the lesson.
//Gauge the newbie's familiarity.
//This is an optional fun thing that you could do
//Note that this seems to mostly be for fun, with no real pupose
//Do only if you have no time
//Essentially, you could code the base, explaining what you're coding
//Then, get the newbies to shout suggestions for what the scenarios should be
  public static void exampleRPG() {
    String output;
    System.out.println("A monster attacks! What do you do?");
    System.out.println("[1] Run");
    System.out.println("[2] Insult");
    System.out.println("[3] Pikachu");
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    switch (input) {
      case 1:
        output = "Your pathetic attempt to run is successful. The monster is too embarrassed for your sake to chase after you";
        break;
      case 2:
        output = "You insult the monster's mother. The monster dies laughing because your insult was so terrible";
        break;
      case 3:
        output = "You call on Pikachu to help you, but the monster likes digimon better. It gets so angry it dies";
        break;
      default:
        output = "error, does not compute. Beep boop beep boop beep boop";
    }
    System.out.println(output);
  }

  public static void main(String[] args) {
    printInt();
    printLine();
    exampleRPG();
  }
}
