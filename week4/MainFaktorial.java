package week4;

import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----------------");
        System.out.println("Masukkan jumlah elemen: ");

        int jml = sc.nextInt();

        Faktorial[] fk = new Faktorial[10];
        for (int i = 0; i < jml; i++) {
            fk[i] = new Faktorial();
            System.out.println("masukkan nilau data ke-" + (i + 1) + ":");
            fk[i].nilai = sc.nextInt();
        }

        System.out.println("HASIL - BRUTE FORCE");
        for (int i = 0; i < jml; i++) {
            System.out.println("Hasil perhitungan faktorial menggunakan Brute Force adalah "+ fk[i].faktorialBF(fk[i].nilai));
        }
        
        System.out.println("HASIL - DIVIDE ADN CONQUER");
        for (int i = 0; i < jml; i++) {
            System.out.println("Hasil perhitungan faktorial menggunakan Devide and Conquer adalah "+ fk[i].faktorialDC(fk[i].nilai));
        }
    }   
}
