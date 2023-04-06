import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        int element = list.get(0);
        System.out.println(element);

        list.add(2,4);
        System.out.println(list);

        list.set(1,8);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

        Collections.sort(list);
        System.out.println(list);
    }
}
