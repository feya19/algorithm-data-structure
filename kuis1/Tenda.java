package kuis1;

public class Tenda {
    private String namaTenda;
    private int jumlah;
    private double hargaSewa;
    private int jenisTenda; // 1 = Double, 2 = Single

    public Tenda(String namaTenda, int jumlah, double hargaSewa, int jenisTenda) {
        this.namaTenda = namaTenda;
        this.jumlah = jumlah;
        this.hargaSewa = hargaSewa;
        this.jenisTenda = jenisTenda;
    }

    public String getNamaTenda() {
        return namaTenda;
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

    public String displayJenisTenda() {
        return jenisTenda == 1 ? "Double" : "Single";
    }

    public double hitungBiayaSewa(int lamaSewa) {
        return hargaSewa * lamaSewa;
    }

    public void displayInfo() {
        System.out.println("----------------------------");
        System.out.println("Nama Tenda: " + getNamaTenda());
        System.out.println("Jumlah Tenda: " + getJumlah());
        System.out.println("Jenis Tenda: " + displayJenisTenda());
        System.out.println("Harga Sewa: Rp" + getHargaSewa());
    }
}
