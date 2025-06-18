import java.util.*;

public class SimpleCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b;
        String op;

        System.out.print("Enter first number: ");
        a = sc.nextDouble();

        System.out.print("Enter second number: ");
        b = sc.nextDouble();

        System.out.print("Enter operation (add, sub, mul, div, pow): ");
        op = sc.next();

        if (op.equals("add"))
            System.out.println("Result = " + (a + b));
        else if (op.equals("sub"))
            System.out.println("Result = " + (a - b));
        else if (op.equals("mul"))
            System.out.println("Result = " + (a * b));
        else if (op.equals("div"))
            System.out.println(b != 0 ? "Result = " + (a / b) : "Cannot divide by zero!");
        else if (op.equals("pow"))
            System.out.println("Result = " + Math.pow(a, b));
        else
            System.out.println("Invalid operation!");
        
        sc.close();
    }
}
