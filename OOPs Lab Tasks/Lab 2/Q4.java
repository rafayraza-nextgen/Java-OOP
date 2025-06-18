import java.util.Scanner;
public class Q4 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
    float a,b,c,S1;
    double x,y;
    System.out.println("Input the three values: ");
    a=sc.nextFloat();
    b=sc.nextFloat();
    c=sc.nextFloat();
    S1 = (float)Math.sqrt(Math.pow(b, 2) - 4 * a * c);

    if (Float.isNaN(S1)) {
        System.out.println("Roots are imaginary (complex numbers), can't compute real roots.");
    } else {
        x = (-b + S1) / (2 * a); 
        y = (-b - S1) / (2 * a);  
        System.out.println("The first root is: " + x);
        System.out.println("The second root is: " + y);
    }
}
}
