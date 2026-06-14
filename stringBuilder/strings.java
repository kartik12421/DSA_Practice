
public class strings {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Kartik");
        System.out.println(str);

        //char at index 0
        System.out.println(str.charAt(0));

        //set char at index 0
        str.setCharAt(0, 'A');
        System.out.println(str);

        //insert
        str.insert(1, 'b');
        System.out.println(str);
        

        //delete
        str.delete(2, 4);
        System.out.println(str);

        //append
        str.append(' ');
        str.append('K');
        str.append('J');
        System.out.println(str);
        System.out.println(str.length());
    }
}
