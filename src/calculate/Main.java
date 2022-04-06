package calculate;

import java.util.Scanner;

public class Main extends Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char answer;
        do {
            System.out.println("Enter Your First Number");
            int a = scanner.nextInt();
            System.out.println("Enter Your Second Number");
            int b = scanner.nextInt();
            System.out.println("Enter One Of The Symbol +,-,*,/ ");
            char c = scanner.next().charAt(0);
            Calculator obj = new Calculator();
            obj.calculateResult(a,b,c);
            System.out.println("Would you like to do more Calculation please enter'Y' OR 'N'");
            answer = scanner.next().charAt(0);
        }
        while (answer == 'y' || answer == 'Y');
    }
}
