import java.util.Scanner;

public class EvenOddSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        switch (num % 2) {
            case 0:
                System.out.println(num + " is Even.");
                break;
            case 1:
                System.out.println(num + " is Odd.");
                break;
            default:
                System.out.println("Invalid input.");
        }
    }
}
