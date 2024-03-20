package week4;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta, Misal 5.9)");
        System.out.print("Masukkan jumlah perusahaan: ");
        int numCompanies = sc.nextInt();

        Sum[] companies = new Sum[numCompanies];

        for (int j = 0; j < numCompanies; j++) {
            System.out.println("===================================");
            System.out.println("Perusahaan " + (j+1));
            System.out.print("Masukkan jumlah bulan: ");
            int elm = sc.nextInt();

            companies[j] = new Sum(elm);
            System.out.println("===================================");
            for (int i = 0; i < companies[j].elemen; i++) {
                System.out.print("Masukkan untung bulan ke-"+ (i+1) +" = ");
                companies[j].keuntungan[i] = sc.nextDouble();
            }

            System.out.println("===================================");
            System.out.println("Algoritma Brute Force");
            System.out.println("Total keuntungan perusahaan ke-"+ (j+1) +" selama "+ companies[j].elemen +" bulan adalah = "+ companies[j].totalBF(companies[j].keuntungan));
            System.out.println("===================================");
            System.out.println("Algoritma Divide and Conquer");
            System.out.println("Total keuntungan perusahaan ke-"+ (j+1) +" selama "+ companies[j].elemen +" bulan adalah = "+ companies[j].totalDC(companies[j].keuntungan, 0, companies[j].elemen-1));
        }
    }
}
