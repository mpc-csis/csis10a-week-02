public class DoubleOverflow {
  public static void main(String[] args) {
    double max = Double.MAX_VALUE;
    System.out.println("Max double     = " + max);
    double overflow = max + 1D;
    System.out.println("Max double + 1 = " + overflow);
    double wayoverflow = max * 2D;
    System.out.println("Max double * 2 = " + wayoverflow);
  }
}