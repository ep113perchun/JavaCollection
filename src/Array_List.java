import java.util.ArrayList;
import java.util.List;

public class Array_List {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            arrayList.add(i);
        }

        System.out.println("Удаляю элемент: " + arrayList.remove(3));

        for (Integer x : arrayList) {
            System.out.println(x);
        }

        System.out.println("размер " + arrayList.size());
        System.out.println("get i = 9: " + arrayList.get(9));
    }
}