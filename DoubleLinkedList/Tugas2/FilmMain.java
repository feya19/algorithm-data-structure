package DoubleLinkedList.Tugas2;

import java.util.Scanner;

public class FilmMain {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        FilmList filmList = new FilmList();
        int choice;
        do {
            System.out.println("===============================");
            System.out.println("           LIST FILM           ");
            System.out.println("===============================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Terakhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari Id Film");
            System.out.println("9. Urut Data Rating Film Descending");
            System.out.println("10. Keluar");
            System.out.println("===============================");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Id Film\t: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Judul Film\t: ");
                    String judul = sc.nextLine();
                    System.out.print("Rating Film\t: ");
                    double rating = sc.nextFloat();
                    filmList.addFirst(id, judul, rating);
                    break;
                case 2:
                    System.out.print("Id Film\t: ");
                    int id1 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Judul Film\t: ");
                    String judul1 = sc.nextLine();
                    System.out.print("Rating Film\t: ");
                    double rating1 = sc.nextFloat();
                    filmList.addLast(id1, judul1, rating1);
                    break;
                case 3:
                    System.out.print("Masukkan Data Film \nUrutan ke - ");
                    int urut = sc.nextInt();
                    System.out.print("Id Film\t: ");
                    int id2 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Judul Film\t: ");
                    String judul2 = sc.nextLine();
                    System.out.print("Rating Film\t: ");
                    double rating2 = sc.nextFloat();
                    int index = urut - 1;
                    filmList.add(id2, judul2, rating2, index);
                    break;
                case 4:
                    filmList.removeFirst();
                    break;
                case 5:
                    filmList.removeLast();
                    break;
                case 6:
                    System.out.print("Hapus Data Film \nUrutan ke - ");
                    int urut1 = sc.nextInt();
                    int index1 = urut1 - 1;
                    filmList.remove(index1);
                    break;
                case 7:
                    filmList.printList();
                    break;
                case 8:
                    System.out.println("Film yang ingin dicari Bedasarkan ID");
                    System.out.print("ID Film\t: ");
                    int ID = sc.nextInt();
                    Film search = filmList.searchById(ID);
                    if (search != null) {
                        search.print();
                    }
                    break;
                case 9:
                    filmList.sortRatingDescending();
                    break;
                case 10:
                    System.exit(0);
                    break;
                default:
                System.out.println("Input yang dimasukkan salah");
                    break;
            }
        } while (choice != 10);
    }
}
