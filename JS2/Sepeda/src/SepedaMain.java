public class SepedaMain {
    public static void main(String[] args) {
        Sepeda sepeda1 = new Sepeda(5, 1);
        sepeda1.tambahKecepatan(3);
        sepeda1.cetakInfor();

        Sepeda sepeda2 = new Sepeda(0,0);
        sepeda2.kecepatan=7;
        sepeda2.gear=1;
        sepeda2.cetakInfor();
    }
}
