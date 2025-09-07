package huce.fit.pbank;

import huce.fit.account.User;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
//Chuyen khoan thuc te
        User user1 = new User(1,"Nguyen Van Binh");
        user1.setAccount_number(12345);
        //ck
        int select=0;
        iBank iBank = null;
        //gia lap lua chon tren giao dien
        Scanner scr = new Scanner(System.in);
        //Cau hinh cho ngan hang mac dinh
        //"doc tu file config.xml";
        int cauhinh = 2;//vi du ket qua doc duoc
        select = cauhinh;
        if(select==0) {
            iBank = new Vietinbank();
        }else if(select==1){
            iBank = new Vietcombank();
        }else if(select==2){
            iBank = new VPBank();
        }else if(select==3){
            iBank = new ACBBank();
        }
        //
        BTransfer bTransfer = new BTransfer(iBank);
        bTransfer.transfertoBank(user1.getAccount_number());
    }
}
