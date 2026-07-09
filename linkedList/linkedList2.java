
import java.util.LinkedList;

class linkedList2 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("am");
        list.addFirst("I");
        System.out.println(list);

        list.addLast("the");
        list.addLast("ghost");
        System.out.println(list);
    }
}
