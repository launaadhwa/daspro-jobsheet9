package PraktikumDaspro.Jobsheet9;

import java.util.Scanner;

public class Tugas216 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar",
            "Kentang Goreng", "Teh Tarik", "Cappucino",
            "Chocolate Ice"
        };

        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        int posisi;
        int total = 0;


        System.out.print("Masukkan nama menu yang ingin dicari: ");
        String cari = input.nextLine();

        posisi = -1;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                posisi = i;
                break;
            }
        }

        if (posisi != -1) {
            System.out.println("Menu ditemukan: " + menu[posisi]);
            System.out.println("Harga: Rp" + harga[posisi]);
        } else {
            System.out.println("Menu " + cari + " tidak tersedia.");
        }

        System.out.print("\nMasukkan jumlah item yang ingin dipesan: ");
        int jumlah = input.nextInt();
        input.nextLine();

        String[] pesanan = new String[jumlah];

        for (int i = 0; i < jumlah; i++) {
            boolean ditemukan = false;

            while (!ditemukan) {
                System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
                String nama = input.nextLine();

                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(nama)) {
                        pesanan[i] = menu[j];
                        total += harga[j];
                        ditemukan = true;
                        break;
                    }
                }

                if (!ditemukan) {
                    System.out.println("Menu tidak tersedia, silakan masukkan kembali.");
                }
            }
        }

        System.out.println("\n===== DAFTAR PESANAN =====");

        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + ". " + pesanan[i]);
        }

        System.out.println("Total biaya: Rp" + total);

        input.close();
    }
}
