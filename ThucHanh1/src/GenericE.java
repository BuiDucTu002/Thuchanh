import java.util.ArrayList;

public class GenericE {   // đổi tên lớp viết hoa là tốt
    public static <T extends Comparable<T>> T findMax(ArrayList<T> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        T max = list.get(0);
        int n = list.size();
        for (T element : list) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}
