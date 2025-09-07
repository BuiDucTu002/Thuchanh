package huce.fit.account;

public class User {
    private int id;
    private String name;
    private double balance;//so du
    private long account_number;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public User(){

    }

    //nap tien vao tai khoan

    public void deposit(double amount){
        if(amount > 0){
            balance+=amount;
            System.out.println("Nap tien thanh cong!");
        }else{
            System.out.println("So tien nap vao tai khoan phai la so duong.");
        }
    }
    //tra ra so du tai khoan
    public void getBalance(){
        System.out.println("So du la: "+balance);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getAccount_number() {
        return account_number;
    }

    public void setAccount_number(long account_number) {
        this.account_number = account_number;
    }
}
