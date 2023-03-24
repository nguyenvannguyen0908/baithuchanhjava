package baithuchanhlab3.src;

import java.util.Scanner;

public class Hinhtrutron {
    public float r;
    final float pi = 3.14f;
    public float h;
    public float chuvi;
    public float dientich;
    public float thetich;
    Scanner sc = new Scanner(System.in);
    public void nhapthongtin()
    {
       
        System.out.println("nhap ban kinh: ");
        r = sc.nextFloat();
        System.out.println("nhap chieu cao: ");
            h = sc.nextFloat();
    }
    public float chuvi()
    {
        chuvi = 2*pi*r*h;
        return chuvi;
    }
    public float dientich()
    {
        dientich = 2*pi*r*(r + h);
        return dientich;
    }
    public float thetich()
    {
        thetich = pi*r*r*h;
        return thetich;
    }
    public void hienthithongtin()
    {
        System.out.printf("chu vi hinh tru tron la: %f\n ",chuvi());
        System.out.printf("chu vi hinh tru tron la: %f\n ",dientich());
        System.out.printf("chu vi hinh tru tron la: %f\n ",thetich());

    }

}
