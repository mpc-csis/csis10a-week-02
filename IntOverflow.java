public class IntOverflow {
  public static void main(String[] args) {
    int max = Integer.MAX_VALUE;
    System.out.println("Max int     =  " + max);
    int overflow = max + 1;
    System.out.println("Max int + 1 = " + overflow);

  }
}
