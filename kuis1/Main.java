package kuis1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sepeda[] sepeda = {
            new Sepeda("GENEO", 5, 50000, 1),
            new Sepeda("WIMCYCLE", 10, 30000, 2)
        };
        Kamera[] kamera = {
            new Kamera("CANON EOS 500D", 5, 100000, 2),
            new Kamera("CANON EOS M3", 10, 200000, 1)
        };
        Tenda[] tenda = {
            new Tenda("Eiger", 5, 25000, 2),
            new Tenda("Arei", 10, 50000, 1)
        };
        System.out.println("==============================");
        System.out.println("Program Outdoor Rent");
        System.out.println("==============================");
        System.out.println("1. Sepeda");
        System.out.println("2. Tenda");
        System.out.println("3. Kamera");
        System.out.print("Pilih Barang: ");
        int iBarang = sc.nextInt();
        System.out.print("Masukkan lama sewa: ");
        int lamaSewa = sc.nextInt();
        switch (iBarang) {
            case 1:
                System.out.println("====================");
                int i = 1;
                for (Sepeda spd: sepeda) {
                    System.out.println("----------------------------");
                    System.out.println("No. "+ i);
                    spd.displayInfo();
                    i++;
                }
                System.out.println("====================");
                System.out.print("Pilih Sepeda (No): ");
                int inputSepeda = sc.nextInt();
                
                sepeda[inputSepeda-1].displayInfo();
                System.out.println("Total Biaya Sewa: "+ sepeda[inputSepeda-1].hitungBiayaSewa(lamaSewa));
                break;
            case 2:
                System.out.println("====================");
                int j = 1;
                for (Tenda tnd: tenda) {
                    System.out.println("----------------------------");
                    System.out.println("No. "+ j);
                    tnd.displayInfo();
                    j++;
                }
                System.out.println("====================");
                System.out.print("Pilih Tenda (No): ");
                int inputTenda = sc.nextInt();

                kamera[inputTenda-1].displayInfo();
                System.out.println("Total Biaya Sewa: "+ kamera[inputTenda-1].hitungBiayaSewa(lamaSewa));
                break;
            default:
                System.out.println("====================");
                int k = 1;
                for (Kamera kmr: kamera) {
                    System.out.println("----------------------------");
                    System.out.println("No. "+ k);
                    kmr.displayInfo();
                    k++;
                }
                System.out.println("====================");
                System.out.print("Pilih Kamera (No): ");
                int inputKamera = sc.nextInt();

                tenda[inputKamera-1].displayInfo();
                System.out.println("Total Biaya Sewa: "+ tenda[inputKamera-1].hitungBiayaSewa(lamaSewa));
                break;
        }
    }
}