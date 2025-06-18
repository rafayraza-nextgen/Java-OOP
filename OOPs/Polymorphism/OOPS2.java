

class Pen{
    String colour;
    String type;  // ball point, gel
    public void write(){
        System.out.println("Writing Something ");
    }

    public void printcolour(){
        System.out.println(this.colour);        // here "this " is actually a key word of java (this is function ko ye batayega ki is function ko kis object ne call kiya hai)
    }

    public void printtype(){
        System.out.println(this.type);
    }
 }

 class Student{
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
        }
    
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name , int age){
        System.out.println(name +" "+age);
    }
 }
 
 public class OOPS2 {
    public static void main(String args[]){

        Student s1 = new Student();
       
        s1.age=24;

        s1.printInfo(s1.age);
    }
 }
