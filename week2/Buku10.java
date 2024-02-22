package week2;

public class Buku10 {
    String judul, pengarang;
    int halaman, stok, harga;

    public Buku10() {

    }

    public Buku10(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
        }
    }
    
    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    int hitungHargaTotal(int jumlah) {
        return harga * jumlah;
    }

    int hitungDiskon(int hargaTotal) {
        int diskon = 0;
      
        if (hargaTotal > 150000) {
          diskon = hargaTotal * 12 / 100;
        } else if (hargaTotal >= 75000) {
          diskon = hargaTotal * 5 / 100;
        }
      
        return diskon;
    }

    int hitungHargaBayar(int hargaTotal, int diskon) {
        return hargaTotal - diskon;
    }
}
