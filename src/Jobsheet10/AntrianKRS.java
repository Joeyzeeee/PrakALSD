package Jobsheet10;

public class AntrianKRS {
    Mahasiswa09[] data;
    int front;
    int rear;
    int size;
    int max;
    int totalDilayani;

    public AntrianKRS(int max) {
        this.max = max;
        this.data = new Mahasiswa09[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.totalDilayani = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian telah dikosongkan");
    }

    public void tambahAntrian(Mahasiswa09 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambahkan mahasiswa.");
            return;

        }

        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + "berhasil ditambahkan ke antrian.");

    }

    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Minimal 2 mahasiswa untuk proses KRS.");
            return;

        }
        System.out.println("Memproses 2 mahasiswa:");
        for (int i = 0; i < 2; i++) {
            Mahasiswa09 mhs = data[front];
            mhs.tampilkanData();
            front = (front + 1) % max;
            size--;
            totalDilayani++;
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong.");
            return;

        }
        System.out.println("Daftar Mahasiswa dalam Antrian: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void tampilkanTerdepan() {
        if (size < 2) {
            System.out.println("Belum ada 2 mahasiswa di dalam antrian.");
            return;

        }
        System.out.println("2 Mahasiswa Terdepan: ");
        for (int i = 0; i < 2; i++) {
            int index = (front + i) % max;
            data[index].tampilkanData();
        }
    }

    public void tampilkanAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong.");
            return;

        }
        System.out.println("Mahasiswa paling akhir dalam antrian: ");
        data[rear].tampilkanData();
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getTotalDilayani() {
        return totalDilayani;
    }

    public int getBelumDilayani() {
        return 30 - totalDilayani;
    }

}
