package huce.fit.account;

public class VPBank extends Bank{
    @Override
    public void bankTransfer() {
        super.connectToBank();
        System.out.println("Chuyen khoan den VP Bank");
    }
}
