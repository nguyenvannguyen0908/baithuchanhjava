package BaiThucHanhLab2.src;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        int sum = 0;
        String plus = "";
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Nhap mot so nguyen: ");
            int num = sc.nextInt();
            sum += num;
            plus += num + "+";

            if (sum > 100) {
                plus = plus.substring(0, plus.length() - 1);
                plus += "=" + sum;
                System.out.println(plus);
                break;
            }





            
        }
    }
}