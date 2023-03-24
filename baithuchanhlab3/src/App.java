package baithuchanhlab3.src;

public class App {
    public static void main(String[] args) throws Exception {
        Hinhtron ht = new Hinhtron();
        ht.nhapbankinh();
        ht.hienthithongtin();
        Hinhtrutron ht1 = new Hinhtrutron();
        ht1.nhapthongtin();
        ht1.hienthithongtin();
        Nhanvien nv = new Nhanvien();
        nv.nhapthongtin();
        nv.tinhluong();
        nv.hienthi();
    }
}
