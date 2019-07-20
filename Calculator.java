public class Calculator {
  // This program is a basic calculator that can add, subtract, multiply, divide, and find the remainder of 2 intergers! HAVE FUN!
  Calculator()  {
  }
public int add(int a, int b){
  return a + b;
}
   public int subtract(int a, int b){
     return a - b;
   }
   public int multiply(int a, int b){
     return a * b;
   }
   public int divide(int a, int b){
     return a / b;
   }
   public int modula(int a, int b){
     return a % b;
   }
     public static void main(String[] args){
      Calculator myCalculator = new Calculator();
      System.out.println(myCalculator.subtract(5,7));
       System.out.println(myCalculator.add(42,13));
       System.out.println(myCalculator.multiply(15,27));
     }
}
