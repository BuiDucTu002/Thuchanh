import java.util.ArrayList;

public class bh2 {
    public static <T extends Comparable<T>> T findMax(ArrayList<T> list) {
        T max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i).compareTo(max) > 0)
                max = list.get(i);
        }
        return max;
    }
}
