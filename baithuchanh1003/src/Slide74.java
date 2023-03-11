package baithuchanh1003.src;

import java.util.Scanner;

//Tính tổng các số chẵn của mảng 1 chiều.
public class Slide74 {
    public static void main(String[] arg) {
        int length;
        int arrA[];
    Scanner sc = new Scanner(System.in);
    do{
        System.out.print("Nhap chieu dai cua mang :");
        length = sc.nextInt();
    }while(length <= 0);
         arrA = new int[length];
     for(int i = 0; i < length;i++){
        System.out.printf("A[%d] = ",i);
        arrA[i] = sc.nextInt();
     } 
     sc.close();
      int sum = 0;
         for(int i = 0; i < length; i++) {
            if(arrA[i] % 2 == 0) {
                sum +=arrA[i];
                
        }
    }
            System.out.print("tong cac so chan la : "+ sum);
    
    }
}
