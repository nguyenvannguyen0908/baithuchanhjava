package baithuchanhlab4.src.Slides;
import java.util.LinkedHashSet;
import java.util.Set;

public class slide59 {
    public static void main(String[] args) {
        //init set object
        Set<String> linkedhashset = new LinkedHashSet<String>();
        linkedhashset.add("Java");
        linkedhashset.add("c++");
        linkedhashset.add("Java");
        linkedhashset.add("php");
        //show set
        for(String str : linkedhashset) {
            System.out.println(str);
        }
        
    }
}
