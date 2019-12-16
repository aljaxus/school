import java.util.Scanner;

public class Vaja {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Vpsi poljubno celo stevilo (osnova)");
    String input1Str = scanner.nextLine();
    System.out.println("Vpsi poljubno celo stevilo (odstotek)");
    String input2Str = scanner.nextLine();
    scanner.close();

    try {
      Double value = (Double.parseDouble(input1Str) * (Double.parseDouble(input2Str) / 100));

      System.out.println("Vpisani stevili sta " + input1Str + " (osnova) ter " + input2Str + " (odstotek)");
      System.out.println("Percentualna vrednost osnove " + input1Str + " ter odstotka " + input2Str + "% je " + value);


    } catch (Exception e) {
      System.out.println("You were asked for a NUMBER!");
    }

  }
}