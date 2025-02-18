package Jobsheet2;

public class MahasiswaMain09 {

    public static void main(String[] args) {
        Mahasiswa09 mhs1 = new Mahasiswa09();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa09 mhs2 = new Mahasiswa09("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa09 mhsDimas = new Mahasiswa09("Dimas Prasetyo", "2412309890", 3.75, "SIB 1D");
        mhsDimas.tampilkanInformasi();

    }

}
