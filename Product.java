/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author phamv
 */
public class Product {

    /**
     * @param args the command line arguments
     */
       
    private String tenHangHoa;
    private String nhaSanXuat;
    private float GiaBan; 
    
    public Product (String tenHangHoa, String nhaSanXuat, float GiaBan) {
        this.tenHangHoa = tenHangHoa;
        this.nhaSanXuat = nhaSanXuat;
        this.GiaBan = GiaBan;
    }
    public Product ()
    {
        
    }
    public String getTenHangHoa() {
        return tenHangHoa;
    }

    public void setTenHangHoa(String tenHangHoa) {
        this.tenHangHoa = tenHangHoa;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public float getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(float GiaBan) {
        this.GiaBan = GiaBan;
    }
    void nhap()
    {
     Scanner sc = new Scanner(System.in);
     System.out.print("Nhap ten hang hoa");
        this.tenHangHoa = sc.nextLine();
        System.out.print("Nha san xuat la:");
        this.nhaSanXuat = sc.nextLine();
        System.out.print("Nhap gia:");
        GiaBan = sc.nextInt();
    }
    void xuat()
    {
        System.out.println("Ten hang hoa :" + this.getTenHangHoa());
        System.out.println("Nha san xuat:"+this.getNhaSanXuat());
        System.out.println("Gia ban:"+this.getGiaBan());
    }
    public void sort(Product[] b)
    {
        for (int i = 0; i < b.length - 1; i++) 
        {
            for (int j = i + 1; j < b.length; j++) 
            {
                if (b[i].GiaBan < b[j].GiaBan) 
                {
                    Product tem = b[i];
                    b[i] = b[j];
                    b[j] = tem;
                }
            }
        }
    }
}


