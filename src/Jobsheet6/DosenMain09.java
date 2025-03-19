package Jobsheet6;

import java.util.Scanner;

public class DosenMain09 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        DataDosen09 list = new DataDosen09(10);

        int pilihan;
        do {
            System.out.println("-=-=-=-=-= MENU =-=-=-=-=-");
            System.out.println("1) Tambah Data Dosen");
            System.out.println("2) Tampilkan Data Dosen");
            System.out.println("3) Sorting ASC (Termuda - Tertua)");
            System.out.println("4) Sorting DSC (Tertua - Termuda)");
            System.out.println("5) Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = input09.nextInt();
            input09.nextLine();

            switch (pilihan) {
                case 1:
                    if (list.idx < 10) {
                        System.out.println("Masukkan Data Dosen ke-" + (list.idx + 1));
                        System.out.print("Kode Dosen            : ");
                        String kode = input09.nextLine();
                        System.out.print("Nama                  : ");
                        String nama = input09.nextLine();
                        System.out.print("Jenis Kelamin (LK/PR) : ");
                        String jenisKelamin = input09.nextLine();
                        System.out.print("Usia                  : ");
                        int usia = input09.nextInt();
                        input09.nextLine();

                        Dosen09 m = new Dosen09(kode, nama, jenisKelamin, usia);
                        list.tambah(m);
                        System.out.println("Data berhasil ditambahkan!");
                    } else {
                        System.out.println("Kapasitas data penuh! (Maksimal 10 dosen)");
                    }
                    break;

                case 2:
                    if (list.idx == 0) {
                        System.out.println("Belum ada data dosen yang tersimpan!");
                    } else {
                        System.out.println("-=-=-=-=-= Data Dosen =-=-=-=-=-=-");
                        list.tampil();
                    }
                    break;

                case 3:
                    System.out.println("-=-=-=-=-= Sorting ASC (Termuda - Tertua) =-=-=-=-=-");
                    list.sortingASC();
                    list.tampil();
                    break;

                case 4:
                    System.out.println("-=-=-=-= Sorting DSC (Tertua - Termuda) =-=-=-=-=-");
                    list.sortingDSC();
                    list.tampil();
                    break;

                case 5:
                    System.out.println("Keluar dari program");
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih menu yang tersedia.");
            }
        } while (pilihan != 5);

        input09.close();
    }
}
