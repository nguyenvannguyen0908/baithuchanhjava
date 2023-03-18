package baithuchanhlab2.src;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] arg) {
        int n, sum = 0, number;
        float avgnumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai cua day so nguyen : ");
        n = sc.nextInt();
        for(int i = 1; i < n; i++){
            System.out.println("nhap so thu " + i + ":");
            number = sc.nextInt();
            sum += number;
        }
        avgnumber = (float)sum/n;
        System.out.println("Trung binh cong cua day la : " + avgnumber);
    }
}
