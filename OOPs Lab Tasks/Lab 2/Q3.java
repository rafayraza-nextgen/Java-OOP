import java.util.Scanner;
public class Q3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        float r;
        System.out.println("Enter the radius: ");
        r=sc.nextFloat();
        System.out.println("The area of the circle is: "+ (Math.PI*Math.pow(r,2)));
    }
}
