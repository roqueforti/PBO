public class Karyawan {
    private String idKaryawan;
    private String nama;

    public Karyawan (String idKaryawan, String nama){
        this.idKaryawan = idKaryawan;
        this.nama = nama;
    }

    public String getIdKaryawan() {
        return idKaryawan;
    }

    public void setIdKaryawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getInfo(){
        return nama + " (" + idKaryawan + ")";
    }
}
