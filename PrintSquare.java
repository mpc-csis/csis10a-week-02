class PrintSquare {
  public static void main(String[] args) {
    double a = 4;
    printSquare(a);
    
    //String b = "4";
    //printSquare(b);
  }
  
  public static void printSquare(double x) {
    double square = x * x;
    System.out.println("The square of " + x + " is " + square);
  }
}