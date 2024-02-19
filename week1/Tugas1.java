import java.util.Scanner;

public class Tugas1 {
    static final String[] KODE = {
        "A", "B", "D", "E", "F", "G", "H", "L", "N", "T"
    };

    static final String[][] KOTA = {
        {"BANTEN"},
        {"JAKARTA"},
        {"BANDUNG"},
        {"CIREBON"},
        {"BOGOR"},
        {"PEKALONGAN"},
        {"SEMARANG"},
        {"SURABAYA"},
        {"MALANG"},
        {"TEGAL"}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kode plat: ");
        String kodePlat = scanner.nextLine().toUpperCase();

        int indexKota = cariIndexKota(kodePlat);

        if (indexKota != -1) {
            System.out.println("Kota: " + KOTA[indexKota][0]);
        } else {
            System.out.println("Kode plat tidak ditemukan!");
        }
        scanner.close();
    }

    static int cariIndexKota(String kodePlat) {
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i].equals(kodePlat)) {
                return i;
            }
        }
        return -1;
    }
}
