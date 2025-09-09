package org.example;

import java.util.Scanner;

public class ToanHoc {
    //nhap vao tu ban phim 2 so a, b
    //tinh tong 2 so do va in ra man hinh
    public static void main(String[] args) {
        //code here
        int a;
        int b;
        int s;
        Scanner scn = new Scanner(System.in);
        System.out.println("Vui long nhap so a: ");
        a = scn.nextInt();
        System.out.println("Vui long nhap so b: ");
        b = scn.nextInt();
        //tinh tong
        s = a+b;
        System.out.println("Ket qua la: "+s);
    }

}
