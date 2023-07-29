public class Car {
    String name;
    int seats;
    String color;
    Engine engine;

    Car() {
        name = "x";
        engine = new Engine();
        color = "Black";
        seats = 5;
    }

    Car(String name) {
        this.name = name;
        engine = new Engine();
        color = "Black";
        seats = 5;
    }

    Car(String name, int seats, String color) {
        this.name = name;
        engine = new Engine();
        this.color = color;
        this.seats = seats;
    }

    public void print() {
        int fillerLength = 8 + name.length();
        System.out.println("----" + name + "----");
        System.out.println(color + "  seats:" + seats);
        engine.print();
        for (int i = 0; i < fillerLength; i++)
            System.out.print("-");
        System.out.println();
    }

    public class Engine {
        int L;
        int horsepower;
        int V;

        Engine() {
            L = 30;
            horsepower = 100;
            V = 4;
        }

        public void print() {
            System.out.println("-Engine-");
            System.out.println(horsepower + "hp  V" + V + " " + L + "L");
        }
    }
}
