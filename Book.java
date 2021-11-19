/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author phamv
 */
public class Book 
{
    private String bookName;
    private String bookAuthor;
    private String producer;
    private int yearPublishing;
    private float price;

    public Book(String bookName, String bookAuthor, String producer, int yearPublishing, float price) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.producer = producer;
        this.yearPublishing = yearPublishing;
        this.price = price;
    }
    public Book ()
    {
        
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    void input ()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten sach: ");
        this.bookName = sc.nextLine();
        System.out.print("Nhap ten tac gia: ");
        this.bookAuthor = sc.nextLine();
        System.out.print("Nhap ten nguoi san xuat: ");
        this.producer = sc.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        this.yearPublishing = sc.nextInt();
        System.out.print("Nhap gia sach: ");
        this.price = sc.nextFloat();
    }
    void display ()
    {
        System.out.print("Nhap ten sach:" +this.getBookName());
        System.out.print("Nhap ten tac gia:" +this.getBookAuthor());
        System.out.print("Nhap ten nguoi san xuat:" +this.getProducer());
        System.out.print("Nhap nam xuat ban:" +this.getYearPublishing());
        System.out.print("Nhap gia sach:" +this.getPrice());    
    }
}
