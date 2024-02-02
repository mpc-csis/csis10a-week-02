public class ScopeDemo {

  int num = 11;
  public static void displayValue() {
    System.out.println("The value is " + num);
  }

  public static void iSeeNum() {
    System.out.println("I see num as: " + num);
  }

  public static void main(String[] args) {
    displayValue();
    iSeeNum();
  }
}