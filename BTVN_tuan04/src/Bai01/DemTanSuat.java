package Bai01;

import java.util.Scanner;

public class DemTanSuat {

    private String chuoi;

    public DemTanSuat() {
        chuoi = null;
    }

    public String nhapChuoi() {

        Scanner scanner = new Scanner(System.in);

        boolean check = false;

        while(check == false) {
            try {
                System.out.print("Nhap chuoi cua ban: ");

                this.chuoi = scanner.nextLine();

                check = true;
            }catch (Exception ex) {
                System.out.println("Ki tu khong hop le! Hay nhap lai!");
            }
        }
        return chuoi;
    }

    boolean kiemTraTrungLap(String chuoi, char kiTu) {

        //Kiem tra ki tu hien tai co phai khoang trong hay khong!
        if (kiTu == ' ')
            return false;
        for (int i = 0; i <= chuoi.length()-1; i++) {
            if (chuoi.charAt(i) == kiTu)
                return false;
        }
        return true;
    }

    int demKiTiGiongNhau(String chuoi, char kiTu, int pos) {

        int dem = 0;
        for (int i = pos; i <= chuoi.length()-1; i++) {
            if (chuoi.charAt(i) == kiTu)
                dem++;
        }
        return dem;
    }

    public void demTanSuatChuoi(String arr) {

        int dem = 0;

        String temp = "";
        for (int i = 0; i <= arr.length()-1; i++) {

            if (!kiemTraTrungLap(temp, arr.charAt(i))){
                //DO NOTHING, NEXT POSITION
            }
            else {
                temp += arr.charAt(i);

                dem = demKiTiGiongNhau(chuoi, arr.charAt(i), i);

                System.out.println("Tan suat chu " + arr.charAt(i) + ": " + dem);
            }

            //dem = 1;
        }

    }

    public static void main(String args[]) {

        DemTanSuat d = new DemTanSuat();
        d.demTanSuatChuoi(d.nhapChuoi());
    }
}
