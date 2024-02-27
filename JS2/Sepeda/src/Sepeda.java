import javax.sound.midi.Soundbank;

public class Sepeda {
    float kecepatan;
    int gear;

    public Sepeda(){
        
    }

    public Sepeda(float nowKecepatan, int nowGear){
        kecepatan = nowKecepatan;
        gear = nowGear;
    }

    public void tambahKecepatan(float increment){
        kecepatan += increment;
        if (kecepatan<20){
            kecepatan=20;
        }
    }

    public void kurangiKecepatan(float decrement){
        kecepatan -= decrement;
        if (kecepatan<0){
            kecepatan=0;
        }
    }

    public void cetakInfor(){
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Gear: " + gear);
        System.out.println("====================");
    }
}
