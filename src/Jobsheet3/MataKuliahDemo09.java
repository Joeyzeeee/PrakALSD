package Jobsheet3;

import java.util.Scanner;

public class MataKuliahDemo09 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = Integer.parseInt(input09.nextLine());

        MataKuliah09[] arrayOfMataKuliah09 = new MataKuliah09[jumlahMatkul];

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMataKuliah09[i] = new MataKuliah09();
            arrayOfMataKuliah09[i].tambahData(input09);
        }

        System.out.println("==== DAFTAR MATA KULIAH ====");
        for (int i = 0; i < 3; i++) {
            arrayOfMataKuliah09[i].cetakInfo();
        }

        input09.close();
    }
}
