package Jobsheet11;

public class AntrianMahasiswa09 {
    Node09 front;
    Node09 rear;
    int jumlah;

    public AntrianMahasiswa09() {
        front = null;
        rear = null;
        jumlah = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void tambahAntrian(String nama) {
        Node09 baru = new Node09(nama);

        if (rear == null) {
            front = baru;
            rear = baru;

        } else {
            rear.next = baru;
            rear = baru;
        }

        jumlah++;
        System.out.println(nama + " masuk ke dalam antrian.");
    }

    public void panggilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang bisa dipanggil.");

        } else {
            System.out.println("memanggil: " + front.nama);
            front = front.next;

            if (front == null) {
                rear = null;

            }

            jumlah--;
        }
    }

    public void tampilkanTerdepanDanTerakhir() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong.");

        } else {
            System.out.println("Mahasiswa di depan: " + front.nama);
            System.out.println("Mahasiswa di belakang: " + rear.nama);

        }
    }

    public void tampilkanJumlah() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + jumlah);
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong.");

        } else {
            System.out.println("Daftar mahasiswa dalam antrian:");
            Node09 bantu = front;
            int nomor = 1;
            while (bantu != null) {
                System.out.println(nomor + ". " + bantu.nama);
                bantu = bantu.next;
                nomor++;

            }
        }
    }

    public void kosongkanAntrian() {
        front = null;
        rear = null;
        jumlah = 0;
        System.out.println("Antrian sudah dikosongkan.");
    }

}
