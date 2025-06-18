class Box{
    double width, length, height;
    void getdata(double width,double length,double height){
        this.width=width;
        this.length=length;
        this.height=height;
    }
    double volume(){
        double volume=length*width*height;
        return volume;
    }
}
public class Boxdemo {
    public static void main(String[] args) {
        double volume;
        Box b1= new Box();
        b1.getdata(12.5, 14.5, 11.7);
        volume= b1.volume();
        System.out.println("The volume of the box is: "+volume);
    }
}
