import bank.*;
public class Calling_package {
    public static void main(String args[]){
        bank.Accounts a1= new bank.Accounts();
        a1.name = "Aman";
        System.out.println(a1.name);
    }
}
