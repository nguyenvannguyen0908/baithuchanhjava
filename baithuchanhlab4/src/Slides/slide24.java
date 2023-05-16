package baithuchanhlab4.src.Slides;
import java.util.ArrayList;
import java.util.Scanner;

public class slide24 {
   public static void main(String[] args) {
    ArrayList<Integer> arrList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int number; // phần tử của mảng
    System.out.println("Nhap so phan tu cua ArrayList: ");
    int n = sc.nextInt();
    //nhập và thêm phần tử cho ArrayList
    for(int i=0;i<n;i++){
        System.out.println("Nhap phan tu thu " + i + ": ");
        number = sc.nextInt();
        arrList.add(number);
    }
    //tìm phần tử max trong mảng sử dụng phương thức compareTo()
    //giả sử phần tử lớn nhất là phần tử đầu tiên trong ArrayList
    int max = arrList.get(0);
    for(int i=0;i<arrList.size();i++)
    {
        //nếu kết quả cho phép so sánh lớn hơn 0
        //tức biến max nhỏ hơn phần tử tại vị trí thứ i trong arraylist
        // thì gán max = phần tử tại vị trí thứ i
        // và đó chính là phần tử lớn nhất
        if(arrList.get(i).compareTo(max) > 0)
        {
            max = arrList.get(i);
        }
       
    }
     System.out.println("phan tu lon nhat trong arrList = " + max);
   } 
}
