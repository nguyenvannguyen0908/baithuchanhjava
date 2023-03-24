package baithuchanhlab3.src;

import java.util.Scanner;

public class Hinhtron {
        public float r;
        final float pi = 3.14f;
        public float chuvi;
        public float dientich;
        public void nhapbankinh()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap ban kinh: ");
            r = sc.nextFloat();
        }
        public float chuvi()
        {
            chuvi = 2*pi*r;
            return chuvi;
        }
        public float dientich()
        {
            dientich = pi*r*r;
            return dientich;
        }
        public void hienthithongtin()
        {
            System.out.printf("chu vi hinh tron la: %f",chuvi());
            System.out.printf("\ndien tich hinh tron la: %f\n",dientich());
        } 
}