public class BogusCast {
  public static void main(String[] args) {
    int a = 3;
    System.out.println("a = " + a);
    String b = (String) a;
    System.out.println("b = " + b);
  }
}