package baithuchanhlab4.src.Slides;
//hiển thị toàn bộ entry của HashMap

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class slide85 {
    public static void main(String[] args) {
        //khai báo 1 HashMap có tên hashmap
        //kiểu dữ liệu của key và value là String
        HashMap<String,String> hashmap = new HashMap<>();
        //thêm value vào trong hashmap với key tương ứng
        //sử dựng phương thức put()
        //đối số thứ nhất trong put là key có kiểu là string
        //và đối số thứ 2 là value có kiểu là string
        hashmap.put("cslt","co so lap trinh");
        hashmap.put("c++","c++");
        hashmap.put("c#","C sharp");
        hashmap.put("Java","java");
        //tạo 1 set có tên là sethashmap
        //chứa toàn bộ các entry (vừa key,value)
        //của hashmap
        Set<Map.Entry<String,String>> sethashmap = hashmap.entrySet();
        System.out.println("Cac entry co trong sethashmap: ");
        System.out.println(sethashmap);
    }
}
