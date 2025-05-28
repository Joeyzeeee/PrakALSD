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
            System.out.println("8. Tambah data pada indeks tertentu");
            System.out.println("9. Hapus data setelah NIM tertentu");
            System.out.println("10. Hapus data berdasarkan indeks");
            System.out.println("11. Tampilkan data pertama");
            System.out.println("12. Tampilkan data terakhir");
            System.out.println("13. Tampilkan data berdasarkan indeks");
            System.out.println("14. Tampilkan jumlah data");
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
                case 8 -> {
                    System.out.print("Masukkan indeks: ");
                    int index = scan09.nextInt();
                    scan09.nextLine();
                    Mahasiswa09 mhs = inputMahasiswa09(scan09);
                    list.add(index, mhs);
                }

                case 9 -> {
                    System.out.print("Masukkan NIM sebagai titik penghapusan: ");
                    String nimKey = scan09.nextLine();
                    list.removeAfter(nimKey);
                }
                case 10 -> {
                    System.out.print("Masukkan indeks yang ingin dihapus: ");
                    int index = scan09.nextInt();
                    scan09.nextLine();
                    list.remove(index);
                }
                case 11 -> list.getFirst();
                case 12 -> list.getLast();
                case 13 -> {
                    System.out.print("Masukkan indeks: ");
                    int index = scan09.nextInt();
                    scan09.nextLine();
                    list.getIndex(index);
                }
                case 14 -> {
                    System.out.println("Jumlah data dalam list: " + list.getSize());
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
