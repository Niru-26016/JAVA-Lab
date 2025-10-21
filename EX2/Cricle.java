
class Cricle extends Shape {

    double Radius;

    public Cricle(double Radius) {
        this.Radius = Radius;
        this.Name = "Cricle";
    }

    @Override
    void calculateArea() {
        
        Area = Math.PI * Radius * Radius;
    }

}
