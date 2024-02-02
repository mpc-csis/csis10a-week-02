public class Checkpoint {

  public static void main(String[] args) {
    method1();
    method1();
    method2();
  }

  public static void method1() {
    System.out.println("abra");
  }

  public static void method2() {
    System.out.println("cad");
    method1();
  }

}