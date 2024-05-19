package DoubleLinkedList.Tugas1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Queue queue = new Queue();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Print Queue (Cetak)");
            System.out.println("4. Exit");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nomor Antrian: ");
                    int no = input.nextInt();
                    System.out.print("Nama Penerima: ");
                    String name = input.next();
                    queue.add(name, no);
                    break;
                case 2:
                    queue.remove();
                    break;
                case 3:
                queue.print();
                System.out.println("Sisa antrian: " + queue.getSize());
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
