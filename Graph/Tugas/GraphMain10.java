package Graph.Tugas;

import java.util.Scanner;

public class GraphMain10 {
    public static void main(String[] args) throws Exception {
        Graph10 gdg = new Graph10(6);
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Menu");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Cek Edge");
            System.out.println("6. Update Jarak");
            System.out.println("7. Lihat Jumlah Edge");
            System.out.println("0. Exit");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.println("Penambahan Data");
                    System.out.print("Asal : ");
                    int asal = sc.nextInt();
                    System.out.print("Tujuan : ");
                    int tujuan = sc.nextInt();
                    System.out.print("Jarak : ");
                    int jarak = sc.nextInt();
                    gdg.addEdge(asal, tujuan, jarak);
                    break;
                case 2:
                    System.out.println("Penghapusan Data");
                    System.out.print("Asal : ");
                    int asal1 = sc.nextInt();
                    System.out.print("Tujuan : ");
                    int tujuan1 = sc.nextInt();
                    gdg.removeEdge(asal1, tujuan1);
                    break;
                case 3:
                    System.out.println("Degree");
                    System.out.print("Asal : ");
                    int asal2 = sc.nextInt();
                    gdg.degree(asal2);
                    break;
                case 4:
                    System.out.println("Print Graph");
                    gdg.printGraph();
                    break;
                case 5:
                    System.out.println("Cek Data");
                    System.out.print("Asal   : ");
                    int asal3 = sc.nextInt();
                    System.out.print("Tujuan : ");
                    int tujuan3 = sc.nextInt();
                    gdg.cekEdge(asal3, tujuan3);
                    break;
                case 6:
                    System.out.println("Update Jarak");
                    System.out.print("Asal   : ");
                    int asal4 = sc.nextInt();
                    System.out.print("Tujuan : ");
                    int tujuan4 = sc.nextInt();
                    System.out.print("Jarak : ");
                    int jarak4 = sc.nextInt();
                    gdg.updateJarak(asal4, tujuan4, jarak4);
                    break;
                case 7:
                    System.out.println("Edge ditemukan : " + gdg.totalEdge());
                    break;
                default:
                    System.out.println("Menu tidak ditemukan");
                break;
            }
        } while (pilihan != 0);
        sc.close();
    }
}