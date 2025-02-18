import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.println("Program Menampilkan Deretan Bilangan");
        System.out.println("=====================================");

        System.out.print("Masukkan NIM: ");
        long nim = input09.nextLong();

        int n = (int) (nim % 100);

        if (n < 10) {
            n = n + 10;
        }

        System.out.println("=====================");
        System.out.println("n : " + n);

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }

            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }

        System.out.println();
        System.out.println("=====================================");
        input09.close();
    }
}
