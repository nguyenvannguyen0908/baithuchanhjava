package baithuchanhlab4.src.Slides;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Set;
//viết chương trình sử dụng phương thức thêm một 
//phần tử vào treeset

public class slide68 {
    public static void main(String[] args) {
        int number;
        TreeSet<Integer> treesetint = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        //thêm các phần tử vào treesetint
        treesetint.add(0);
        treesetint.add(3);
        treesetint.add(1);
        treesetint.add(4);
        treesetint.add(2);
        //hiển thị các phần tử trong treesetint
        System.out.println("Cac phan tu trong treesetint: ");
        System.out.println(treesetint);
        System.out.println("Nhap phan tu can them: ");
        number = sc.nextInt();
        //thêm 1 phần tử mới vào treesetint từ bàn phím
        //nếu phần tử đó đã tồn tại thì khai báo và ngược lại
        if(!treesetint.contains(number)){
            treesetint.add(number);
            System.out.println("Them thanh cong");
            System.out.println("Cac phan tu treesetint sau khi them: ");
            System.out.println(treesetint);
        }else{
            System.out.println("Phan tu -" + number + "- da ton tai!");
        }
    }
}
