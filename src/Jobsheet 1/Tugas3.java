import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = input09.nextInt();
        input09.nextLine();

        String[] namaMatkul = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nMata Kuliah ke-" + (i + 1));
            System.out.print("Nama mata kuliah: ");
            namaMatkul[i] = input09.nextLine();
            System.out.print("Jumlah SKS: ");
            sks[i] = input09.nextInt();
            System.out.print("Semester: ");
            semester[i] = input09.nextInt();
            input09.nextLine();
            System.out.print("Hari kuliah: ");
            hariKuliah[i] = input09.nextLine();
        }

        int pilihan;
        do {
            System.out.println("\n===== Menu Jadwal Kuliah =====");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal berdasarkan hari");
            System.out.println("3. Tampilkan jadwal berdasarkan semester");
            System.out.println("4. Cari mata kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = input09.nextInt();
            input09.nextLine();

            switch (pilihan) {
                case 1:
                    tampilkanSeluruhJadwal(namaMatkul, sks, semester, hariKuliah);
                    break;
                case 2:
                    System.out.print("Masukkan hari yang ingin dilihat: ");
                    String hari = input09.nextLine();
                    tampilkanJadwalBerdasarkanHari(hari, namaMatkul, sks, semester, hariKuliah);
                    break;
                case 3:
                    System.out.print("Masukkan semester yang ingin dilihat: ");
                    int semesterPilihan = input09.nextInt();
                    tampilkanJadwalBerdasarkanSemester(semesterPilihan, namaMatkul, sks, semester, hariKuliah);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah yang dicari: ");
                    String nama = input09.nextLine();
                    cariMataKuliah(nama, namaMatkul, sks, semester, hariKuliah);
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);

        input09.close();
    }

    static void tampilkanSeluruhJadwal(String[] namaMatkul, int[] sks, int[] semester, String[] hariKuliah) {
        System.out.println("\n===== Seluruh Jadwal Kuliah =====");
        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.println("Mata Kuliah: " + namaMatkul[i] +
                    ", SKS: " + sks[i] +
                    ", Semester: " + semester[i] +
                    ", Hari: " + hariKuliah[i]);
        }
    }

    static void tampilkanJadwalBerdasarkanHari(String hari, String[] namaMatkul, int[] sks, int[] semester,
            String[] hariKuliah) {
        System.out.println("\n===== Jadwal Kuliah Hari " + hari + " =====");
        boolean ditemukan = false;
        for (int i = 0; i < hariKuliah.length; i++) {
            if (hariKuliah[i].equalsIgnoreCase(hari)) {
                System.out.println("Mata Kuliah: " + namaMatkul[i] +
                        ", SKS: " + sks[i] +
                        ", Semester: " + semester[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah pada hari " + hari + ".");
        }
    }

    static void tampilkanJadwalBerdasarkanSemester(int semesterPilihan, String[] namaMatkul, int[] sks, int[] semester,
            String[] hariKuliah) {
        System.out.println("\n===== Jadwal Kuliah Semester " + semesterPilihan + " =====");
        boolean ditemukan = false;
        for (int i = 0; i < semester.length; i++) {
            if (semester[i] == semesterPilihan) {
                System.out.println("Mata Kuliah: " + namaMatkul[i] +
                        ", SKS: " + sks[i] +
                        ", Hari: " + hariKuliah[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah pada semester " + semesterPilihan + ".");
        }
    }

    static void cariMataKuliah(String nama, String[] namaMatkul, int[] sks, int[] semester, String[] hariKuliah) {
        System.out.println("\n===== Pencarian Mata Kuliah =====");
        boolean ditemukan = false;
        for (int i = 0; i < namaMatkul.length; i++) {
            if (namaMatkul[i].equalsIgnoreCase(nama)) {
                System.out.println("Mata Kuliah: " + namaMatkul[i] +
                        ", SKS: " + sks[i] +
                        ", Semester: " + semester[i] +
                        ", Hari: " + hariKuliah[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah dengan nama \"" + nama + "\" tidak ditemukan.");
        }
    }
}
