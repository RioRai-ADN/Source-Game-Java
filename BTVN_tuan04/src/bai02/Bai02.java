package bai02;

import Bai01.DemTanSuat;

public class Bai02 extends DemTanSuat{

    private String chuoi1;
    private String chuoi2;

    public Bai02() {

        chuoi1 = null;
        chuoi1 = null;
    }

    boolean kiemTraTrunngNhau(String chuoi, char kiTu, int postion) {

        for (int i = 0; i <= chuoi.length()-1; i++) {
            if (kiTu == chuoi.charAt(i) && i != postion)
                return false;
        }
        return true;
    }

    public String chuanHoaChuoi(String chuoi) {

        String temp = "";

        for (int i = 0; i <= chuoi.length()-1; i++) {

            if (this.kiemTraTrunngNhau(chuoi, chuoi.charAt(i), i))
                temp += chuoi.charAt(i);
        }

        return temp;
    }

    public static void main(String args[]) {

        Bai02 b = new Bai02();
        System.out.println("Nhap chuoi 1");
        b.chuoi1 = b.nhapChuoi();

        System.out.println("Nhap chuoi 1");
        b.chuoi2 = b.nhapChuoi();

        String chuoiChuanHoa = b.chuanHoaChuoi(b.chuoi1);
        chuoiChuanHoa += b.chuanHoaChuoi(b.chuoi2);

        System.out.println("Phep hoi Union: " + chuoiChuanHoa);
    }
}
