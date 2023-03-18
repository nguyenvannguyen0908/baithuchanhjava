package BaiThucHanhLab2.src;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] arg) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen a:");
        a = sc.nextInt();
        System.out.print("Nhap so nguyen b:");
        b = sc.nextInt();
        System.out.println("tong hai so la : " + (a + b));
        System.out.println("hieu hai so la : " + (a - b));
        System.out.println("tich hai so la : " + (a * b));
        System.out.println("thuong hai so la : " + (a / b));
        System.out.println("chia lay du hai so la : " + (a % b));
    
    if(a > b) {
        System.out.println("a lon hon b");
    } else 
    if(a == b) {
        System.out.println("a bang b");
    }else {
        System.out.println("a nho hon b");
    }
  }
}