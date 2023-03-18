package baithuchanhlab2.src;

import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) throws Exception {
        int length;
        int arrA[];
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap do dai mang : ");
            length = sc.nextInt();
        }while(length <= 0);
        arrA = new int[length];
        
        for(int i = 0; i < length ; i++ ) {
            System.out.printf("A[%d] = ",i);
            arrA[i] = sc.nextInt();
        }
        // sort
       System.out.println("Mang ban dau la:");

        for(int i = 0; i < length; i++) {
            System.out.print(arrA[i] + " ");
            
        }
        System.out.print("\n");
        sc.close();
        int tg; 
        System.out.println("Mang da sap xep tang dan la:");
        for(int i = 0; i < length -1; i++) {
            for(int j = i + 1; j < length; j++) {
                if(arrA[i] > arrA[j]) {
                    tg = arrA[i];
                    arrA[i] = arrA[j];
                    arrA[j] = tg;
                }
            }
            
        }
        for(int i = 0; i < length; i++) {
            System.out.print(arrA[i] + " ");
        }
        

    }
}
