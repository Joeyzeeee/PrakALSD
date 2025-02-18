package Jobsheet2;

public class MataKuliahMain09 {
    public static void main(String[] args) {
        MataKuliah09 matkul1 = new MataKuliah09("Pengantar Bisnis", "Elisa Felis", 4, 4);
        matkul1.kurangiJam(2);
        matkul1.tampilInformasi();

        MataKuliah09 matkul2 = new MataKuliah09("Hubungan Masyarakat", "Hendrick Munoz", 8, 10);
        matkul2.tambahJam(2);
        matkul2.ubahSKS(6);
        matkul2.tampilInformasi();
    }
}