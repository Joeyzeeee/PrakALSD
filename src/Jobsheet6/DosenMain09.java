package Jobsheet6;

import java.util.Scanner;

public class DosenMain09 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = input09.nextInt();
        input09.nextLine();

        DataDosen09 list = new DataDosen09(jumlah);

        int pilihan;
        do {
            System.out.println("\n-=-=-=-=-= MENU =-=-=-=-=-");
            System.out.println("1) Tambah Data Dosen");
            System.out.println("2) Tampilkan Data Dosen");
            System.out.println("3) Sorting ASC (Termuda - Tertua)");
            System.out.println("4) Cari Dosen berdasarkan Nama");
            System.out.println("5) Cari Dosen berdasarkan Usia (Binary Search)");
            System.out.println("6) Keluar");
            System.out.print("Pilih menu (1-6): ");
            pilihan = input09.nextInt();
            input09.nextLine();

            switch (pilihan) {
                case 1:
                    if (list.idx < jumlah) {
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
                        System.out.println("Kapasitas data penuh! (Maksimal " + jumlah + " dosen)");
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
                    System.out.print("Masukkan Nama Dosen yang dicari: ");
                    String cariNama = input09.nextLine();
                    list.pencarianDataSequential09(cariNama);
                    break;

                case 5:
                    if (list.idx == 0) {
                        System.out.println("Data masih kosong, silakan tambah data terlebih dahulu!");
                    } else {
                        System.out.print("Masukkan usia yang dicari: ");
                        int cariUsia = input09.nextInt();
                        input09.nextLine();

                        list.sortingASC();
                        int hasil = list.pencarianDataBinary09(cariUsia, 0, list.idx - 1);

                        if (hasil != -1) {
                            System.out.println("Dosen dengan usia " + cariUsia + " ditemukan:");
                            list.listDsn[hasil].tampil();
                        } else {
                            System.out.println("Dosen dengan usia " + cariUsia + " tidak ditemukan.");
                        }
                    }
                    break;

                case 6:
                    System.out.println("Keluar dari program");
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih menu yang tersedia.");
            }
        } while (pilihan != 6);

        input09.close();
    }
}
