import java.util.ArrayList;
import java.util.Scanner;
public class Slide22 {
    public static void main(String[] args) {
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number; //phan tu mang;
        System.out.println("Nhap so phan tu cua ArrList: ");
        int n = sc.nextInt();
        // nhap va them phan tu cho mang;
        for(int i=0;i<n;i++){
            System.out.println("nhap phan tu thu " + i + ": ");
            number = sc.nextInt();
            arrListInteger.add(number);
        }
        // tim phan tu lon nhat trong mang sung dung phuong thuc compareTo()
        //gia su phan tu lon nhat la phan tu dau tien trong mang;
        int max = arrListInteger.get(0);
        for(int i=0;i< arrListInteger.size();i++) {
            //neu ket qua cua phep so sanh nay lon hon 0
            //tuc bien max nho hon phan tu tai vi tri thu i trong mang
            //va do chinh la phan tu lon nhat
            if(arrListInteger.get(i).compareTo(max) > 0) {
                max = arrListInteger.get(i);
            }
        }
        System.out.println("phan tu lon nhat trong arrListInteger = " + max);
    }
}
