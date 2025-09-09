package org.example;

public class Mangsonguyen {
    //cho mot mang gom n so nguyen
    //tinh trung binh cong, tat ca cac so chia het cho 3.
//    int[] A = new int[100];
    public static void main(String[] args) {
        int[] A = {2,3,8,9,15,24,10,15,6};
        int t=0;
        int d=0;
        System.out.println("Cac so chia het cho 3 la: ");
        for(int i=0;i<A.length;i++){
            if(A[i]%3==0){
                t+=A[i];
                d++;
                System.out.print(A[i]+" ");
            }
        }
        System.out.println();
        System.out.println("Tong cac so chia het cho 3: "+d);
        //
        double tbc = (double) t/d;
        System.out.println("Trung binh cong la: "+tbc);
    }
}
