class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("writing...");
    }
    public void printColor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    //constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student2 {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    //constructor
    Student2(Student2 s3) {
        this.name = s3.name;
        this.age = s3.age;
    }

    public Student2() {
    }

    
}

public class oops {
    public static void main(String[] args){
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";
        pen1.write();
        pen1.printColor();

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.printColor();

        // Student s1 = new Student("Kartik", 20);
        // s1.printInfo();

        // Student2 st = new Student2();
        // st.name = "Kartik";
        // st.age = 20;

        // Student2 st2  = new Student2(st);
        // st2.printInfo();
    }
}