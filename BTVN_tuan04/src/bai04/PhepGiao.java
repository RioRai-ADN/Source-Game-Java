package bai04;

import Bai01.DemTanSuat;

public class PhepGiao extends DemTanSuat {

    private String chuoi1;
    private String chuoi2;

    public PhepGiao() {
        chuoi1 = null;
        chuoi2 = null;
    }

    public String giaoHaiChuoi() {
        String res = "";
        for (int i = 0; i < this.chuoi1.length(); i++) {
            for (int j = 0; j < this.chuoi2.length(); j++) {
                if (chuoi1.charAt(i) == chuoi2.charAt(j))
                    res += chuoi1.charAt(i);
            }
        }
        return res;
    }

    public static void main(String args[]) {

        PhepGiao p = new PhepGiao();

        System.out.println("Nhap chuoi 1");
        p.chuoi1 = p.nhapChuoi();

        System.out.println("Nhap chuoi 2");
        p.chuoi2 = p.nhapChuoi();

        System.out.println("Ket qua phep giao: " + p.giaoHaiChuoi());
    }
}
