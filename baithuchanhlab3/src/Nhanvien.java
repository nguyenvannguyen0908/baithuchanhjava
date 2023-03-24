package baithuchanhlab3.src;

import java.util.Scanner;

public class Nhanvien {
    public String hoten;
    public int tuoi;
    public float hesoluong;
    final int luongcoban = 1490000;
    public float luong;
  
    public void nhapthongtin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten nhan vien: ");
        hoten = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        tuoi = sc.nextInt();
        System.out.println("Nhap he so luong: ");
        hesoluong = sc.nextInt();
        sc.close();
    }
   
    public float tinhluong()
    {
        luong = hesoluong * luongcoban;
        return luong;
    }


    public void hienthi()
    {
        System.out.printf("Thong tin nhan vien : %s  - %d",hoten,tuoi);
        System.out.printf("\nLuong nhan duoc:  %f\n",tinhluong());
    }
}
