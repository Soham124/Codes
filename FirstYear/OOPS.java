//OOPS

//creates class
package FirstYear;
class Pen {

    // creates properties for the objects of the class
    int price;
    private String color;
    String type;

    // conatructors
    Pen(int price, String color, String type) {
        this.price = price;
        this.color = color;
        this.type = type;
    }

    // setters
    void setColor(String Color) {
        this.color = Color;
    }

    // getters
    String getColor() {
        return this.color;
    }

    // functions to perform on the object of the class by using (object.function)
    public void write() {
        System.out.println("writing somthing");
    }

    public void printColor() {
        System.out.println(this.color);
    }

    public void type() {
        System.out.println(this.type);
    }

    public void cost() {
        System.out.println(this.price);
    }

    public void info() {
        System.out.println(this.color);
        System.out.println(this.type);
        System.out.println(this.price);
    }
}

public class OOPS {
    public static void main(String[] args) {

        // creates the objects using constructors
        Pen pen1 = new Pen(10, "Red", "fountain"); // java automatically creates a non parametrised constructor(with no
                                                   // parameters
        // in it's braces)
        System.out.println(pen1.getColor());
        pen1.setColor("blue");
        // Pen pen2 = new Pen();

        // // assigns value to the properties of the object
        // pen1.color = "blue";
        // pen2.color = "black";
        // pen1.type = "gel";
        // pen2.type = "ball";
        // pen1.price = 10;
        // pen2.price = 5;

        // used to run the function of the object
        // pen1.printColor();
        // pen1.write();
        // pen2.cost();
        // pen1.info();

        // Pen pen3 = new Pen();
        // pen3 = pen1;
        // pen3.info();

        pen1.info();
    }
}
