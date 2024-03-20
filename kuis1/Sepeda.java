package kuis1;

public class Sepeda {
    private String namaSepeda;
    private int jumlah;
    private double hargaSewa;
    private int jenisSepeda; // 1 = gunung, 2 = lipat

    public Sepeda(String namaSepeda, int jumlah, double hargaSewa, int jenisSepeda) {
        this.namaSepeda = namaSepeda;
        this.jumlah = jumlah;
        this.hargaSewa = hargaSewa;
        this.jenisSepeda = jenisSepeda;
    }

    public String getNamaSepeda() {
        return namaSepeda;
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

    public String displayJenisSepeda() {
        return jenisSepeda == 1 ? "Gunung" : "Lipat";
    }

    public double hitungBiayaSewa(int lamaSewa) {
        return hargaSewa * lamaSewa;
    }

    public void displayInfo() {
        System.out.println("----------------------------");
        System.out.println("Nama Sepeda: " + getNamaSepeda());
        System.out.println("Jumlah Sepeda: " + getJumlah());
        System.out.println("Jenis Sepeda: " + displayJenisSepeda());
        System.out.println("Harga Sewa: Rp" + getHargaSewa());
    }
}
