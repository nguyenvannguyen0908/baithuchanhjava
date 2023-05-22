package baithuchanhlab4.src.Slides;
//viết chương trình xây dựng 1 danh sách liên kết 
//(LinkedList) lưu trữ n số dương 
//(n được nhập từ bàn phím).sau đó tính trung bình
// cộng của số chẵn và hiển thị kết quả ra màn hình

import java.util.LinkedList;
import java.util.Scanner;

public class slide111 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> linkedlist = new LinkedList<>();
        System.out.println("Nhap so luong phan tu: ");
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.printf("Nhap vao phan tu co thu %d: ",i+1);
            int number = sc.nextInt();
            linkedlist.add(number);
        }
        int sum =0;
        int dem=0;
        for(int i=0;i<linkedlist.size();i++){
            if(linkedlist.get(i) % 2 == 0){
                dem++;
                sum += linkedlist.get(i);
            }
        }
        System.out.printf("Trung binh cong cua linkedlist: %.3f ",(float)sum/dem);
}
}
