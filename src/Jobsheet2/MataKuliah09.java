package Jobsheet2;

public class MataKuliah09 {

    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah09() {

    }

    public MataKuliah09(String mk, String nm, int sksBaru, int jmlJam) {
        kodeMK = mk;
        nama = nm;
        sks = sksBaru;
        jumlahJam = jmlJam;
    }

    void tampilInformasi() {
        System.out.println("Kode Mata Kuliah : " + kodeMK);
        System.out.println("Nama : " + nama);
        System.out.println("Jumlah SKS : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS anda sudah diupdate! Jumlah SKS : " + sks);
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam anda : " + jumlahJam);
    }

    void kurangiJam(int jam) {
        if ((jumlahJam - jam) > 0) {
            jumlahJam -= jam;
            System.out.println("Jumlah jam anda : " + jumlahJam);
        } else {
            System.out.println("Maaf pengurangan jam tidak dapat diproses!");
        }
    }

}