import java.time.LocalDate;

public class DemoMinimarket {
    public static void main(String[] args) {
        Karyawan hilman = new Karyawan("111222", "Hilman");
        
        Produk bolpoin = new Produk("1111", "Bolpoin", 10000);

        Pembeli pembeli1 = new Pembeli("A1", "Rahmadi");
        pembeli1.tambahTransaksi(LocalDate.of(2023, 3, 6), hilman, bolpoin);

        System.out.println(pembeli1.getInfo());

        Pembeli pembeli2 = new Pembeli("A2", "Tarwoco");
        System.out.println(pembeli2.getInfo());
    }
}
