package Jobsheet12;

import java.util.Scanner;

public class DoubleLinkedListsMain09 {

    public static void main(String[] args) {
        DoubleLinkedLists09 list = new DoubleLinkedLists09();
        Scanner scan09 = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Menu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus di awal");
            System.out.println("4. Hapus di akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari Mahasiswa berdasarkan NIM");
            System.out.println("7. Sisipkan Mahasiswa setelah NIM tertentu");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = scan09.nextInt();
            scan09.nextLine();

            switch (pilihan) {
                case 1 -> {
                    Mahasiswa09 mhs = inputMahasiswa09(scan09);
                    list.addFirst(mhs);
                }
                case 2 -> {
                    Mahasiswa09 mhs = inputMahasiswa09(scan09);
                    list.addLast(mhs);
                }
                case 3 -> list.removeFirst();
                case 4 -> list.removeLast();
                case 5 -> list.print();
                case 6 -> {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = scan09.nextLine();
                    Node09 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan:");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                }
                case 7 -> {
                    System.out.print("Masukkan NIM setelah node akan disisipkan: ");
                    String keyNim = scan09.nextLine();
                    Mahasiswa09 mhs = inputMahasiswa09(scan09);
                    list.insertAfter(keyNim, mhs);
                }

                case 0 -> System.out.println("Keluar dari Program.");
                default -> System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);

        scan09.close();
    }

    public static Mahasiswa09 inputMahasiswa09(Scanner scan09) {
        System.out.print("Masukkan NIM: ");
        String nim = scan09.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scan09.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = scan09.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = scan09.nextDouble();
        scan09.nextLine();

        return new Mahasiswa09(nim, nama, kelas, ipk);
    }
}
