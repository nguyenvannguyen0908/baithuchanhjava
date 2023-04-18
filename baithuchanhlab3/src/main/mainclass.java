package baithuchanhlab3.src.main;
import baithuchanhlab3.src.Shapes.Hinhchunhat;
import baithuchanhlab3.src.Shapes.Hinhtron;
import baithuchanhlab3.src.Shapes.Hinhtru;
import baithuchanhlab3.src.Shapes.Hinhvuong;

public class mainclass {
    public static void main(String[] args) {
        Hinhtron hinhtron = new Hinhtron();
        hinhtron.xuatten();
        hinhtron.nhapbankinh();
        hinhtron.tinhchuvi();
        hinhtron.tinhdientich();
        hinhtron.inchuvi();
        hinhtron.indientich();

        Hinhtru hinhtru = new Hinhtru();
        hinhtru.xuatten();
        hinhtru.nhapchieucao();
        hinhtru.tinhthetich();
        hinhtru.inthetich();

        Hinhchunhat hinhchunhat = new Hinhchunhat();
        hinhchunhat.xuatten();
        hinhchunhat.nhapchieudai();
        hinhchunhat.nhapchieurong();
        hinhchunhat.tinhchuvi();
        hinhchunhat.tinhdientich();
        hinhchunhat.inchuvi();
        hinhchunhat.indientich();

        Hinhvuong hinhvuong = new Hinhvuong();
        hinhvuong.xuatten();
        hinhvuong.nhapcanh();
        hinhvuong.tinhchuvi();
        hinhvuong.tinhdientich();
        hinhvuong.inchuvi();
        hinhvuong.indientich();

    }
}
