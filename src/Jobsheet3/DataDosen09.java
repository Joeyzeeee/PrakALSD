package Jobsheet3;

public class DataDosen09 {

    public void dataSemuaDosen(Dosen09[] arrayOfDosen) {
        System.out.println("====== DATA SEMUA DOSEN ======");
        for (Dosen09 dosen : arrayOfDosen) {
            dosen.tampilkanInfo();
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen09[] arrayOfDosen) {
        int jumlahPria = 0, jumlahWanita = 0;

        for (Dosen09 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                jumlahPria++;
            } else {
                jumlahWanita++;
            }
        }

        System.out.println("====== JUMLAH DOSEN BERDASARKAN JENIS KELAMIN ======");
        System.out.println("Dosen Pria   : " + jumlahPria);
        System.out.println("Dosen Wanita : " + jumlahWanita);
        System.out.println("-------------------------------------------");
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen09[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;

        for (Dosen09 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                jumlahPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                jumlahWanita++;
            }
        }

        System.out.println("====== RATA-RATA USIA DOSEN BERDASARKAN JENIS KELAMIN ======");
        if (jumlahPria > 0) {
            System.out.println("Rata-rata Usia Dosen Pria   : " + (totalUsiaPria / (double) jumlahPria));
        } else {
            System.out.println("Tidak ada dosen pria.");
        }

        if (jumlahWanita > 0) {
            System.out.println("Rata-rata Usia Dosen Wanita : " + (totalUsiaWanita / (double) jumlahWanita));
        } else {
            System.out.println("Tidak ada dosen wanita.");
        }
        System.out.println("----------------------------------------------------------");
    }

    public void infoDosenPalingTua(Dosen09[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) {
            System.out.println("Tidak ada data dosen.");
            return;
        }

        Dosen09 dosenTertua = arrayOfDosen[0];

        for (Dosen09 dosen : arrayOfDosen) {
            if (dosen.usia > dosenTertua.usia) {
                dosenTertua = dosen;
            }
        }

        System.out.println("====== DOSEN PALING TUA ======");
        dosenTertua.tampilkanInfo();
    }

    public void infoDosenPalingMuda(Dosen09[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) {
            System.out.println("Tidak ada data dosen.");
            return;
        }

        Dosen09 dosenTermuda = arrayOfDosen[0];

        for (Dosen09 dosen : arrayOfDosen) {
            if (dosen.usia < dosenTermuda.usia) {
                dosenTermuda = dosen;
            }
        }

        System.out.println("====== DOSEN PALING MUDA ======");
        dosenTermuda.tampilkanInfo();
    }
}
