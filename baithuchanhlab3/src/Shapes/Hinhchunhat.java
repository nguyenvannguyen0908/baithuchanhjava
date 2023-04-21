package baithuchanhlab3.src.Shapes;

//import java.util.Scanner;

public class Hinhchunhat extends Hinhhoc {
    public float dai;
    public float rong;

    public Hinhchunhat() {
        ten = "Hinh chu nhat";
    }
    
    public float getchieudai() {
        return dai;
    }
    public float getchieurong() {
        return rong;
    }
    public void setchieudai(float dai) {
        this.dai = dai;
    }
    public void setchieurong(float rong) {
        this.rong = rong;
    }
    public float tinhchuvi() {
        return 2*(dai + rong);
    }
    public float tinhdientich() {
        return dai*rong;
    }
    /* 
    Scanner sc = new Scanner(System.in);
   
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
    }*/
}
