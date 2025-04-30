package Jobsheet9;

import java.util.Scanner;

public class MahasiswaDemo09 {

    public static void main(String[] args) {
        StackTugasMahasiswa09 stack = new StackTugasMahasiswa09(5);
        Scanner input09 = new Scanner(System.in);

        int pilih;
        do {
            System.out.println("Menu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");
            System.out.println("6. Jumlah Tugas yang Sudah Dikumpulkan");
            System.out.print("Pilih: ");
            pilih = input09.nextInt();
            input09.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = input09.nextLine();
                    System.out.print("NIM: ");
                    String nim = input09.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = input09.nextLine();
                    Mahasiswa09 mhs = new Mahasiswa09(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan", mhs.nama);
                    System.out.println("");
                    break;
                case 2:
                    Mahasiswa09 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = input09.nextInt();
                        input09.nextLine();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("NIlai Biner Tugas: " + biner);
                    }
                    break;
                case 3:
                    Mahasiswa09 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas:");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 5:
                    Mahasiswa09 terbawah = stack.peekBottom();
                    if (terbawah != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + terbawah.nama);
                    }
                    break;
                case 6:
                    int jumlah = stack.jumlahTugas();
                    System.out.println("Jumlah tugas yang sudah dikumpulkan: " + jumlah);
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 6);

        input09.close();

    }

}
