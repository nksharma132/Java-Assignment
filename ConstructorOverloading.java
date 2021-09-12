/**
 * Question: 13. Write a program to explain constructor overloading.
 *
 * Author: Nitish Kumar Sharma (726) B.C.A.
 */

class Box
{
    private int length, breadth, height;

    Box() {                               // Default Constructor
        length = breadth = height = 0;
    }
    Box(int size) {                       // Constructor with single parameter
        length = breadth = height = size;
    }
    Box(int l, int b, int h) {           // Constructor with triple parameters
        length = l;
        breadth = b;
        height = h;
    }
    public void showData() {
        System.out.println("Length = "+length+", Breadth = "+breadth+", Height = "+height);
        System.out.println("Area of Box = "+(length*breadth*height));
    }
}

public class ConstructorOverloading {

    public static void main(String[] args) {

        Box objBox1 = new Box();             // Call Default Constructor
        objBox1.showData();
        Box objBox2 = new Box(5);            // Call Constructor with single parameter
        objBox2.showData();
        Box objBox3 = new Box(3,6,2);        // Call Constructor with triple parameters
        objBox3.showData();
    }
}