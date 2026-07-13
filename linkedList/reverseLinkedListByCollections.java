
import java.util.Collections;
import java.util.LinkedList;

class reverseLinkedListByCollections {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        Collections.reverse(list);
        System.out.println(list);
    }
}
