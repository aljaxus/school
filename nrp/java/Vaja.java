public class Vaja {
  public static void main(String[] args) {
    try {

      System.out.println("Sin(π / 6)       = " + (Math.sin(Math.PI / 6)));
      System.out.println("√49              = " + (Math.sqrt(49)));
      System.out.println("Log(e)           = " + (Math.log(Math.E)));
      System.out.println("(√25) / (Sin(π)) = " + ((Math.sqrt(Math.E)) / (Math.sin(Math.PI))) );

    } catch (Exception e) {
      System.out.println("We failed to execute the given operation!");
      throw e;
    }

  }
}