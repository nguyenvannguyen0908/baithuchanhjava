package baithuchanh0303.src;

import java.util.Scanner;

public class Slide47 {
    public static void main(String[] arg){
        int sum = 0, number;
        Scanner sc = new Scanner(System.in);
        do {
           System.out.println("Nhap so nguyen :");
           number=sc.nextInt();
           sum += number;
        }while(sum < 100 );
        System.out.println("Tong =" + sum);

    }
}