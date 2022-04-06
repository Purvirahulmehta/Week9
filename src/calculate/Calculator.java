package calculate;

public class Calculator {
    //Addition Method
    public void addition(int a, int b) {
        System.out.println(a + b);
    }
    //Subtraction Method
    public void subtraction(int a, int b) {
        System.out.println(a - b);
    }
    //Multiplication Method
    public void multiplication(int a, int b) {
        System.out.println(a * b);
    }
    //Devision Method
    public void devision(int a, int b) {
        System.out.println(a / b);
    }
    //Calculate Result Method
    public void calculateResult(int a, int b, char c) {
        if (c == '+') {
            System.out.println("Addition of " + a + " and " + b + " is: " + (a + b));
        } else if (c == '-') {
            System.out.println("Subtraction of " + a + " and " + b + " is: " + (a - b));
        } else if (c == '*') {
            System.out.println("Multiplication of " + a + " and " + b + " is: " + (a * b));
        } else if (c == '/') {
            System.out.println("Division of " + a + " and " + b + " is: " + (a / b));
        } else {
            System.out.println("Invalid input");
        }
    }
}
