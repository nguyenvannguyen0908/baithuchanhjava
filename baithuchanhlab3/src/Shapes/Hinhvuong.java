package baithuchanhlab3.src.Shapes;

import java.util.Scanner;

public class Hinhvuong extends Hinhchunhat {
    public Hinhvuong() {
        ten = "hinh vuong";
    }
    public void nhapcanh() {
        System.out.println("canh = ");
        Scanner sc = new Scanner(System.in);
        dai = rong = sc.nextFloat();
    }
}
