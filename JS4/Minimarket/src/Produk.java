public class Produk {
    private String kodeProduk;
    private String nama;
    private double harga;

    public Produk(String kodeProduk, String nama, double harga){
        this.kodeProduk = kodeProduk;
        this.nama = nama;
        this.harga = harga;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getKodeProduk() {
        return kodeProduk;
    }

    public void setKodeProduk(String kodeProduk) {
        this.kodeProduk = kodeProduk;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getInfo(){
        return nama + " (" + harga + ")";
    }
}
