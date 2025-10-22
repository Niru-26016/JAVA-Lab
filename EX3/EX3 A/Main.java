
class Main {

    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.Start();
        bike.Start();
        car.Stop();
        bike.Stop();
    }

}
