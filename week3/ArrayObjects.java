package week3;

import java.util.Scanner;

public class ArrayObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya persegi panjang: ");
        int arrayLength = sc.nextInt();
        PersegiPanjang[] ppArray = new PersegiPanjang[arrayLength];

        ppArray[0] = new PersegiPanjang();
        for (int i = 0; i < arrayLength; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi panjang baris ke-" + i);

            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Persegi Panjang Baris Ke-"+ i);
            System.out.println("Panjang: "+ ppArray[i].panjang + ", Lebar: "+ ppArray[i].lebar);
        }
        sc.close();
    }
}