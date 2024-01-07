class MultipleMethods1 {
  
  public static void method1() {
    System.out.println("Called method1");
  }
  
  public static void method2() {
    System.out.println("Called method2");
  }
  public static void main(String[] args) {
    method1();
    printXLines(8);
    method2();
  }
  
  public static void newLine() {
    System.out.println();
  }
  
  public static void printXLines(int x) {
    for (int i = 0 ; i < x;i++) {
      newLine();
    }
  }
  
  
}