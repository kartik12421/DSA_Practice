
import java.util.LinkedList;

class linkedList2 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("am");
        list.addFirst("I");
        System.out.println(list);

        list.addLast("the");
        list.addLast("ghost");
        list.add("got it");
        System.out.println(list);

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "->");
        }

        System.out.print("null");

        System.out.println();
        System.out.println("-----------------------------------------");

        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);

        System.out.println("-----------------------------------------");

        list.remove(1);
        System.out.println(list);
    }
}
