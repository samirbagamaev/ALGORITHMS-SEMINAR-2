public class MainCar {
    public static void main(String[] args) {

        Car car1 = new Car("Bentley", 2, "Red");
        car1.engine.L = 45;
        car1.engine.horsepower = 300;
        car1.engine.V = 8;

        Car car2 = new Car();
        car2.name = "Ford";
        car2.seats = 2;
        car2.color = "Black";
        car2.engine.L = 35;
        car2.engine.horsepower = 350;
        car2.engine.V = 6;

    }
}

class Vector {
    int x;
    int y;
    int z;
}