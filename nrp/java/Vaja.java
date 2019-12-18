public class Vaja {
  public static void main(String[] args) {

    try {
      
      // Izpise maksimalno vrednost podatkovnega tipa Integer
      System.out.println(Integer.MAX_VALUE);
      // Izpise minimalno vrednost podatkovnega tipa Integer
      System.out.println(Integer.MIN_VALUE);
      // Izpise maksimalno vrednost podatkovnega tipa Long
      System.out.println(Long.MAX_VALUE);
      // Izpise minimalno vrednost podatkovnega tipa Long
      System.out.println(Long.MIN_VALUE);
      // Izpise maksimalno vrednost podatkovnega tipa Short
      System.out.println(Short.MAX_VALUE);
      // Izpise minimalno vrednost podatkovnega tipa Short
      System.out.println(Short.MIN_VALUE);
      // Izpise maksimalno vrednost podatkovnega tipa Double
      System.out.println(Double.MAX_VALUE);
      // Izpise minimalno vrednost podatkovnega tipa Double
      System.out.println(Double.MIN_VALUE);
      // Izpise maksimalno vrednost podatkovnega tipa Float
      System.out.println(Float.MAX_VALUE);
      // Izpise minimalno vrednost podatkovnega tipa Float
      System.out.println(Float.MIN_VALUE);
      // Izpise maksimalno vrednost podatkovnega tipa Byte
      System.out.println(Byte.MAX_VALUE);
      // Izpise minimalno vrednost podatkovnega tipa Byte
      System.out.println(Byte.MIN_VALUE);

    } catch (Exception e) {
      System.out.println("We failed to execute the given operation!");
      throw e;
    }

  }
}