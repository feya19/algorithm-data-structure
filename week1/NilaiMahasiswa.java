import java.util.Scanner;

public class NilaiMahasiswa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=============================");

        System.out.print("Masukkan nilai tugas: ");
        double nilaiTugas = input.nextDouble();

        System.out.print("Masukkan nilai kuis: ");
        double nilaiKuis = input.nextDouble();

        System.out.print("Masukkan nilai UTS: ");
        double nilaiUts = input.nextDouble();

        System.out.print("Masukkan nilai UAS: ");
        double nilaiUas = input.nextDouble();

        hitungNilaiAkhir(nilaiTugas, nilaiKuis, nilaiUts, nilaiUas);

        input.close();
    }

    static void hitungNilaiAkhir(double nilaiTugas, double nilaiKuis, double nilaiUts, double nilaiUas) {
        for (double nilai : new double[]{nilaiTugas, nilaiKuis, nilaiUts, nilaiUas}) {
            if (nilai < 0 || nilai > 100) {
                System.out.println("=============================");
                System.out.println("Nilai tidak boleh kurang dari 0 atau lebih dari 100!");
                System.exit(0);
            }
        }

        // Jobsheet memberi 40% untuk bobot UAS, namun untuk mencapai 100% UAS harus memiliki bobot 30%
        double nilaiAkhir = (nilaiTugas * 0.2) + (nilaiKuis * 0.2) + (nilaiUts * 0.3) + (nilaiUas * 0.3);

        String nilaiHuruf;
        if (nilaiAkhir > 80) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir > 73) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir > 65) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir > 60) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir > 50) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir > 39) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        String keteranganLulus = nilaiHuruf.equals("D") || nilaiHuruf.equals("E") ? "ANDA TIDAK LULUS" : "SELAMAT ANDA LULUS";
        System.out.println("=============================");
        System.out.printf("Nilai Akhir: %.2f\n", nilaiAkhir);
        System.out.printf("Nilai Huruf: %s\n", nilaiHuruf);
        System.out.println("=============================");
        System.out.println(keteranganLulus);
    }
}
