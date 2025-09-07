package huce.fit.pbank;

public class ACBBank implements iBank{
    @Override
    public void connectToBank() {
        System.out.println("Ket noi den ACB Bank");
    }

    @Override
    public void transferToBank() {
        System.out.println("Chuyen khoan den ACB Bank.");
    }
}
