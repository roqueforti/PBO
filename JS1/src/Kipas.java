public class Kipas {
    public static void main(String[] args) {
        String merk, merk2, merk3, merk4, merk5, warna, warna2, warna3, warna4, warna5, ukuran, ukuran2, ukuran3, ukuran4, ukuran5;
        int kecepatan, kecepatan2, kecepatan3, kecepatan4, kecepatan5;
        boolean swingMode, swingMode2, swingMode3, swingMode4, swingMode5;

        merk = "Maspion1";
        kecepatan = 0;
        warna = "Putih";
        ukuran = "Besar";
        swingMode = true;

        merk2 = "Maspion2";
        kecepatan2 = 0;
        warna2 = "Abu-abu";
        ukuran2 = "Sedang";
        swingMode2 = true;

        merk3 = "Maspion3";
        kecepatan3 = 0;
        warna3 = "Hitam";
        ukuran3 = "Kecil";
        swingMode3 = true;

        merk4 = "Maspion4";
        kecepatan4 = 3;
        warna4 = "Putih";
        ukuran4 = "Besar";
        swingMode4 = true;

        merk5 = "Maspion5";
        kecepatan5 = 3;
        warna5 = "Krem";
        ukuran5 = "Besar";
        swingMode5 = true;

        kecepatan = tambahkecepatan(kecepatan, 1);
        kecepatan2 = tambahkecepatan(kecepatan2, 2);
        kecepatan3 = tambahkecepatan(kecepatan3, 3);
        kecepatan4 = kurangikecepatan(kecepatan4, 1);
        kecepatan5 = kurangikecepatan(kecepatan5, 2);

        swingMode = aturSwing(swingMode);
        swingMode2 = aturSwing(swingMode2);

        tampilkanInfo(merk, warna, ukuran, kecepatan, swingMode);
        tampilkanInfo(merk2, warna2, ukuran2, kecepatan2, swingMode2);
        tampilkanInfo(merk3, warna3, ukuran3, kecepatan3, swingMode3);
        tampilkanInfo(merk4, warna4, ukuran4, kecepatan4, swingMode4);
        tampilkanInfo(merk5, warna5, ukuran5, kecepatan5, swingMode5);

    }

    public static int tambahkecepatan(int kecepatan, int increment) {
        kecepatan += increment;
        return kecepatan;
    }

    public static int kurangikecepatan(int kecepatan, int decrement) {
        kecepatan -= decrement;
        return kecepatan;
    }

    public static void tampilkanInfo(String merk, String warna, String ukuran, int kecepatan, boolean swingMode) {
        System.out.println("Merk: " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Mode Swing: " + swingMode(swingMode));
        System.out.println();
    }

    public static boolean aturSwing(boolean swingMode) {
        return !swingMode;
    }

    public static String swingMode(boolean swingMode) {
        return swingMode ? "ON" : "OFF";
    }
}