package baithuchanhlab4.src.Slides;
import java.util.HashSet;
import java.util.Scanner;
//viết chương trình sử dụng phương thức thêm một phần tử
//vào HashSet

public class slide54 {
    public static void main(String[] args) {
        int number;
        HashSet<Integer> hashsetint = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        
        //thêm các phần tử vào hashsetint
        hashsetint.add(0);
        hashsetint.add(3);
        hashsetint.add(1);
        hashsetint.add(4);
        hashsetint.add(2);
        hashsetint.add(8);
        //hiển thị các phần tử trong hashsetint
        System.out.println("cac phan tu trong hashsetint: ");
        System.out.println(hashsetint);
        System.out.println("Nhap phan tu can them: ");
        number = sc.nextInt();
        //thêm 1 phần tử mới vào hashsetint từ bàn phím
        //nếu phần tử đó đã tồn tại thì thông báo đã tồn tại ngược lại thì thêm vào
        if(!hashsetint.contains(number))
        {
            hashsetint.add(number);
            System.out.println("Them thanh cong");
            System.out.println("Cac phan tu trong hashsetint sau khi them: ");
            System.out.println(hashsetint);
        }else{
            System.out.println("Phan tu-" + number + "-da ton tai!");
        }
    }
}
