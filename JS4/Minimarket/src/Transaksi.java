import java.time.LocalDate;

public class Transaksi {
    private LocalDate tanggal;
    private Karyawan kasir;
    private Produk barang;

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public Karyawan getKasir() {
        return kasir;
    }
    
    public void setKasir(Karyawan kasir) {
        this.kasir = kasir;
    }

    public Produk getBarang() {
        return barang;
    }

    public void setBarang(Produk barang) {
        this.barang = barang;
    }

    public String getInfo() {
        String info = "";
        info += "\tTanggal: " + tanggal;
        info += ", Kasir: " + kasir.getInfo();
        info += ", barang: " + barang.getInfo();
        info += "\n";

        return info;
    }
}
