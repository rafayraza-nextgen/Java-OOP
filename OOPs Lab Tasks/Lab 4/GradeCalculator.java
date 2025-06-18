import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float m1, m2, m3, m4, m5, total, percentage;
        int gradeCase;

        System.out.println("Enter marks of 5 subjects (out of 100):");
        m1 = input.nextFloat();
        m2 = input.nextFloat();
        m3 = input.nextFloat();
        m4 = input.nextFloat();
        m5 = input.nextFloat();

        total = m1 + m2 + m3 + m4 + m5;
        percentage = (total / 500) * 100;

        System.out.println("\nTotal Marks = " + total + " out of 500");
        System.out.println("Percentage = " + percentage + "%");

        switch ((int)percentage) {
            
            case 95:
                System.out.println("Grade: A+");
                break;
            case 70:
                System.out.println("Grade: A");
                break;
            case 60:
                System.out.println("Grade: B");
                break;
            case 40:
                System.out.println("Grade: C");
                break;
            case 35:
                System.out.println("Grade: D");
                break;
            default:
                System.out.println("Grade: F (Fail)");
                break;
        }
    }
}
