package Jobsheet11;

public class Mahasiswa09 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa09(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilkanInformasi() {
        System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" + ipk);
    }

}
