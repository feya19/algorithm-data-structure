package kuis1;

public class Kamera {
    private String namaKamera;
    private int jumlah;
    private double hargaSewa;
    private int jenisKamera; // 1 = Mirrorless, 2 = DSLR

    public Kamera(String namaKamera, int jumlah, double hargaSewa, int jenisKamera) {
        this.namaKamera = namaKamera;
        this.jumlah = jumlah;
        this.hargaSewa = hargaSewa;
        this.jenisKamera = jenisKamera;
    }

    public String getNamaKamera() {
        return namaKamera;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlahSewa(int jumlah) {
        this.jumlah -= jumlah;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    public String displayJenisKamera() {
        return jenisKamera == 1 ? "Mirrorless" : "DSLR";
    }

    public double hitungBiayaSewa(int lamaSewa) {
        return hargaSewa * lamaSewa;
    }

    public void displayInfo() {
        System.out.println("----------------------------");
        System.out.println("Nama Kamera: " + getNamaKamera());
        System.out.println("Jumlah Kamera: " + getJumlah());
        System.out.println("Jenis Kamera: " + displayJenisKamera());
        System.out.println("Harga Sewa: Rp" + getHargaSewa());
    }
}
