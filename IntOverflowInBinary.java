public class IntOverflowInBinary {
  public static void main(String[] args) {
    int max = Integer.MAX_VALUE;
    System.out.println("Max int     = 0" + Integer.toBinaryString(max));
    int overflow = max + 1;
    System.out.println("Max int + 1 = " + Integer.toBinaryString(overflow));
    int overflow2 = max + 2;
    System.out.println("Max int + 2 = " + Integer.toBinaryString(overflow2));
  }
}