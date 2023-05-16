package baithuchanhlab4.src.Slides;
import java.util.LinkedList;
public class slide38 {
    public static void main(String[] args) {
        //khai báo 1 linkedlist có tên là list
        //có kiểu dữ liệu là String
        LinkedList<String> list = new LinkedList<String>();
        //add object to list
        list.add("java");
        list.add("c++");
        list.add("php");
        list.add("java");

        System.out.println("vi du su dung phuong thuc addAll()");
        System.out.println("---------------------------------");
        //thêm các phần tử của list vào listA
        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(list);
        System.out.println("listA: ");
        showList(listA);
        System.out.println("\nVi du su dung phuong thuc retainAll()");
        System.out.println("---------------------------------");
        //khởi tạo listB
        LinkedList<String> listB = new LinkedList<String>();
        listB.add("java");
        //xóa những phần tử không thuộc listB khỏi listA
        listA.retainAll(listB);
        System.out.println("ListA: ");
        showList(listA);
        System.out.println("\nvi du su dung phuong thuc removeAll()");
        System.out.println("------------------------------------------");
        //xoa nhung phan tu thuoc listB ra khoi list
        list.removeAll(listB);
        System.out.println("list: ");
        showList(list);

    }
    public static void showList(LinkedList<String> list)
    {
        //show list through for-each
        for(String obj : list)
        {
            System.out.println(" " + obj + "' ");
        }
        System.out.println();
    }
}
