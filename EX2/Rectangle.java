
public class Rectangle extends Shape {
    
    double Length;
    double Breath;

    public Rectangle(double Length, double Breath) {
        this.Length=Length;
        this.Breath=Breath;
        this.Name = "Rectangle";

    }
    @Override
    void calculateArea() {
        Area = Length * Breath;
    }

}
