import java.time.LocalDate;
import java.util.ArrayList;

public class Pembeli {
    private String idPembeli;
    private String nama;
    private ArrayList<Transaksi> riwayatTransaksi;

    public Pembeli(String idPembeli, String nama){
        this.idPembeli = idPembeli;
        this.nama = nama;
        this.riwayatTransaksi = new ArrayList<Transaksi>();
    }

    public void setIdPembeli(String idPembeli) {
        this.idPembeli = idPembeli;
    }

    public String getIdPembeli() {
        return idPembeli;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
    
    public String getInfo(){
        String info = "";
        info += "ID Pelanggan     : " + this.idPembeli + "\n";
        info += "Nama             : " + this.nama + "\n";

        if (!riwayatTransaksi.isEmpty()){
            info += "Riwayat transaksi :\n";

            for(Transaksi transaksi : riwayatTransaksi){
                info += transaksi.getInfo();
            }
        } else {
            info += "Belum ada riwayat transaksi";
        }

        info += "\n";

        return info;
    }

    public void tambahTransaksi (LocalDate tanggal, Karyawan kasir, Produk barang){
        Transaksi transaksi = new Transaksi();
        transaksi.setTanggal(tanggal);
        transaksi.setKasir(kasir);
        transaksi.setBarang(barang);
        riwayatTransaksi.add(transaksi);
    }
}
