
class Students {

    String name;
    static String school;
    public static void changeSchool() {
        school = "new School";
    }
}

public class Static {

    public static void main(String[] args) {
        Students.school = "Divine Light School";
        Students s = new Students();
        s.name = "Kartik";
        System.out.println(s.name + " " + s.school);
    }
}
