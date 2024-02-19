import java.util.Scanner;

public class DeretBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();
        System.out.println("======================");

        // Casting string to int untuk mendapatkan dua digit terakhir dari NIM
        int n = Integer.parseInt(nim.substring(nim.length() - 2));

        if (n < 10) {
            n += 10;
        }

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }

            System.out.print(i % 2 == 1 ? "* " : i + " ");
        }

        input.close();
    }
}
