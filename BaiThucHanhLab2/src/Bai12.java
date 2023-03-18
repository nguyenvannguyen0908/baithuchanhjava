package baithuchanhlab2.src;

import java.util.Scanner;

public class Bai12 {
    public static void main(String[] arg) {
            int soDong;
            int soCot;
            Scanner sc = new Scanner(System.in);
            do {
                System.out.print("Nhap so dong :");
                soDong = sc.nextInt();
                System.out.print("Nhap so cot :");
                soCot = sc.nextInt();
            } while (soDong < 0 || soCot < 0);
            int arrA[][];
            arrA = new int[soDong][soCot];
            for (int i = 0; i < soDong; i++) {
                for (int j = 0; j < soCot; j++) {
                    System.out.printf("A[%d][%d] = ", i, j);
                    arrA[i][j] = sc.nextInt();
    
                }
            }
    
    
            for (int i = 0; i < soDong; i++) {
                for (int j = 0; j < soCot; j++)
                    System.out.print(arrA[i][j] + "\t");
                    System.out.print("\n");
            }
            int max = arrA[0][0];
         
             for (int i = 0; i < soDong; i++) {
                for (int j = 0; j < soCot; j++) {
                    if (max < arrA[i][j]) {
                        max = arrA[i][j];
            }
        }
    }
        
    System.out.println("Phan tu lon nhat trong ma tran la: " + max);
}
}