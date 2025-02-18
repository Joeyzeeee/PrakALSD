public class Fungsi {
    static final int hargaAglonema = 75000;
    static final int hargaKeladi = 50000;
    static final int hargaAlocasia = 60000;
    static final int hargaMawar = 10000;

    static int[][] stok = {
            { 10, 5, 15, 7 }, // RoyalGarden 1
            { 6, 11, 9, 12 }, // RoyalGarden 2
            { 2, 10, 10, 5 }, // RoyalGarden 3
            { 5, 7, 12, 9 } // RoyalGarden 4
    };

    public static void main(String[] args) {

        tampilkanPendapatanPerCabang();

        tampilkanTotalStokPerJenis();

        kurangiStokBunga();

        System.out.println("\nStok terbaru setelah pengurangan bunga mati:");

        tampilkanStok();
    }

    static void tampilkanPendapatanPerCabang() {
        System.out.println("========================================");
        System.out.println("Pendapatan setiap cabang jika semua bunga habis terjual:");
        System.out.println("========================================");
        for (int i = 0; i < stok.length; i++) {
            int pendapatan = (stok[i][0] * hargaAglonema) + (stok[i][1] * hargaKeladi) +
                    (stok[i][2] * hargaAlocasia) + (stok[i][3] * hargaMawar);
            System.out.printf("RoyalGarden %d: Rp %,d\n", (i + 1), pendapatan);
        }
    }

    static void tampilkanTotalStokPerJenis() {
        int totalAglonema = 0;
        int totalKeladi = 0;
        int totalAlocasia = 0;
        int totalMawar = 0;

        for (int i = 3; i < stok.length; i++) {
            totalAglonema += stok[i][0];
            totalKeladi += stok[i][1];
            totalAlocasia += stok[i][2];
            totalMawar += stok[i][3];
        }

        System.out.println();
        System.out.print("========================================");
        System.out.println("\nTotal stok setiap jenis bunga (cabang 4):");
        System.out.println("========================================");
        System.out.printf("%-10s: %d\n", "Aglonema", totalAglonema);
        System.out.printf("%-10s: %d\n", "Keladi", totalKeladi);
        System.out.printf("%-10s: %d\n", "Alocasia", totalAlocasia);
        System.out.printf("%-10s: %d\n", "Mawar", totalMawar);
    }

    static void kurangiStokBunga() {
        System.out.println();
        System.out.print("========================================");
        System.out.println("\nMengurangi stok bunga karena bunga mati");
        System.out.println("========================================");
        for (int i = 3; i < stok.length; i++) {
            stok[i][0] -= 1;
            stok[i][1] -= 2;
            stok[i][2] -= 0;
            stok[i][3] -= 5;

            for (int j = 0; j < stok[i].length; j++) {
                if (stok[i][j] < 0) {
                    stok[i][j] = 0;
                }
            }
        }
    }

    static void tampilkanStok() {
        System.out.printf("%-15s %-10s %-10s %-10s %-10s\n", "Cabang", "Aglonema", "Keladi", "Alocasia", "Mawar");
        for (int i = 0; i < stok.length; i++) {
            System.out.printf("%-15s %-10d %-10d %-10d %-10d\n", "RoyalGarden " + (i + 1), stok[i][0], stok[i][1],
                    stok[i][2], stok[i][3]);
        }
    }

}
