package baithuchanhlab3.src.Shapes;

import java.util.Scanner;

public class Hinhchunhat extends Hinhhoc {
    public float dai;
    public float rong;
    Scanner sc = new Scanner(System.in);
    public Hinhchunhat() {
        ten = "Hinh chu nhat";
    }
    public void nhapchieudai() {
        System.out.println("chieu dai = ");
        
        dai = sc.nextFloat();
    }
    public void nhapchieurong() {
        System.out.println("chieu rong = ");
        rong = sc.nextFloat();
    }
    public void tinhchuvi() {
        chuvi = 2*(dai+rong);
    }
    public void tinhdientich() {
        dientich = dai*rong;
    }
}
