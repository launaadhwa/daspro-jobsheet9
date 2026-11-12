package PraktikumDaspro.Jobsheet9;

import java.util.Scanner;

public class Tugas116 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah;
        int total = 0;
        int tertinggi;
        int terendah;
        double rataRata;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlah = input.nextInt();

        if (jumlah <= 0) {
            System.out.println("Jumlah mahasiswa harus lebih dari 0.");
            input.close();
            return;
        }

        int[] nilai = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();

            total += nilai[i];
        }

        tertinggi = nilai[0];
        terendah = nilai[0];

        for (int i = 1; i < jumlah; i++) {
            if (nilai[i] > tertinggi) tertinggi = nilai[i];
            if (nilai[i] < terendah) terendah = nilai[i];
        }

        rataRata = (double) total / jumlah;

        System.out.println("\n===== HASIL PENGELOLAAN NILAI =====");
        System.out.println("Rata-rata nilai: " + rataRata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

        System.out.println("\nDaftar Nilai Mahasiswa:");

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Mahasiswa ke-" + (i + 1));
            System.out.print(" = " + nilai[i]);

            if (nilai[i] >= 70) {
                System.out.println(" (LULUS)");
            } else {
                System.out.println(" (TIDAK LULUS)");
            }
        }

        input.close();
    }
}
