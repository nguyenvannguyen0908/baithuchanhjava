package baithuchanh1003.src;

import java.util.Scanner;

public class arr2chieu {
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
            for (int j = i + 1; j < soCot; j++) {
                System.out.printf("A[%d][%d] = ", i, j);
                arrA[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++)
                System.out.print(arrA[i][j] + "\t");
            System.out.print("\n");
        }

    }
}
