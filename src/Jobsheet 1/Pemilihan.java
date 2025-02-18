import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.println("Program Menghitung Nilai Akhir Mahasiswa");
        System.out.println("=====================================");

        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = input09.nextDouble();

        System.out.print("Masukkan Nilai Kuis: ");
        double kuis = input09.nextDouble();

        System.out.print("Masukkan Nilai UTS: ");
        double uts = input09.nextDouble();

        System.out.print("Masukkan Nilai UAS: ");
        double uas = input09.nextDouble();

        System.out.print("=====================================");

        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("\nNilai tidak valid! Harap masukkan nilai antara 0-100.");
        } else {

            double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.4 * uas);

            String nilaiHuruf;
            if (nilaiAkhir > 80) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir > 73) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir > 65) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir > 60) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir > 50) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir > 39) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }

            boolean lulus = nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B")
                    || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C");


            System.out.println("\nNilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai Huruf: " + nilaiHuruf);

            System.out.println("=====================================");

            if (lulus) {
                System.out.println("SELAMAT! Anda LULUS.");
            } else {
                System.out.println("MAAF, Anda TIDAK LULUS.");
            }
        }

    
        input09.close();
    }
}
