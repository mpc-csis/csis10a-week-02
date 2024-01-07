class MultipleMethods2 {
  
  public static void method1() {
    System.out.println("Called method1");
    method2();
  }
  
  public static void main(String[] args) {
    method1();
  }
  
  
  
  public static void method2() {
    System.out.println("Called method2");
  }
}