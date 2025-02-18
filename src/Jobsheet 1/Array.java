import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("================================");
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK = input09.nextInt();
        input09.nextLine();
        
        String[] mataKuliah = new String[jumlahMK];
        int[] sks = new int[jumlahMK];
        double[] nilaiAngka = new double[jumlahMK];
        String[] nilaiHuruf = new String[jumlahMK];
        double[] bobotNilai = new double[jumlahMK];
        
        double totalBobotNilai = 0;
        int totalSKS = 0;

        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("Masukkan nama mata kuliah ke-" + (i + 1) + ": ");
            mataKuliah[i] = input09.nextLine();
            
            System.out.print("Masukkan jumlah SKS untuk " + mataKuliah[i] + ": ");
            sks[i] = input09.nextInt();
            
            System.out.print("Masukkan nilai angka untuk " + mataKuliah[i] + ": ");
            nilaiAngka[i] = input09.nextDouble();
            input09.nextLine();
            
            if (nilaiAngka[i] >= 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.0;
            } else if (nilaiAngka[i] >= 73) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilaiAngka[i] >= 65) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.0;
            } else if (nilaiAngka[i] >= 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilaiAngka[i] >= 50) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.0;
            } else if (nilaiAngka[i] >= 39) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0.0;
            }
            
            totalBobotNilai += bobotNilai[i] * sks[i];
            totalSKS += sks[i];
        }

        double ipSemester = totalBobotNilai / totalSKS;

        System.out.println("\n================================");
        System.out.println("Hasil Konversi Nilai:");
        System.out.println("================================");
        System.out.printf("%-20s %-15s %-10s %-15s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        
        for (int i = 0; i < jumlahMK; i++) {
            System.out.printf("%-20s %-15.2f %-10s %-15.2f\n", mataKuliah[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }
        
        System.out.println("================================");
        System.out.printf("IP Semester: %.2f\n", ipSemester);
        input09.close();
    }
}
