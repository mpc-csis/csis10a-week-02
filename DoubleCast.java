public class DoubleCast {
  public static void main(String[] args) {
    int minute = 59;
    System.out.println(minute / 60);
    System.out.println((double) minute / 60);
    System.out.println(minute / 60D);
  }
}