package week2;

public class BukuMain10 {
    public static void main(String[] args) {
        Buku10 bk1 = new Buku10();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku10 bk2 = new Buku10("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku10 bukuFahmiYahya = new Buku10("Self Report", "Fahmi Yahya", 60, 30, 29000);
        bukuFahmiYahya.tampilInformasi();
    }
}
