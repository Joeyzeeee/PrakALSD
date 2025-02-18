import java.util.Scanner;

public class Tugas2 {

    public static void tampilkanMenu() {
        System.out.println("Pilih perhitungan yang ingin dilakukan:");
        System.out.println("1. Hitung Volume Kubus");
        System.out.println("2. Hitung Luas Permukaan Kubus");
        System.out.println("3. Hitung Keliling Kubus");
        System.out.print("Masukkan pilihan (1-3): ");
    }

    public static double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }

    public static double hitungLuasPermukaan(double sisi) {
        return 6 * sisi * sisi;
    }

    public static double hitungKeliling(double sisi) {
        return 12 * sisi;
    }

    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        tampilkanMenu();
        int pilihan = input09.nextInt();

        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = input09.nextDouble();

        switch (pilihan) {
            case 1:
                double volume = hitungVolume(sisi);
                System.out.printf("Volume kubus adalah: %.2f\n", volume);
                break;
            case 2:
                double luasPermukaan = hitungLuasPermukaan(sisi);
                System.out.printf("Luas permukaan kubus adalah: %.2f\n", luasPermukaan);
                break;
            case 3:
                double keliling = hitungKeliling(sisi);
                System.out.printf("Keliling kubus adalah: %.2f\n", keliling);
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        }

        input09.close();
    }
}
