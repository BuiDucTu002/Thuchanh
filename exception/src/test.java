import java.lang.ArithmeticException;
public class test {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int c = a / b;
            System.out.println("ket qua :" + c);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("HE thong gap loi!");
        }
    }
}
