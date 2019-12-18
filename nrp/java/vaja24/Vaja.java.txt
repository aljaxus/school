public class Vaja {
  public static void main(String[] args) {

    try {

      System.out.print("\nStevilo PI omejeno na 10 mest: ");
      System.out.printf("%1.10f", Math.PI);
      System.out.print("\nStevilo E omejeno na 10 mest: ");
      System.out.printf("%1.1f0", Math.E);

      System.out.print("\nStevilo PI omejeno na eno decimalko: ");
      System.out.printf("%1.1f", Math.PI);
      System.out.print("\nStevilo E omejeno na eno decimalko: ");
      System.out.printf("%1.1f", Math.E);

      System.out.println("\n");

    } catch (Exception e) {
      System.out.println("We failed to execute the given operation!");
      throw e;
    }

  }
}