/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlnv;

import java.util.ArrayList;
import java.util.Scanner;
import model.NhanVien;
import model.NvCongNhat;
import model.NvQuanLy;
import model.NvSanXuat;

/**
 *
 * @author Rio.Rai
 */
public class Qlnv {

    public static ArrayList nhapDSNhanVien() {

        ArrayList list = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int chon = 0;
        boolean check = false;

        while (true) {

            System.out.println("NHAP DANH SACH NHAN VIEN!");
            System.out.println("[1].Nhan vien san xuat");
            System.out.println("[2].Nhan vien cong nhat");
            System.out.println("[3].Nhan vien quan ly");
            System.out.println("0.Thoat");

            while (!check) {
                try {
                    chon = sc.nextInt();
                    check = true;
                    
                    if(chon > 3 || chon < 0) {
                        System.out.println("Chon sai roi! Chon lai nhe");
                        check = false;
                    }
                } catch (Exception e) {
                    System.out.println("Chon sai roi! Chon lai nhe");
                    sc.nextLine();
                    check = false;
                }
            }

            NhanVien nv = null;

            if (chon == 1) {

                nv = new NvSanXuat();
            }
            if (chon == 2) {
                nv = new NvCongNhat();
            }
            if (chon == 3) {
                nv = new NvQuanLy();
            }
            if (chon == 0) {
                break;
            }

            nv.nhap();
            list.add(nv);
            check = false;
        }

        return list;
    }

    public static void xuatDSNhanVien(ArrayList list) {

        for (int i = 0; i < list.size(); i++) {
            NhanVien nv = (NhanVien) list.get(i);
            nv.xuat();
            System.out.println();
        }
    }
    
    public static long tinhTongLuong(ArrayList list) {
        
        long  rs = 0;
        
        for(int i = 0; i < list.size(); i++) {
            NhanVien nv = (NhanVien)list.get(i);
            rs += nv.tinhLuong();
        }
        return rs;
    }
    
    public static int demNhanVien(ArrayList list, int chon) {
        String clss = "";
        int dem = 0;
        if (chon == 1)
            clss = "NvSanXuat";
        if (chon == 2)
            clss = "NvCongNhat";
        if (chon == 3)
            clss = "NvQuanLy";
        
        for(int i = 0; i < list.size(); i++) {
            if (list.get(i).getClass().toString() == clss)
                dem++;
        }
        
        return dem;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList list = nhapDSNhanVien();
        xuatDSNhanVien(list);
        System.out.println("Tong Luong: "+ tinhTongLuong(list));
        System.out.println("Dem nhan vien san xuat: " + demNhanVien(list, 1));
    }

}
