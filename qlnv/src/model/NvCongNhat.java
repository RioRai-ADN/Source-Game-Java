/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;

/**
 *
 * @author Rio.Rai
 */
public class NvCongNhat extends NhanVien{

    private int soNgayCong;
    
    @Override
    public void nhap() {
    
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so ngay cong: ");
        this.soNgayCong = sc.nextInt();
    }

    @Override
    public void xuat() {
        
        super.xuat();
        System.out.print("[So ngay cong: " + this.soNgayCong +"]");
        
    }   
    
    @Override
    public long tinhLuong() {
        return this.soNgayCong*50000;
    }
    
}
