package baithuchanhlab4.src.Slides;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;



public class Sinhvien {
    public String ten;
    public float diem;
    public static void themsinhvien(List<Sinhvien> list) {
        Scanner sc = new Scanner(System.in);
        String name;
        float score;
        do {
            System.out.println("Nhap vao ten sinh vien: ");
            name = sc.nextLine();
            if(!name.isEmpty()) {
                System.out.println("Nhap diem cua sinh vien: ");
                score = Float.parseFloat(sc.nextLine());
                Sinhvien sv = new Sinhvien();
                sv.diem=score;
                sv.ten=name;
                list.add(sv);
                System.out.println("Successfully!");
            }else{
                break;
            }
        }while(true);

    }
    public static void demsinhvien(List<Sinhvien> list) {
        int dem = 0;
        for(Sinhvien number : list) {
            if(number.diem <= 5) {
                dem++;
                System.out.printf(" Sinh vien : %s - %f diem: Thi lai\n",number.ten,number.diem);
            }
        }
        System.out.println("So sinh vien thi lai :" + dem);
    }
    public static void hienthi(List<Sinhvien> sv) {
        for(int i=0;i<sv.size();i++){
            System.out.printf("Sinh vien: %s - %f diem\n",sv.get(i).ten,sv.get(i).diem);

        }
    }
    public static void maxdiem(List<Sinhvien> list){
        LinkedList<Sinhvien> tg = new LinkedList<>(); 
        float max = 0;
        for(Sinhvien std : list) {
            if(std.diem > max) {
                max = std.diem;
                tg.clear();
                tg.add(std);
            }
        }
        hienthi(tg);
        
    }
    public static void timkiem(List<Sinhvien> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten can tim kiem: ");
        String ten = sc.nextLine();
        for(int i=0;i<list.size();i++) {
            if(list.get(i).ten.equals(ten)) {
                System.out.printf("Sinh vien : %s - %.3f diem\n",list.get(i).ten,list.get(i).diem);
            }
        }
    }
}
