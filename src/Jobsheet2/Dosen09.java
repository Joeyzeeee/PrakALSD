package Jobsheet2;

public class Dosen09 {

    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen09() {

    }

    public Dosen09(String id, String nm, boolean statusAktif, int thnGb, String bid) {
        idDosen = id;
        nama = nm;
        this.statusAktif = statusAktif;
        tahunBergabung = thnGb;
        bidangKeahlian = bid;
    }

    void tampilInformasi() {
        System.out.println("ID Dosen : " + idDosen);
        System.out.println("Nama     : " + nama);
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        if (status) {
            System.out.println("Status Aktif : Aktif");
        } else {
            System.out.println("Status Aktif : Tidak Aktif");
        }
    }

    int hitungMasaKerja(int thnSkr) {
        int lamaKerja;
        lamaKerja = thnSkr - tahunBergabung;
        System.out.println("Lama Masa Kerja : " + lamaKerja);
        return lamaKerja;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }

}