package baithuchanhlab2.src;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] arg) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten cua ban :");
        String yourname = sc.nextLine();
        System.out.println("Nhap tuoi cua ban :");
        a = sc.nextInt();
        if(a < 16){
            System.out.println("ban " + yourname + " o do tuoi vi thanh nien");
        } else if(a >= 16 && a < 18) {
            System.out.println("ban " + yourname + " o do tuoi truong thanh");
        } else {
            System.out.println("ban " + yourname + " da gia");
        }
    }
}
