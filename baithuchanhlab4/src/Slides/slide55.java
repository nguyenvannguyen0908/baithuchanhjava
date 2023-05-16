package baithuchanhlab4.src.Slides;
import java.util.HashSet;
import java.util.Scanner;
//viết chương trình sử dụng phương thức xóa một phần tử bất kì
//khỏi HashSet
public class slide55 {
    public static void main(String[] args) {
        String name;
        HashSet<String> hashsetString = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        //thêm các phần tử vào hashsetString
        hashsetString.add("Nguyen");
        hashsetString.add("Dung");
        hashsetString.add("Minh");
        hashsetString.add("Dien");
        hashsetString.add("Manh");
        //hiển thị các phần tử trong hashsetString
        System.out.println("Cac phan tu trong hashsetString: ");
        System.out.println(hashsetString);
        System.out.println("Nhap phan tu can xoa: ");
        name = sc.nextLine();
        //nếu phần tử cần xóa có tồn tại trong hashsetString thì báo xóa thành công
        //và hiển thị các phần tử còn lại ngược lại...
        if(hashsetString.contains(name))
        {
            hashsetString.remove(name);
            System.out.println("Xoa thanh cong");
            System.out.println("Cac phan tu con lai sau khi xoa: ");
            System.out.println(hashsetString);
        }else{
            System.out.println("xoa khong thanh cong!");
        }
    }
}
