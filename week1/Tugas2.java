import java.util.Scanner;

public class Tugas2 {
    static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            tampilkanMenu();
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    hitungKecepatan();
                    break;
                case 2:
                    hitungJarak();
                    break;
                case 3:
                    hitungWaktu();
                    break;
                case 4:
                    System.out.println("Program berakhir");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
    }

    static void tampilkanMenu() {
        System.out.println("Pilih menu rumus:");
        System.out.println("1. Kecepatan");
        System.out.println("2. Jarak");
        System.out.println("3. Waktu");
        System.out.println("0. Keluar");
        System.out.print("Masukkan pilihan: ");
    }

    static void hitungKecepatan() {
        System.out.print("Masukkan jarak (km): ");
        double jarak = scanner.nextDouble();
        System.out.print("Masukkan waktu (jam): ");
        double waktu = scanner.nextDouble();
        double kecepatan = jarak / waktu;
        System.out.printf("Kecepatan: %.2f km/jam\n", kecepatan);
    }

    static void hitungJarak() {
        System.out.print("Masukkan kecepatan (km/jam): ");
        double kecepatan = scanner.nextDouble();
        System.out.print("Masukkan waktu (jam): ");
        double waktu = scanner.nextDouble();
        double jarak = kecepatan * waktu;
        System.out.printf("Jarak: %.2f km\n", jarak);
    }

    static void hitungWaktu() {
        System.out.print("Masukkan jarak (km): ");
        double jarak = scanner.nextDouble();
        System.out.print("Masukkan kecepatan (km/jam): ");
        double kecepatan = scanner.nextDouble();
        double waktu = jarak / kecepatan;
        System.out.printf("Waktu: %.2f jam\n", waktu);
    }
}
