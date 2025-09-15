import java.util.ArrayList;
import java.util.Scanner;
public class StudentList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số lượng sinh viên cần thêm:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            students.add(sc.next());
        }
        System.out.println(students);
        System.out.println("chọn sinh viên cần xóa:");
        String name = sc.next();
        System.out.println("sinh viên " + name+" đã xóa!");
        students.remove(name);
        System.out.println(students);
        System.out.println("tìm kiếm sinh viên:");
        String name2 = sc.next();
        if (students.contains(name2)) {
            System.out.println("có sinh viên: "+ name2);
        }else System.out.println("không tồn tại");
    }
}
