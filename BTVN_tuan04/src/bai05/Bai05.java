package bai05;

import Bai01.DemTanSuat;

public class Bai05 extends DemTanSuat {

    private String chuoi1;
    private String chuoi2;

    public Bai05() {

        chuoi1 = null;
        chuoi2 = null;
    }

    public String kiemTraGiaoNhau() {

        String temp = "";
        for (int i = 0; i <= chuoi1.length()-1; i++) {
            for (int j = 0; j <= chuoi2.length()-1; j++) {

                if (chuoi1.charAt(i) == chuoi2.charAt(j))
                    temp += chuoi1.charAt(i);
            }
        }

        return temp;
    }

    public static void main(String args[]) {

        Bai05 b = new Bai05();

        System.out.println("Nhap chuoi 1:");
        b.chuoi1 = b.nhapChuoi();

        System.out.println("Nhap chuoi 2:");
        b.chuoi2 = b.nhapChuoi();

        System.out.println("Phep giao 2 chuoi: " + b.kiemTraGiaoNhau());
    }
}
