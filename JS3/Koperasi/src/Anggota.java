public class Anggota {
    private String nomorKtp;
    private String nama;
    private double limitPinjam;
    private double jumlahPinjam;

    public Anggota(String nomorKtp, String nama, double limitPinjam) {
        this.nomorKtp = nomorKtp;
        this.nama = nama;
        this.limitPinjam = limitPinjam;
        this.jumlahPinjam = 0;
    }

    public String getNomorKtp() {
        return nomorKtp;
    }

    public void setNomorKtp(String nomorKtp) {
        this.nomorKtp = nomorKtp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getLimitPinjam() {
        return limitPinjam;
    }

    public void setLimitPinjam(double limitPinjam) {
        this.limitPinjam = limitPinjam;
    }

    public double getJumlahPinjam() {
        return jumlahPinjam;
    }

    public void setJumlahPinjam(double jumlahPinjam) {
        this.jumlahPinjam = jumlahPinjam;
    }

    public void pinjam(double jumlahPinjam) {
        if (jumlahPinjam > limitPinjam) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            this.jumlahPinjam += jumlahPinjam;
        }
    }

    public void angsur(double jumlahAngsur) {
        double minimalAngsuran = 0.1 * this.jumlahPinjam; 
        if (jumlahAngsur < minimalAngsuran) {
            System.out.println("Maaf, angsuran harus minimal 10% dari jumlah pinjaman.");
        } else if (jumlahAngsur > this.jumlahPinjam) {
            System.out.println("Maaf, jumlah angsuran melebihi total pinjaman.");
        } else {
            this.jumlahPinjam -= jumlahAngsur;
        }
    }
}