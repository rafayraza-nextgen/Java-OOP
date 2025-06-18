import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, i;
        boolean isPrime = true;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        if (num <= 1) {
            isPrime = false; // 0 and 1 are not prime
        } else {
            for (i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println(num + " is a Prime number.");
        else
            System.out.println(num + " is NOT a Prime number.");
    }
}
