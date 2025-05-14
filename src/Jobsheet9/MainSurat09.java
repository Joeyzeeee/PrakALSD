package Jobsheet9;

import java.util.Scanner;

public class MainSurat09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat09 stack = new StackSurat09(100);

        int pilihan;
        do {
            System.out.println("Menu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Terakhir yang Masuk");
            System.out.println("4. Cari Surat Berdasarkan Nama");
            System.out.println("5. Exit");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = Character.toUpperCase(sc.next().charAt(0));
                    System.out.print("Durasi (hari): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();
                    Surat09 surat = new Surat09(id, nama, kelas, jenis, durasi);
                    stack.push(surat);
                    break;

                case 2:
                    Surat09 proses = stack.pop();
                    if (proses != null) {
                        System.out.println("Surat berhasil diproses:");
                        proses.tampilkanInfo();
                    }
                    break;

                case 3:
                    Surat09 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat terakhir yang masuk:");
                        terakhir.tampilkanInfo();
                    } else {
                        System.out.println("Tidak ada surat dalam stack.");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String namaCari = sc.nextLine();
                    boolean ditemukan = stack.cariSurat(namaCari);
                    if (!ditemukan) {
                        System.out.println("Surat tidak ditemukan untuk mahasiswa: " + namaCari);
                    }
                    break;
                case 5:
                    System.out.println("Terima Kasih");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan >= 1 && pilihan <= 5);

        sc.close();
    }
}
