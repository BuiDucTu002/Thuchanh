package huce.fit.pbank;


public class BTransfer {
    private iBank bank;
    //DI & IoC
    public BTransfer (iBank bank){
        this.bank = bank;
    }
    public void transfertoBank(long acc){
        bank.connectToBank();
        bank.transferToBank();
    }
}
