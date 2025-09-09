import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.ArithmeticException

public class bai2 {
    public void thongke() throws Exception {
            try {
                FileInputStream input = new FileInputStream(name:"D:/muado.txt")
            }
            catch (FileNotFoundException e){
               throw new Exception(e);
            }

    }

}
