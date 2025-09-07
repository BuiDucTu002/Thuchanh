package huce.fit.pbank;

public class VPBank extends Searching implements iBank{
    @Override
    public void connectToBank() {
        System.out.println("Ket noi den VPBank");
    }

    @Override
    public void transferToBank() {
        System.out.println("Chuyen khoan den VPBank");
    }
}
