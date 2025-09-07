package huce.fit.account;

public class Program {
    public static void main(String[] args) {
        User user1 = new User(1,"Nguyen Van Binh");
        user1.setAccount_number(12345);
        user1.deposit(1000000);
        user1.getBalance();
        //ck
        int select=0;
        Bank bank = null;
        //gia lap lua chon tren giao dien
        if(select==0) {
            bank = new Vietinbank();
        }else if(select==1){
        bank = new Vietcombank();
        }else if(select==2){
            bank = new VPBank();
        }
        Transfer transfer = new Transfer(bank);
        transfer.transfertoBank(user1.getAccount_number());
    }
}
