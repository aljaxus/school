import java.util.Scanner;

public class Vaja {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {

      while (true) {
        double rnd = (int) (Math.random() * 6 + 1);
        
        
        System.out.println("╔═══════╗");
        
        if (rnd == 2 || rnd == 3) { System.out.println("║     * ║"); }
        else if (rnd == 4 || rnd == 5) { System.out.println("║ *   * ║"); }
        else if (rnd == 6) { System.out.println("║ * * * ║"); }
        else { System.out.println("║       ║"); }

        if (rnd == 1 || rnd == 3 || rnd == 5) { System.out.println("║   *   ║"); }
        else { System.out.println("║       ║"); }
        
        if (rnd == 2 || rnd == 3) { System.out.println("║ *     ║"); }
        else if (rnd == 4 || rnd == 5) { System.out.println("║ *   * ║"); }
        else if (rnd == 6) { System.out.println("║ * * * ║"); }
        else { System.out.println("║       ║"); }

        System.out.println("╚═══════╝");
        System.out.println(rnd);

        System.out.println("\nZa ponoven met kocke pritisni \"enter\", za prekinitev skripte pritisni \"ctrl + c\"");
        String inputStr = scanner.nextLine();
      }

    } catch (Exception e) {
      System.out.println("We failed to execute the given operation!");
      throw e;
    }

  }
}