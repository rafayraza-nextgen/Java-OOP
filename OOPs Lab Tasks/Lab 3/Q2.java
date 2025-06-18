import java.util.Scanner;
public class Q2 {
    public static void main(String[] args){
        //Q2:
        Scanner sc= new Scanner(System.in);
        int a,b;
        System.out.println("Enter the table: ");
        a=sc.nextInt();
        System.out.println("Enter the maximum length");
        b=sc.nextInt();
        for(int i=1; i<=b;i++){
            System.out.println(a+" x "+i+" = "+ (a*i));
        }

    }
}
