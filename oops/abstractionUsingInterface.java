interface Car {
    int headLight = 2;
    void drive();
}

interface SuperCar {
    int headLight = 2;
    void drive();
}

class Toyota implements Car, SuperCar {
    public void drive(){
        System.out.println("Toyota Supra......");
    }
}

public class abstractionUsingInterface {
    public static void main(String[] args){
        Toyota t = new Toyota();
        t.drive();
    }
}