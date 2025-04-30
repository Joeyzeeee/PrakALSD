package Jobsheet6;

import java.util.ArrayList;

public class DataDosen09 {

    Dosen09[] listDsn;
    int idx = 0;

    public DataDosen09(int jumlah) {
        listDsn = new Dosen09[jumlah];
    }

    void tambah(Dosen09 m) {
        if (idx < listDsn.length) {
            listDsn[idx] = m;
            idx++;
        } else {
            System.out.println("Data penuh");
        }
    }

    void tampil() {
        if (idx == 0) {
            System.out.println("Tidak ada data dosen yang tersimpan.");
            return;
        }

        for (int i = 0; i < idx; i++) {
            listDsn[i].tampil();
        }
    }

    void sortingASC() {
        if (idx <= 1) {
            return;
        }

        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (listDsn[j].usia < listDsn[j - 1].usia) {
                    Dosen09 tmp = listDsn[j];
                    listDsn[j] = listDsn[j - 1];
                    listDsn[j - 1] = tmp;
                }
            }
        }
    }

    void pencarianDataSequential09(String cariNama) {
        ArrayList<Dosen09> hasil = new ArrayList<>();
        for (int i = 0; i < idx; i++) {
            if (listDsn[i].nama.equalsIgnoreCase(cariNama)) {
                hasil.add(listDsn[i]);
            }
        }

        if (hasil.isEmpty()) {
            System.out.println("Dosen dengan nama \"" + cariNama + "\" tidak ditemukan.");
        } else {
            System.out.println("Dosen dengan nama \"" + cariNama + "\" ditemukan:");
            for (Dosen09 dosen : hasil) {
                dosen.tampil();
            }
            if (hasil.size() > 1) {
                System.out.println("⚠ Peringatan: Ditemukan lebih dari satu dosen dengan nama yang sama!");
            }
        }
    }

    int pencarianDataBinary09(int cariUsia, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (listDsn[mid].usia == cariUsia) {
                return mid;
            } else if (listDsn[mid].usia > cariUsia) {
                return pencarianDataBinary09(cariUsia, left, mid - 1);
            } else {
                return pencarianDataBinary09(cariUsia, mid + 1, right);
            }
        }
        return -1;
    }
}
