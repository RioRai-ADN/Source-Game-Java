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
public class NvSanXuat extends NhanVien{

    private int soSanPham;
    
    @Override
    public void nhap() {
        
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap so san sam:");
        this.soSanPham = sc.nextInt();
    }
    
    @Override
    public void xuat() {
        
        super.xuat();
        System.out.print("[So San pham: " + this.soSanPham + "]");
    }
    @Override
    public long tinhLuong() {
        return soSanPham*20000;
    }
    
    
}
