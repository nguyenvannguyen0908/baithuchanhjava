package baithuchanhlab3.src.Shapes;

import java.util.Scanner;

public class Hinhtru extends Hinhtron {
    public float chieucao;
    public Hinhtru() {
        ten = "Hinh tru";
    }
    public void nhapchieucao() {
        nhapbankinh();
        System.out.println("chieu cao = ");
        Scanner sc = new Scanner(System.in);
        chieucao = sc.nextFloat();
    }
    public void tinhthetich() {
        tinhdientich();
        thetich = dientich*chieucao;
    }
}
