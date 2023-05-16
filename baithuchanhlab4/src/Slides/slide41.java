package baithuchanhlab4.src.Slides;
import java.util.Scanner;
import java.util.LinkedList;
public class slide41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //khai bao 1 danh sach lien ket
        //lưu trữ các tháng trong năm
        LinkedList<String> linkedlist = new LinkedList<>();
        linkedlist.add("Thang 1");
        linkedlist.add("Thang 2");
        linkedlist.add("Thang 3");
        linkedlist.add("Thang 4");
        linkedlist.add("Thang 5");
        linkedlist.add("Thang 6");
        linkedlist.add("Thang 7");
        linkedlist.add("Thang 8");
        linkedlist.add("Thang 9");
        linkedlist.add("Thang 10");
        linkedlist.add("Thang 11");
        linkedlist.add("Thang 12");

        System.out.println("Nhap vao cac chi so phan tu can lay: ");
        int index = sc.nextInt();
        //kiem tra nếu chỉ số lớn hơn hoặc bằng 0
        //và nhỏ hơn hoặc bằng kích thước của linkedlist-1 thì mới lấy
        //ngược lại thì báo lỗi
        if((index <0) || (index > (linkedlist.size()-1)))
        {
            System.out.println("chỉ so can lay phai lon hon 0 va nho hon " + (linkedlist.size()-1));
        }else{
            //truy cập các phần tử có chỉ số index trong linkedlist
            //vì linkedlist có kiểu là string
            //nên các phần tử con của nó cũng có kiểu dữ liệu là string
            String firstNode = linkedlist.getFirst();
            //truy cập phần tử cuối cùng trong danh sách 
            // sử dụng phương thức getlast
            String lastNode = linkedlist.getLast();
            System.out.println("\nPhan tu dau tien trong danh sach la " + firstNode + " ; Phan tu cuoi cung trong danh sach la " + lastNode);
        }
    }
}
