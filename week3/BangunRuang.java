package week3;

import java.util.Scanner;

public class BangunRuang {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih Menu:");
        System.out.println("1. Kerucut");
        System.out.println("2. Limas Segiempat Sama Sisi");
        System.out.println("3. Bola");
        int menu = scanner.nextInt();
        System.out.print("Masukan jumlah bangun ruang: ");
        int count = scanner.nextInt();

        switch (menu) {
            case 1:
                kerucut(scanner, count);
                break;
            case 2:
                limasSegiEmpatSamaSisi(scanner, count);
                break;
            case 3:
                bola(scanner, count);
                break;
            default:
                break;
        }

        scanner.close();
    }

    public static void kerucut(Scanner scanner, int count) {
        Kerucut[] bangunRuang = new Kerucut[count];

        for (int i = 0; i < count; i++) {
            String namaBangunRuang = "Kerucut "+ (i + 1);
            System.out.println(namaBangunRuang);
            System.out.print("Masukkan jari-jari: ");
            double jariJari = scanner.nextDouble();
            System.out.print("Masukkan tinggi: ");
            double tinggi = scanner.nextDouble();
            scanner.nextLine();
            bangunRuang[i] = new Kerucut(jariJari, tinggi);
            double luasPermukaan = bangunRuang[i].getLuasPermukaan();
            double volume = bangunRuang[i].getVolume();

            displayData(luasPermukaan, volume);
        }
    }

    public static void limasSegiEmpatSamaSisi(Scanner scanner, int count) {
        LimasSegiEmpatSamaSisi[] bangunRuang = new LimasSegiEmpatSamaSisi[count];

        for (int i = 0; i < count; i++) {
            String namaBangunRuang = "Limas Segi Empat Sama Sisi " + (i + 1);
            System.out.println(namaBangunRuang);
            System.out.print("Masukkan panjang sisi alas: ");
            double sisiAlas = scanner.nextDouble();
            System.out.print("Masukkan tinggi limas: ");
            double tinggi = scanner.nextDouble();
            scanner.nextLine();
            bangunRuang[i] = new LimasSegiEmpatSamaSisi(sisiAlas, tinggi);
            double luasPermukaan = bangunRuang[i].getLuasPermukaan();
            double volume = bangunRuang[i].getVolume();

            displayData(luasPermukaan, volume);
        }
    }

    public static void bola(Scanner scanner, int count) {
        Bola[] bangunRuang = new Bola[count];

        for (int i = 0; i < count; i++) {
            String namaBangunRuang = "Bola " + (i + 1);
            System.out.println(namaBangunRuang);
            System.out.print("Masukkan jari-jari: ");
            double jariJari = scanner.nextDouble();
            scanner.nextLine();
            bangunRuang[i] = new Bola(jariJari);
            double luasPermukaan = bangunRuang[i].getLuasPermukaan();
            double volume = bangunRuang[i].getVolume();

            displayData(luasPermukaan, volume);
        }
    }

    private static void displayData(double luasPermukaan, double volume) {
        System.out.println("-----------------");
        System.out.println("Luas Permukaan: "+ luasPermukaan);
        System.out.println("Volume: "+ volume);
        System.out.println("-----------------");
    }
}