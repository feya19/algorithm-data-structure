import java.util.Scanner;

public class RoyalGarden {
    //index 0 Aglonema
    //index 1 Keladi
    //index 2 Alocasia
    //index 3 Mawar

    static final int[][] STOCK_BUNGA = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9},
    };

    static final double[] HARGA_BUNGA = {
        75000,
        50000,
        60000,
        10000,
    };

    static final int[] PENGURANGAN_CABANG_EMPAT = {
        1,
        2,
        0,
        5,
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        do {
            tampilkanMenu();
            pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1:
                    tampilkanPendapatanCabang();
                    break;
                case 2:
                    tampilkanStockJenisBungaCabangEmpat();
                    break;
                case 3:
                    tampilkanStockBungaCabangEmpatSetelahPengurangan();
                    break;
                case 4:
                    System.out.println("Program berakhir");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 4);
        scanner.close();
    }

    static void tampilkanMenu() {
        System.out.println("\n--- Toko Bunga RoyalGarden ---");
        System.out.println("1. Tampilkan pendapatan setiap cabang");
        System.out.println("2. Tampilkan stock bunga di cabang 4");
        System.out.println("3. Tampilkan stock bunga di cabang 4 setelah pengurangan");
        System.out.println("4. Keluar");
        System.out.print("Masukkan pilihan: ");
    }

    static void tampilkanPendapatanCabang() {
        double[] pendapatanCabang = pendapatanCabang(STOCK_BUNGA, HARGA_BUNGA);
        System.out.println("\nPendapatan setiap cabang:");
        for (int i = 0; i < pendapatanCabang.length; i++) {
            System.out.printf("Cabang %d: Rp%,.2f\n", i + 1, pendapatanCabang[i]);
        }
    }

    static void tampilkanStockJenisBungaCabangEmpat() {
        System.out.println("\nStock bunga di cabang 4");
        for (int i = 0; i < STOCK_BUNGA[3].length; i++) {
            System.out.printf("%s: %d\n", getJenisBunga(i), STOCK_BUNGA[3][i]);
        }
    }

    static void tampilkanStockBungaCabangEmpatSetelahPengurangan() {
        int[][] stockBungaSetelahPengurangan = penguranganStock(STOCK_BUNGA, PENGURANGAN_CABANG_EMPAT);
        System.out.println("\nStock bunga di cabang 4 setelah pengurangan:");
        for (int i = 0; i < stockBungaSetelahPengurangan[0].length; i++) {
            System.out.printf("%s: %d\n", getJenisBunga(i), stockBungaSetelahPengurangan[3][i]);
        }
    }

    static double[] pendapatanCabang(int[][] stockBunga, double[] hargaBunga) {
        double[] pendapatanCabang = new double[stockBunga.length];
        for (int i = 0; i < stockBunga.length; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < stockBunga[i].length; j++) {
                totalPendapatan += stockBunga[i][j] * hargaBunga[j];
            }
            pendapatanCabang[i] = totalPendapatan;
        }
        return pendapatanCabang;
    }

    static int[][] penguranganStock(int[][] stockBunga, int[] pengurangan) {
        for (int i = 0; i < pengurangan.length; i++) {
            stockBunga[3][i] -= pengurangan[i];
        }
        return stockBunga;
    }

    static String getJenisBunga(int jenis) {
        switch (jenis) {
            case 0:
                return "Aglonema";
            case 1:
                return "Keladi";
            case 2:
                return "Alocasia";
            case 3:
                return "Mawar";
            default:
                return "";
        }
    }
}
