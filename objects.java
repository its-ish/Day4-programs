import java.util.Scanner;
class Shape {
    void area(int a, int b) {
        System.out.println("Area :");
    }
    void perimeter(int a, int b) {
        System.out.println("Perimeter :");
    }
}
class rectangle extends Shape {
    void area(int a, int b) {
        System.out.println(a*b);
    }
    void perimeter(int a, int b) {
        System.out.println((a+b)*2);
    }
}
public class objects {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        r.area(10, 2);
        r.perimeter(1, 20);
    }
}
