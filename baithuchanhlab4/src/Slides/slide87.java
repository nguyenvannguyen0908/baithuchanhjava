package baithuchanhlab4.src.Slides;
//lấy dữ liệu value trong hashmap khi biết key

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class slide87 {
    public static void main(String[] args) {
        HashMap<String,String> hashmapcity = new HashMap<>();
        hashmapcity.put("qng","Quang Ngai");
        hashmapcity.put("qn","Quang Ninh");
        //trong trường hợp này ta thấy
        //key của Quảng Ngãi và Quảng Ninh
        //đêu là qn nên chương trình sẽ thêm
        //vào trong hashmapcity value đứng sau(tức là Quảng Ninh)
        hashmapcity.put("qn","Quang Ninh");
        hashmapcity.put("hcm","thanh pho Ho Chi Minh");
        System.out.println("Danh sach cac thanh pho trong hashmapcity: ");
        Set<Map.Entry<String,String>> setcity = hashmapcity.entrySet();
        System.out.println(setcity);
        //lấy thành phố có mà la qng
        //và hiển thị tên thành phố
        System.out.println("qng: "+hashmapcity.get("qng"));
        //lấy thành phố có mã nt
        //vì trong hashmapcity không có mã nt
        //nên sẽ hiển thị giá trị null
        System.out.println("nt: "+hashmapcity.get("nt"));
        //để kiểm tra xem 1 value có trong hashmap hay không
        //chúng ta sẽ dùng phương thức containsValue()
        if(hashmapcity.containsValue("thanh pho Ho Chi Minh")) {
            System.out.println("Co thanh pho Ho Chi Minh trong hashmapcity!");
        }
    }
}
