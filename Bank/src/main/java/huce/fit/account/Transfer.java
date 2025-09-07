package huce.fit.account;

public class Transfer {
    private Bank bank;
    public Transfer (Bank bank){
        this.bank = bank;
    }
    public void transfertoBank(long acc){
        bank.bankTransfer();
    }
}
