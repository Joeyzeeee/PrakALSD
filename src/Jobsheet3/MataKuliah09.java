package Jobsheet3;

import java.util.Scanner;

public class MataKuliah09 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah09() {

    }

    public MataKuliah09(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tambahData(Scanner input09) {
        System.out.print("Kode       : ");
        this.kode = input09.nextLine();
        System.out.print("Nama       : ");
        this.nama = input09.nextLine();
        System.out.print("SKS        : ");
        this.sks = Integer.parseInt(input09.nextLine());
        System.out.print("Jumlah Jam : ");
        this.jumlahJam = Integer.parseInt(input09.nextLine());
        System.out.println("--------------------");
    }

    public void cetakInfo() {
        System.out.println("Kode        : " + kode);
        System.out.println("Nama        : " + nama);
        System.out.println("SKS         : " + sks);
        System.out.println("Jumlah jam  : " + jumlahJam);
        System.out.println("--------------------------");
    }

}
