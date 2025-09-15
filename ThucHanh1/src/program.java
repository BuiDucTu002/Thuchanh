import java.util.ArrayList;
import java.util.Scanner;


public class program {
    public static void main(String[] args) {
        System.out.println("nhập danh sách điểm");
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            list.add(sc.nextInt());
        }
        System.out.println("nhập danh sách sinh viên");
        ArrayList<String> student = new ArrayList<>();
        Scanner sc2 = new Scanner(System.in);
        int n1 = sc2.nextInt();
        for(int a = 0; a < n1; a++){
            student.add(sc2.next());
        }
        String name = GenericE.findMax(student);
        System.out.println("tên cuối cùng " +name);
        int max = GenericE.findMax(list);
        System.out.println("max = " + max);
    }
}
