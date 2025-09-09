package huce.fit.account;

public class Vietcombank extends Bank {

    @Override
    public void bankTransfer() {
        super.connectToBank();
        System.out.println("Chuyen khoan den Vietcombank.");
    }
}
