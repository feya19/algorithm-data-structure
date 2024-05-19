package LinkedList.Tugas;

import java.util.Scanner;

public class AntrianLayanan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SingleLinkedList queue = new SingleLinkedList();
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Antrian");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    int nim = scanner.nextInt();
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.next();
                    queue.addLast(nim, nama);
                    System.out.println("Mahasiswa ditambahkan ke antrian.");
                    break;
                case 2:
                    if (!queue.isEmpty()) {
                        System.out.println("Layani mahasiswa dengan " + queue.getFirst());
                        queue.removeFirst();
                    } else {
                        System.out.println("Antrian kosong.");
                    }
                    break;
                case 3:
                    System.out.println("Antrian:");
                    queue.print();
                    break;
                case 4:
                    System.out.println("Program selesai.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang sesuai.");
            }
        }
    }
}

