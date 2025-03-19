package Jobsheet6;

public class Dosen09 {

    String kode;
    String nama;
    String jenisKelamin;
    int usia;

    Dosen09(String kd, String name, String jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil() {
        System.out.println("Kode           : " + kode);
        System.out.println("Nama           : " + nama);
        System.out.println("Jenis Kelamin (LK/PR): " + (jenisKelamin.equalsIgnoreCase("LK") ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia           : " + usia);
        System.out.println("---------------------------");

    }
}
