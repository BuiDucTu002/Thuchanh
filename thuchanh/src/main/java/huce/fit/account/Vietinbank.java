package huce.fit.account;

public class Vietinbank extends Bank {

    @Override
    public void bankTransfer() {
        super.connectToBank();
        //code here
        System.out.println("Chuyen khoan den vietinbank.");
    }

}
