package Jobsheet6;

import java.util.Scanner;

public class MahasiswaDemo09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah mahasiswa : ");
        int jumlahMahasiswa = sc.nextInt();
        sc.nextLine();

        MahasiswaBerprestasi09 list = new MahasiswaBerprestasi09(jumlahMahasiswa);

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            System.out.println("-----------------------");

            Mahasiswa09 m = new Mahasiswa09(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        // System.out.println("Data mahasiswa sebelum sorting:");
        // list.tampil();

        // System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC)
        // menggunakan Bubble Sort:");
        // list.bubbleSort();
        // list.tampil();

        // System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (ASC)
        // menggunakan Selection Sort:");
        // list.SelectionSort();
        // list.tampil();

        // System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (ASC)
        // menggunakan Insertion Sort:");
        // list.insertionSort();
        // list.tampil();

        list.tampil();
        System.out.println("-----------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-----------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.println("IPK: ");
        double cari = sc.nextDouble();

        // System.out.println("menggunakan sequential searching");
        // double posisi = list.sequentialSearching(cari);
        // int pss = (int) posisi;
        // list.tampilPosisi(cari, pss);
        // list.tampilDataSearch(cari, pss);

        System.out.println("menggunakan binary search");
        double posisi2 = list.findBinarySearch(cari, 0, jumlahMahasiswa - 1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

        sc.close();
    }
}