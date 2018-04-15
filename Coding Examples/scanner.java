import java.util.Scanner;
public class scanner {

  public static void printInt() {
    System.out.println("Input a number");
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    System.out.println("Your number was " + input);
  }

  public static void printLine() {
    System.out.println("Input a string");
    String input = sc.nextLine();
    System.out.println("Your string was " + input);
  }

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
    }
  }

  public static void main(String[] args) {
    printInt();
    printLine();
    exampleRPG();
  }
}
