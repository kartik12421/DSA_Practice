class Student {
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name);
        System.out.println(age);
    }
}

public class polymorphism {
    public static void main(String[] args){

        Student st = new Student();
        st.name = "Kartik";
        st.age = 20;
        st.printInfo(st.age);
    }
}