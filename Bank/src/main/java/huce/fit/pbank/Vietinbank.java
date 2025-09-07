package huce.fit.pbank;

public class Vietinbank implements iBank{

//    private int key;
//    public Vietinbank(int key){
//        this.key = key;
//    }

    @Override
    public void connectToBank() {
        //code here
        System.out.println("Ket noi den Vietinbank");
    }

    @Override
    public void transferToBank() {
//code here
        System.out.println("Chuyen khoan toi Vietinbank");
    }
}
