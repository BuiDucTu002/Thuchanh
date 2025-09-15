import java.util.ArrayList;
import java.util.Scanner;

public class collection {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng danh sách điểm:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        ArrayList<String> list2 = new ArrayList<>();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Nhập số lượng danh sách:");
        int n2 = sc2.nextInt();
        for (int i = 0; i < n2; i++) {
            list2.add(sc2.next());
        }
        int m =bh2.findMax(list);
        String m2 = bh2.findMax(list2);
        System.out.println("phần tử lớn nhất: "+ m);
        System.out.println("phần tử lớn nhất: "+ m2);

        System.out.println(list);
        System.out.println("nhập sinh viên cần xóa: ");
        String n1 = sc.next();
        list.remove(n1);
        System.out.println(list);
        System.out.println("điền sinh viên cần tìm: ");
        String n3 = sc.next();
        if(list.contains(n3)){
            System.out.println("tồn tại sinh viên trong danh sách");
        }
        else System.out.println("Không tồn tại sinh viên!");
    }
}
