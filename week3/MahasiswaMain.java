package week3;

import java.util.Scanner;

public class MahasiswaMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan jumlah Mahasiswa: ");
        int jumlah = scanner.nextInt();
        scanner.nextLine();

        Mahasiswa[] mahasiswa = new Mahasiswa[jumlah];

        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Jenis Kelamin (L/P): ");
            char jenisKelamin = scanner.nextLine().charAt(0);
            System.out.print("IPK: ");
            double ipk = scanner.nextDouble();
            scanner.nextLine();

            mahasiswa[i] = new Mahasiswa(nama, nim, jenisKelamin, ipk);
        }
        
        int i = 1;
        for (Mahasiswa mhs : mahasiswa) {
            System.out.println("Data Mahasiswa Ke-"+ i);
            System.out.println("Nama: " + mhs.getNama());
            System.out.println("NIM: " + mhs.getNim());
            System.out.println("Jenis Kelamin: " + mhs.getDisplayJenisKelamin());
            System.out.printf("IPK: %.2f\n", mhs.getIpk());
            i++;
        }

        System.out.println("Rata Rata IPK: "+ Mahasiswa.hitungRataRataIPK(mahasiswa));

        Mahasiswa mhsIPKTinggi = Mahasiswa.getMahasiswaIPKTertinggi(mahasiswa);
        System.out.println("Mahasiswa IPK Tertinggi: "+ mhsIPKTinggi.getNama());
    }
}