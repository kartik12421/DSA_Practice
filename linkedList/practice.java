
import java.util.LinkedList;

//Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.
class practice {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        int arr[] = {1, 5, 7, 3, 8, 2, 3};

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        System.out.println(list);

        int index = list.indexOf(7);

        if (index != -1) {
            System.out.println("7 found at index: " + index);
        } else {
            System.out.println("element not found");
        }
    }
}
