package huce.fit.pbank;

public class Vietcombank implements iBank{
    @Override
    public void connectToBank() {
        System.out.println("Ket noi den Vietcombank");
    }

    @Override
    public void transferToBank() {
        System.out.println("Chuyen khoan den Vietcombank");
    }
}
