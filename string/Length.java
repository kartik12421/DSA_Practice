public class Length {

    public static void main(String[] args) {
        String a = "Kartik";
        String b = "Joshi";

        String fullName = a + " " + b + " " + "is a BCA student";

        System.out.println(fullName.length());

        //charAt
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }

    }
}
