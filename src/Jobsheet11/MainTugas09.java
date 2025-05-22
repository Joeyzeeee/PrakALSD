package Jobsheet11;

import java.util.Scanner;

public class MainTugas09 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);
        AntrianMahasiswa09 antrian = new AntrianMahasiswa09();

        int pilih;

        do {
            System.out.println("=-=-= Antrian Layanan Unit Kemahasiswaan =-=-=");
            System.out.println("1. Menambah Antrian");
            System.out.println("2. memanggil Antrian");
            System.out.println("3. Lihat Terdepan dan Terakhir");
            System.out.println("4. Lihat Jumlah Antrian");
            System.out.println("5. Lihat Semua Antrian");
            System.out.println("6. Kosongkan Antrian");
            System.out.println("7. Cek Apakah Antrian Kosong");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = input09.nextInt();
            input09.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("Masukkan nama mahasiswa: ");
                    String nama = input09.nextLine();
                    antrian.tambahAntrian(nama);

                    break;

                case 2:
                    antrian.panggilAntrian();
                    break;
                case 3:
                    antrian.tampilkanTerdepanDanTerakhir();
                    break;
                case 4:
                    antrian.tampilkanJumlah();
                    break;
                case 5:
                    antrian.tampilkanSemua();
                    break;
                case 6:
                    antrian.kosongkanAntrian();
                    break;
                case 7:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong.");

                    } else {
                        System.out.println("Antrian masih ada.");
                    }
                    break;

                case 0:
                    System.out.println("Terima kasih.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia dalam list.");
                    break;
            }
        } while (pilih != 0);

        input09.close();

    }
}
