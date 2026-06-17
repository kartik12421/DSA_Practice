
abstract class CarPhysics {

    abstract void drive();

    public void exhaust() {
        System.out.println("vroom........vroom...");
    }

    CarPhysics() {
        System.out.println("car is nothing without me...");
    }

}

class Toyota extends CarPhysics {

    public void drive() {
        System.out.println("drives on 4 kmph");
    }

    Toyota() {
        System.out.println("i am toyota...");
    }
}

class Maruti extends CarPhysics {

    public void drive() {
        System.out.println("drives on 2 kmph");
    }
}

public class abstraction {

    public static void main(String[] args) {
        Toyota t = new Toyota();
        t.drive();
        t.exhaust();
    }
}
