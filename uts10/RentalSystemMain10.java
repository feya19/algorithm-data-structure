package uts10;

import java.util.Scanner;

public class RentalSystemMain10 {
    public static void main(String[] args) {
        RentalSystem10 rentalSystem10 = new RentalSystem10();

        rentalSystem10.addBarang(new Barang10(1, "Meja", 50, 500000));
        rentalSystem10.addBarang(new Barang10(2, "Kursi", 100, 300000));
        rentalSystem10.addBarang(new Barang10(3, "Tenda", 5, 100000));
        rentalSystem10.addBarang(new Barang10(4, "Karpet", 10, 50000));

        while (true) {
            System.out.println("===== Rental System Menu =====");
            System.out.println("1. Tampilkan Data");
            System.out.println("2. Cari Data");
            System.out.println("3. Exit");
            System.out.println("==============================");

            Scanner scanner10 = new Scanner(System.in);
            System.out.print("Pilih menu: ");
            int choice10 = scanner10.nextInt();

            switch (choice10) {
                case 1:
                    System.out.println("===== Tampikan Data Berdasarkan Nama =====");
                    System.out.println("1. Ascending");
                    System.out.println("2. Descending");
                    System.out.print("Pilih urutan: ");
                    int orderChoice10 = scanner10.nextInt();
                    rentalSystem10.displayDataSort("name", orderChoice10 == 1 ? "ascending" : "descending");
                    break;
                case 2:
                    System.out.println("===== Search Data =====");
                    System.out.print("Masukkan nama barang yang dicari: ");
                    String barangName10 = scanner10.next();
                    Barang10[] searchResult10 = rentalSystem10.search("name", barangName10);
                    if (searchResult10.length > 0) {
                        System.out.println("Barang ditemukan:");
                        for (Barang10 barang10 : searchResult10) {
                            barang10.display();
                        }
                    } else {
                        System.out.println("Barang tidak ditemukan.");
                    }
                    break;
                case 3:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
}
    
