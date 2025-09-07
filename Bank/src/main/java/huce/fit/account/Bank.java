package huce.fit.account;

/*
Ngân hàng Vietinbank cần xây dựng một phần mềm
hỗ trợ chuyển khoản tới nội bộ, hoặc một số ngân hàng khaác,
có thể phát sinh trong tương lai.
Bank

 */



public abstract class Bank {
    public void connectToBank(){
        System.out.println("Ket noi den ngan hang...");
    }
     public abstract  void bankTransfer();
}
