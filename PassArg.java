public class PassArg {
   public static void main(String[] args) {
      int x = 10;

      System.out.println("I am passing values to displayValue.");
      displayValue(5);                         // Pass 5
      displayValue(x);                         // Pass 10
      displayValue(x * 4);                     // Pass 40
      displayValue((int) Math.round(700.4567)); // Pass 700
      System.out.println("Now I am back in main.");
   }

   public static void displayValue(int num) {
      System.out.println("The value is " + num);
   }
}