package Jobsheet2;

public class DosenMain09 {
    public static void main(String[] args) {

        Dosen09 dosen1 = new Dosen09("22112025", "Michael Nunez", true, 2010, "IT Support");
        dosen1.hitungMasaKerja(2025);
        dosen1.ubahKeahlian("Server Controller");
        dosen1.setStatusAktif(true);
        dosen1.tampilInformasi();

        Dosen09 dosen2 = new Dosen09("14141414", "Nia Kurniawati", true, 2020, "Komputer dan Jaringan");
        dosen2.hitungMasaKerja(2025);
        dosen2.setStatusAktif(false);
        dosen2.tampilInformasi();
    }
}