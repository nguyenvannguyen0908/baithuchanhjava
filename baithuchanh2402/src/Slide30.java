import java.util.Scanner;

public class Slide30 {
    public static void main(String[] arg) {

        int n, sodu, tong = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n :");
        n = sc.nextInt();
        while (n > 0) {
            sodu = n % 10;
            n /= 10;
            tong += sodu;
        }
        System.out.println("Tong :" + tong);
    }

}