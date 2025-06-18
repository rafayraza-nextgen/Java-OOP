

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
        System.out.println(type);
    }
 }

 class Student{
    String name;
    int age;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    // Student(){
    //     System.out.println("constructor Called ");  //Non parameterize constructor
    //     }

    // Student(String name,int age){ 
    //    this.name=name;                                  //parameterize constructor
    //    this.age=age;
    // }

    Student(Student s2){
        this.name=s2.name;                                 //copy constructors
        this.age=s2.age;
    }

    Student(){
        }
 }
 
 public class OOPs {
    public static void main(String args[]){
        // Student s1 = new Student(); // When an object is created using a "new" keyword, then space is allocated for the variable in a heap or in memory, and the starting address is stored in the stack memory.
        //here "Student()" is a function known as contructor. constructor doesn't contains any return type like functions 
        // s1.name="aman";
        // s1.age=24;

        // s1.printinfo();

        Student s1 = new Student();
        s1.name="Arsalan ";
        s1.age=24;

        Student s2= new Student(s1);

        s1.printinfo();
    }

 }