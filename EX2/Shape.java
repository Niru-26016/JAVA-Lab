
abstract class Shape {

    double Area;
    String Name;

    abstract void calculateArea();
    
    void display() {
        System.out.printf("%s Area: %.3f\n",Name,Area);
    }
}
