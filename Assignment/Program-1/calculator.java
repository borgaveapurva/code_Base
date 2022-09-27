import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    char typeOfOperation;
    Double a, b, result;
    Scanner input = new Scanner(System.in);
    System.out.println("Choose an type Of Operation: +, -, *, or /");
   typeOfOperation = input.next().charAt(0);
    System.out.println("Enter first number");
    a = input.nextDouble();

    System.out.println("Enter second number");
    b = input.nextDouble();

    switch (typeOfOperation) {
      case '+':
        result = a + b;
        System.out.println(a + " + " + b + " = " + result);
        break;
      case '-':
        result = a - b;
        System.out.println(a + " - " + b + " = " + result);
        break;
      case '*':
        result = a * b;
        System.out.println(a + " * " + b + " = " + result);
        break;
      case '/':
        result = a / b;
        System.out.println(a + " / " + b + " = " + result);
        break;

      default:
        System.out.println("InvalidtypeOfOperation!");
        break;
    }

    input.close();
  }
}