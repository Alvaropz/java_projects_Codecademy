public class Calculator {
    // Class constructor
    public Calculator() {
  
    }
  
    // Adds up two numbers
    public int add(int a, int b){
      int total = a + b;
      return total;
    }
  
    // Substracts two numbers
    public int substract(int a, int b){
      int total = a - b;
      return total;
    }
  
    // Multiplies two numbers
    public int multiply(int a, int b){
      int total = a * b;
      return total;
    }
  
    // Divides two numbers
    public int divide(int a, int b){
      int total = a / b;
      return total;
    }
  
    // Returns the remainder of a division
    public int modulo(int a, int b){
      int total = a % b;
      return total;
    }
  
    public static void main(String[] args) {
      Calculator myCalculator = new Calculator();
      System.out.println(myCalculator.add(5, 7));
      System.out.println(myCalculator.substract(45, 11));
      System.out.println(myCalculator.multiply(12, 34));
      System.out.println(myCalculator.divide(20, 12));
      System.out.println(myCalculator.modulo(20, 12));
    }
  }