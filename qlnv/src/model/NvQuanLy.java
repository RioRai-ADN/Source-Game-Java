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
public class NvQuanLy extends NhanVien{

    private long luongCoBan;
    private int heSo;

    @Override
    public void nhap() {
        
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap luong co ban: ");
        this.luongCoBan = sc.nextLong();
        
        System.out.println("Nhap he so: ");
        this.heSo = sc.nextInt();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.print("[Luong co ban: "+this.luongCoBan+"][He so: "+this.heSo+"]");
    }
    
    
    @Override
    public long tinhLuong() {
        return luongCoBan*heSo;
    }
    
}
