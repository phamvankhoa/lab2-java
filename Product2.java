/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author phamv
 */
public class Product2 {
    private String mHH;
    private String tHH;
    private float soLuong;
    private float gia1SP;

    public Product2 (String mHH, String tHH, float soLuong, float gia1SP) {
        this.mHH = mHH;
        this.tHH = tHH;
        this.soLuong = soLuong;
        this.gia1SP = gia1SP;
    }
    public Product2 ()
    {
        
    }
    public String getmHH() {
        return mHH;
    }

    public void setmHH(String mHH) {
        this.mHH = mHH;
    }

    public String gettHH() {
        return tHH;
    }

    public void settHH(String tHH) {
        this.tHH = tHH;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public float getGia1SP() {
        return gia1SP;
    }

    public void setGia1SP(float gia1SP) {
        this.gia1SP = gia1SP;
    }  
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma hang hoa: ");
        this.mHH = sc.nextLine();
        System.out.print("Nhap ten hang hoa: ");
        this.tHH = sc.nextLine();
        System.out.print("Nhap so luong: ");
        this.soLuong = sc.nextFloat();
        System.out.print("Nhap gia 1 san pham: ");
        this.gia1SP = sc.nextFloat();
    }
    public void display()
    {
        System.out.print("Nhap ma hang hoa:" +this.getmHH());
        System.out.print("Nhap ten hang hoa:" +this.gettHH());
        System.out.print("Nhap so luong:" +this.getSoLuong());
        System.out.print("Nhap gia 1 san pham:" +this.getGia1SP());
    }
}
