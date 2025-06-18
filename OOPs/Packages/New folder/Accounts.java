package bank;

//                    Public (accessible for all packages as well as for our package)

// public class Accounts{
//     public String name;      // public
// }

// class Bank {
//     public static void main(String args[]){
//         Accounts a1= new Accounts();
//         a1.name="aman";
//     }
// }


//           default (only accessible for our package)

// public class Accounts{
//     String name;                 // default
// }

// class Bank {
//     public static void main(String args[]){
//         Accounts a1= new Accounts();
//         a1.name="aman";
//     }
// }

//           protected (It is accessible by our package and is only accessible by sub classes of other packages)

// public class Accounts{
//     String name;                 // default
//     protected  String email;     // protected
// }

// class Bank {
//     public static void main(String args[]){
//         Accounts a1= new Accounts();
//         a1.name="aman";
//     }
// }

//              private (It is only accessible only by a class and other packages or other classes on the same package cannot access it)

// public class Accounts{
//     String name;                
//     protected  String email;            // protected
//     private String password;
// }

// class Bank {
//     public static void main(String args[]){
//         Accounts a1= new Accounts();
//         a1.name="aman";
//         a1.password="ABC123";
//     }
// }

// How to access private things?
// So for this there is a concept of getters and setters

public class Accounts{
    String name;                
    protected  String email;            // protected
    private String password;            // private

    // getters and setters

    public String getpassword(){
        setpassword(randompass);             // if we have to set random paswword
        return this.password;           
    }

    // public void setpassword(String pass){ 
    //     this.password= pass;
    // }

    private void setpassword(String pass){ 
        this.password= pass;
    }
}

class Bank {
    public static void main(String args[]){
        Accounts a1= new Accounts();
        a1.name="aman";
        a1.setpassword("ABC124");
        System.out.println(a1.getpassword());
    }
}