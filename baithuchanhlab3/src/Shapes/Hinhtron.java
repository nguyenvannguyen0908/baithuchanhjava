package baithuchanhlab3.src.Shapes;

import java.util.Scanner;

public class Hinhtron extends Hinhhoc {
    public float bankinh;

    public Hinhtron() {
        ten = "Hinh tron";
    }
    public void nhapbankinh() {
        System.out.println("ban kinh = ");
        Scanner sc = new Scanner(System.in);
        bankinh = sc.nextFloat();
    }
    public void tinhchuvi() {
        chuvi = 2*pi*bankinh;
    }
    public void tinhdientich() {
        dientich = pi*bankinh*bankinh;
    }
}
