package Jobsheet14;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting09 {
    public static void main(String[] args) {
    
        ArrayList<String> daftarSiswa = new ArrayList<>();
        daftarSiswa.add("Zainab");
        daftarSiswa.add("Andi");
        daftarSiswa.add("Rara");
        Collections.sort(daftarSiswa);
        System.out.println("Daftar String: " + daftarSiswa);

        ArrayList<Siswa> customers = new ArrayList<>();
        customers.add(new Siswa("Zainab"));
        customers.add(new Siswa("Bani"));
        customers.add(new Siswa("Rara"));

        customers.sort((s1, s2) -> s1.name.compareTo(s2.name));

        System.out.println("Daftar Object (Siswa): " + customers);
    }
}
