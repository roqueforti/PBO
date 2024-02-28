public class TestKoperasi {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("3573011", "Danny", 5000000);

        System.out.println("Nama Anggota: " + anggota1.getNama());
        System.out.println("Limit pinjaman: " + anggota1.getLimitPinjam());

        System.out.println("\nMeminjam uang 10.000.000");
        anggota1.pinjam(10000000);
        System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlahPinjam());

        System.out.println("\nMeminjam uang 4.000.000");
        anggota1.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlahPinjam());

        System.out.println("\nMeminjam uang 1.000.000");
        anggota1.pinjam(1000000);
        System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlahPinjam());

        System.out.println("\nMeminjam uang 3.000.000");
        anggota1.pinjam(3000000);
        System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlahPinjam());

        anggota1.angsur(500000);
    }
}
