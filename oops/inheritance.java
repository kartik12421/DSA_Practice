class Shapes {
    public void area() {
        System.out.println("display area");
    }
}

class Triangle extends Shapes {
    public void area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}

class EquilateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println(0.5 * l * b);
    }
}

class Circle extends Shapes {
    public void area(int r) {
        System.out.println(Math.PI * r * r);
    }
}

public class inheritance {
    public static void main(String[] args){
        // Triange t1 = new Triange();
        // t1.area();
        // t1.area(4, 6);
    }
}