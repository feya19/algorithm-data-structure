import java.util.Scanner;

public class MenghitungIPSemester {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=============================");

        String[] namaMatkul = {
            "Bahasa Inggris 1",
            "Critical Thinking dan Problem Solving",
            "Praktikum Dasar Pemrograman",
            "Matematika Dasar",
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Keselamatan dan Kesehatan Kerja",
            "Dasar Pemrograman",
        };

        int[] sksMatkul = {
            2, 2, 3, 3, 2, 2, 2, 2
        };

        double[] nilaiMatkul = new double[namaMatkul.length];
        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.print("Masukkan nilai " + namaMatkul[i] + ": ");
            nilaiMatkul[i] = scanner.nextDouble();
        }
        System.out.println("=============================");
        System.out.println("Hasil Perhitungan Konversi");
        System.out.println("=============================");
        
        System.out.printf("| %2s | %-37s | %3s | %11s | %11s | %5s |\n", "No", "Mata Kuliah", "SKS", "Nilai Angka", "Nilai Huruf", "Bobot");
        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.printf("| %2d | %-37s | %3d | %11.2f | %11s | %5.2f |\n", 
                i + 1, namaMatkul[i], sksMatkul[i], nilaiMatkul[i], getNilaiHuruf(nilaiMatkul[i]), getNilaiBobot(nilaiMatkul[i]));
        }

        double totalSks = 0;
        double totalPoin = 0;
        for (int i = 0; i < namaMatkul.length; i++) {
            totalSks += sksMatkul[i];
            totalPoin += getNilaiBobot(nilaiMatkul[i]) * sksMatkul[i];
        }

        double ipSemester = totalPoin / totalSks;

        System.out.println("========================");
        System.out.printf("IP Semester: %.2f", ipSemester);
        scanner.close();
    }

    static double getNilaiBobot(double nilai) {
        if (nilai > 80) {
            return 4.00;
        } else if (nilai > 73) {
            return 3.50;
        } else if (nilai > 65) {
            return 3.00;
        } else if (nilai > 60) {
            return 2.50;
        } else if (nilai > 50) {
            return 2.00;
        } else if (nilai > 39) {
            return 1.00;
        } else {
            return 0.00;
        }
    }

    static String getNilaiHuruf(double nilai) {
        if (nilai > 80) {
            return "A";
        } else if (nilai > 73) {
            return "B+";
        } else if (nilai > 65) {
            return "B";
        } else if (nilai > 60) {
            return "C+";
        } else if (nilai > 50) {
            return "C";
        } else if (nilai > 39) {
            return "D";
        } else {
            return "E";
        }
    }
}
