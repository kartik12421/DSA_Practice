
import java.util.ArrayList;
import java.util.Collections;

public class arrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //add element
        list.add(0);
        list.add(1);
        list.add(2);

        System.out.println(list);

        //get element
        System.out.println(list.get(1));

        //add element in between
        list.add(1, 69);
        System.out.println(list);

        //set element
        list.set(0, 5);
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);

        //size
        System.out.println(list.size());

        //loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
