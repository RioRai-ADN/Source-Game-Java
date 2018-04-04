package Bai03;


import Bai01.DemTanSuat;

public class CongChuoi extends DemTanSuat {

    private String chuoi1;
    private String chuoi2;

    public CongChuoi() {
        chuoi1 = null;
        chuoi2 = null;
    }

    public String ghep2Chuoi() {

        String res = chuoi1 + chuoi2;
        return res;
    }

    public static void main(String args[]) {

        CongChuoi c = new CongChuoi();

        System.out.println("Nhap chuoi 1");
        c.chuoi1 = c.nhapChuoi();

        System.out.println("Nhap chuoi 2");
        c.chuoi2 = c.nhapChuoi();

        System.out.println("Ket Qua ghep chuoi: " + c.ghep2Chuoi());
    }
}
