/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author phamv
 */
public class TestProduct {

    /**
     * @param args the command line arguments
     */
    static void menu() 
    {
        System.out.println("1.Nhập thông tin cho n hàng hóa: ");
        System.out.println("2. Hiển thị thông tin vừa nhập: ");
        System.out.println("3. Tìm ra sản phẩm nào có giá bán cao nhất: ");
        System.out.println("4. Sắp xếp theo thứ tự giảm dần của giá : ");
        System.out.println("5. Tìm trong danh sách hàng hóa có mặt hàng “Sữa” hay không : ");
        System.out.println("6. Thoát : ");
    }
    public static void main(String[] args) 
    {
        ArrayList<Product2> arrlist = new ArrayList<Product2>();
        int n = 0;
        Product2 a = new Product2();
        Product2[] product2 = null;
        do {
            menu();
            System.out.println("Nhap vao lua chon cua ban :");
            Scanner sc = new Scanner(System.in);
            n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1: {
                    int m;
                    System.out.println("Nhap vao n :");
                    m = Integer.parseInt(sc.nextLine());
                    product2 = new Product2[m];
                    for (int i = 0; i < m; i++) {
                    product2[i] = new Product2();
                    product2[i].input();
                    }
                break;
                }
                case 2: 
                {
                    if (product2 == null) 
                    {
                    System.out.println("ban chua nhap du lieu");
                    } 
                    else 
                    {
                        System.out.println("du lieu ban vua nhap la :");
                        for (int i = 0; i < product2.length; i++) 
                        {
                            System.out.println("thong tin hang hoa thu " + (i + 1));
                            product2[i].display();
                        }
                    }
                break;
                }
                case 3: {
                    if (product2 == null) 
                    {
                        System.out.println("ban chua nhap du lieu");
                    }
                    else 
                    {
                        float max = 0;
                        for (Product2 product : arrlist) 
                        {
                            if (max < product.getGia1SP()) 
                            {
                                max = product.getGia1SP();
                            }
                        }
                        System.out.println("Thong tin mat hang co gia cao nhat la :");
                        for (Product2 product : arrlist) 
                        {
                            if (product.getGia1SP() == max) 
                            {
                                product.display();
                            }
                            Collections.sort(arrlist, new Comparator<Product2>() 
                            {
                               @Override
                                public int compare(Product2 pr1, Product2 pr2) 
                                {
                                    if (pr1.getGia1SP() < pr2.getGia1SP()) 
                                    {
                                        return 1;
                                    } 
                                    else 
                                    {
                                        if (pr1.getGia1SP() == pr2.getGia1SP()) 
                                        {
                                            return 0;
                                        } 
                                        else 
                                        {
                                            return -1;
                                        }
                                    }
                                }
                            }      
                        }          
                    }
                break;
                }
                case 4: {
                    if (product2 == null) {
                        System.out.println("ban chua nhap du lieu");
                        } else {
                            a.sort(product2);
                            System.out.println("du lieu sau khi sap xep la :");
                            for (int i = 0; i < product2.length; i++) {
                                System.out.println("thong tin hang hoa thu " + (i + 1));
                                product2[i].display();
                                }
                            }
                break;
                }
                case 5:
                    break;
                    default: {
                        System.out.println("khong co lua chon cua ban ");
                        break;
                    }
                }  
            }
        while (n != 4);
    }                                           
}
                

