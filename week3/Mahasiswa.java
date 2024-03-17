package week3;

public class Mahasiswa {
    private String nama;
    private String nim;
    private char jenisKelamin;
    private double ipk;

    public Mahasiswa(String nama, String nim, char jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    public double getIpk() {
        return ipk;
    }

    public String getDisplayJenisKelamin() {
        return jenisKelamin == 'L' ? "Laki-Laki" : "Perempuan";
    }

    public static double hitungRataRataIPK(Mahasiswa[] mahasiswa) {
        double total = 0;
        for (Mahasiswa mhs : mahasiswa) {
            total += mhs.getIpk();
        }
        return total / mahasiswa.length;
    }

    public static Mahasiswa getMahasiswaIPKTertinggi(Mahasiswa[] mahasiswa) {
        Mahasiswa mhsIPKTinggi = mahasiswa[0];
        for (int i = 1; i < mahasiswa.length; i++) {
            if (mahasiswa[i].getIpk() > mhsIPKTinggi.getIpk()) {
                mhsIPKTinggi = mahasiswa[i];
            }
        }
        return mhsIPKTinggi;
    }
}
