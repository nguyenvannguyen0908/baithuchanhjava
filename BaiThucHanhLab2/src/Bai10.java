package baithuchanhlab2.src;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] arg) {
        int solanxuathien = 0;
        String chuoi;
        char kytu;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap chuoi : ");
            chuoi = sc.nextLine();
        } while (chuoi.length() > 80);
        System.out.println("Nhap ky tu can dem :");
        kytu = sc.next().charAt(0);
        for (int i = 0; i < chuoi.length(); i++) {
            if (kytu == chuoi.charAt(i))
                solanxuathien++;
        }
        System.out.println("So lan xuat hien ky tu " + kytu + " trong chuoi " + chuoi + "la : " + solanxuathien);
    }
}
