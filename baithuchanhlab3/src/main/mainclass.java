package baithuchanhlab3.src.main;
import baithuchanhlab3.src.Shapes.Hinhchunhat;
import baithuchanhlab3.src.Shapes.Hinhtron;
import baithuchanhlab3.src.Shapes.Hinhtru;
import baithuchanhlab3.src.Shapes.Hinhvuong;

public class mainclass {
    public float chuvi;
    public float dientich;
    public float thetich;
    public static void main(String[] args) {
        Hinhtron hinhtron = new Hinhtron();
        
        hinhtron.xuatten();
        hinhtron.setbankinh(4);
         /* float chuvi = hinhtron.tinhchuvi();
        float dientich = hinhtron.tinhdientich();
          
          System.out.println("chu vi: " + chuvi + "\ndien tich: " + dientich);
     */ 
        hinhtron.tinhchuvi();
        hinhtron.tinhdientich();
        
        hinhtron.inchuvi();
        hinhtron.indientich();
     
        Hinhtru hinhtru = new Hinhtru(); 
        hinhtru.xuatten();
        hinhtru.setchieucao(6);
        //float chuvi = hinhtru.tinhchuvi();
        /* float thetich = hinhtru.tinhthetich();
        System.out.println("chu vi: " + chuvi + "\ndien tich: " + dientich + "\nthe tich: " + thetich);
         */
        hinhtru.tinhthetich(); 
        hinhtru.inthetich(); 
       
        Hinhchunhat hinhchunhat = new Hinhchunhat();    
        hinhchunhat.xuatten();
        hinhchunhat.setchieudai(5);
        hinhchunhat.setchieurong(3);
        hinhchunhat.tinhchuvi();
        hinhchunhat.tinhdientich();
        hinhchunhat.inchuvi();
        hinhchunhat.indientich();

        Hinhvuong hinhvuong = new Hinhvuong();
         
        hinhvuong.xuatten();
        hinhvuong.setcanh(6);
        hinhvuong.tinhchuvi();
        hinhvuong.tinhdientich();
        hinhvuong.inchuvi();
        hinhvuong.indientich();

    }
}
