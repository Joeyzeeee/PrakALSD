package Jobsheet3;

import java.util.Scanner;

public class DosenDemo09 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen : ");
        int jumlahDosen = input09.nextInt();
        input09.nextLine();

        Dosen09[] daftarDosen09 = new Dosen09[jumlahDosen];

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));

            System.out.print("Kode Dosen  : ");
            String kode = input09.nextLine();
            System.out.print("Nama Dosen  : ");
            String nama = input09.nextLine();
            System.out.print("Jenis Kelamin (L/P) : ");
            char jk = input09.next().charAt(0);
            boolean jenisKelamin = (jk == 'L' || jk == 'l');

            System.out.print("Usia         : ");
            int usia = input09.nextInt();
            input09.nextLine();

            daftarDosen09[i] = new Dosen09(kode, nama, jenisKelamin, usia);

            System.out.println("-------------------------");
        }

        DataDosen09 dataDosen09 = new DataDosen09();
        dataDosen09.dataSemuaDosen(daftarDosen09);
        dataDosen09.jumlahDosenPerJenisKelamin(daftarDosen09);
        dataDosen09.rerataUsiaDosenPerJenisKelamin(daftarDosen09);
        dataDosen09.infoDosenPalingTua(daftarDosen09);
        dataDosen09.infoDosenPalingMuda(daftarDosen09);

        input09.close();
    }
}
