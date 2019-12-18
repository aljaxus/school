import java.util.Scanner;

public class Vaja {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a = 12;
    int b = -12;
    double c = 12.3456;
    double d = -12.3456;

    try {
      
      System.out.println("Povprecne vrednosti stevil: a:" + Math.abs(a) + "; b:" + Math.abs(b) + "; c: " + Math.abs(c) + "; d:" + Math.abs(d) );
      
      System.out.println("\n\n");

      System.out.println("Vpisi poljubno stevilo");
      String input1Str = scanner.nextLine();
      double input1Int = Double.parseDouble(input1Str);
      System.out.println("Prvo naravno stevilo, ki je vecje ali enako od " + input1Str + " je " + Math.ceil(input1Int));
      
      System.out.println("\n\n");

      System.out.println("Vpisi poljubno stevilo");
      input1Str = scanner.nextLine();
      input1Int = Double.parseDouble(input1Str);
      System.out.println("Prvo naravno stevilo, ki je manjse ali enako od " + input1Str + " je " + Math.floor(input1Int));
      
      System.out.println("\n\n");

      System.out.println("Od stevil a=" + a + " ter a=" + a + " je vecje stevilo z vrednostjo " + Math.max(a, c));
      
      System.out.println("\n\n");

      System.out.println("Od stevil a=" + a + " ter a=" + a + " je manjse stevilo z vrednostjo " + Math.min(a, c));
      
      System.out.println("\n\n");

      System.out.println("\"Nakljucno\" izzrebano stevilo med 0.0 ter 1.0 je " + Math.random());
      
      System.out.println("\n\n");

      System.out.println("Zaokrozene vrednosti stevil na najbližje naravno število:");
      final Object[][] table1 = new String[2][];
      table1[0] = new String[] { "a", "b", "c", "d" };
      table1[1] = new String[] { Math.round(a) + "", Math.round(b) + "", Math.round(c) + "", Math.round(d) + "" };
      for (final Object[] row : table1) {
        System.out.format("%15s%15s%15s\n", row);
      }

      System.out.println("\n\n");

      System.out.println("Zaokrozene vrednosti stevil na najbližje celo število:");
      final Object[][] table2 = new String[2][];
      table2[0] = new String[] { "a", "b", "c", "d" };
      table2[1] = new String[] { Math.rint(a) + "", Math.rint(b) + "", Math.rint(c) + "", Math.rint(d) + "" };
      for (final Object[] row : table2) {
        System.out.format("%15s%15s%15s\n", row);
      }

      System.out.println("\n\n");

      System.out.println("Potence stevila a = " + a + ":");
      final Object[][] table3 = new String[2][];
      table3[0] = new String[] { "5", "2", "3" };
      table3[1] = new String[] { Math.pow(a, 5) + "", Math.pow(a, 2) + "", Math.pow(a, 3) + "" };
      for (final Object[] row : table3) {
        System.out.format("%15s%15s%15s\n", row);
      }

      scanner.close();

    } catch (Exception e) {
      System.out.println("We failed to execute the given operation!");
      throw e;
    }

  }
}