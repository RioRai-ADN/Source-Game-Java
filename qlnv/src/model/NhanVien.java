/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author Rio.Rai
 */
public abstract class NhanVien {

    protected String hoTen;
    protected String diaChi;
    protected Date ngaySinh;

    public void nhap() {

        Scanner sc = new Scanner(System.in);
        boolean check = false;

        System.out.println("Nhap ho ten:");
        this.hoTen = sc.nextLine();

        System.out.println("Nhap ngay sinh:(ngay/thang/nam)");
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        while (!check) {
            try {
                this.ngaySinh = f.parse(sc.nextLine());
                check = true;
            } catch (ParseException e) {
                System.out.println("Nhap ngay sinh khong dung, hay nhap lai (ngay/thang/nam)");
                check = false;
            }
        }

        System.out.println("Nhap dia chi: ");
        this.diaChi = sc.nextLine();
    }

    public void xuat() {

        System.out.print("[Ho ten: " + this.hoTen + "][Ngay Sinh: " + this.ngaySinh + "][Dia chi: " + this.diaChi + "]");
    }

    public abstract long tinhLuong();
}
