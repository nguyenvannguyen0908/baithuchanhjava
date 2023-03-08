package baithuchanh2402.src;


import java.util.Scanner;

public class Slide35 {
    public static void main(String[] arg) {
        float a,b,min;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Nhap a :");
            a = sc.nextInt();
            System.out.println("Nhap b :");
            b = sc.nextInt();
        }
        min = a > b ? b : a;
        System.out.println("gia tri nho nhat :" + min);
    }
}
