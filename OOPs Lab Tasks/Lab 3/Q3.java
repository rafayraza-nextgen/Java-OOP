import java.util.Scanner;
public class Q3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        //Q3:
        String pass,name="Rafay123";
        int i=0;
        do { 
            System.out.println("Enter the password: ");
            pass=sc.nextLine();
            if(pass.equals(name))
            {
                System.out.println("Welcome ");
                break;
            }
            else{
                System.out.println("Incorrect ");
            }
            i++;
        } while (i<3);
    }

    }
