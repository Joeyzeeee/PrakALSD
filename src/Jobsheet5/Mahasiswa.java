package Jobsheet5;

public class Mahasiswa {
    String nama;
    String NIM;
    int tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;

    public Mahasiswa(String nama, String NIM, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.NIM = NIM;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    public static void tampilkanTabel(Mahasiswa[] data) {
        System.out.printf("%-10s %-12s %-12s %-10s %-10s\n", "Nama", "NIM", "Tahun Masuk", "Nilai UTS", "Nilai UAS");
        System.out.println("-------------------------------------------------------------");

        for (Mahasiswa m : data) {
            System.out.printf("%-10s %-12s %-12d %-10d %-10d\n",
                    m.nama, m.NIM, m.tahunMasuk, m.nilaiUTS, m.nilaiUAS);
        }
    }

    public static int nilaiMaxUTS(int arr[], int left, int right) {
        if (left == right) {
            return arr[left];
        }
        int mid = (left + right) / 2;
        int leftMax = nilaiMaxUTS(arr, left, mid);
        int rightMax = nilaiMaxUTS(arr, mid + 1, right);
        return Math.max(leftMax, rightMax);
    }

    public static int nilaiMinUTS(int arr[], int left, int right) {
        if (left == right) {
            return arr[left];
        }
        int mid = (left + right) / 2;
        int leftMin = nilaiMinUTS(arr, left, mid);
        int rightMin = nilaiMinUTS(arr, mid + 1, right);
        return Math.min(leftMin, rightMin);
    }

    public static double hitungRataUAS(int arr[]) {
        int total = 0;
        for (int nilai : arr) {
            total += nilai;
        }
        return (double) total / arr.length;
    }
}
