import bank.*;
//                                              INHERITANCE

 //        Basic of Inheritance

// class Shape {
//     String colour;                
// }

// class Triangle extends Shape{
// }

        // Single Level Inheritance

// class Shape {
//     public void area(){
//         System.out.println("Displays area ");          
//     }
// }

// class Triangle extends Shape {
//     public void area(int l, int h){
//         System.out.println(0.5*l*h);
//     }
// }

// public class inheritance1{
//     public static void main(String[] args){
//         Triangle t1=new Triangle();
//         t1.area(10,15);
//     }
// }

      // Multi Level Inheritance 

// class Shape {
//     public void area(){
//         System.out.println("Displays area ");
//     }
// }

// class Triangle extends Shape{
//     public void area(int l, int h){
//         System.out.println((1/2)*l*h);                     
//     }
// }

// class EquilateralTriangle extends Triangle{
//     public void area(int l, int h){
//         System.out.println((1/2)*l*h);
//     }
// }

// public class inheritance1{
//     public static void main(String[] args){
//     }
// }

//              Hierarchial Inheritance

// class Shape {
//     public void area(){
//         System.out.println("Displays area ");          
//     }
// }

// class Triangle extends Shape {
//     public void area(int l, int h){
//         System.out.println(0.5*l*h);
//     }
// }

// class Circle extends Shape {
//     public void area (int r ){
//         System.out.println((3.142)*r*r);
//     }
// }

// public class inheritance1{
//     public static void main(String[] args){
//         Triangle t1=new Triangle();
//         t1.area(10,15);
//         Circle c1= new Circle();
//         c1.area(20);
//     }
// }

//    Multiple Inheritance (Which is not in java but it is in c++)

//                                   Usage Of Package

public class inheritance1{
    public static void main(String[] args){
        bank.Accounts a1= new bank.Accounts();
        a1.name = "Aman";
        System.out.println(a1.name);
    }
}