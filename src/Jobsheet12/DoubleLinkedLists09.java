package Jobsheet12;

public class DoubleLinkedLists09 {
    Node09 head;
    Node09 tail;
    int size;

    public DoubleLinkedLists09() {
        head = null;
        tail = null;
        size = 0;

    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa09 data) {
        Node09 newNode09 = new Node09(data);
        if (isEmpty()) {
            head = tail = newNode09;

        } else {
            newNode09.next = head;
            head.prev = newNode09;
            head = newNode09;
        }
        size++;

        System.out.println("Data berhasil ditambahkan di awal.");

    }

    public void addLast(Mahasiswa09 data) {
        Node09 newNode09 = new Node09(data);
        if (isEmpty()) {
            head = tail = newNode09;

        } else {
            tail.next = newNode09;
            newNode09.prev = tail;
            tail = newNode09;
        }
        size++;
        System.out.println("Data berhasil ditambahkan di akhir.");

    }

    public void insertAfter(String keyNim, Mahasiswa09 data) {
        Node09 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;

        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;

        }

        Node09 newNode09 = new Node09(data);

        if (current == tail) {
            current.next = newNode09;
            newNode09.prev = current;
            tail = newNode09;

        } else {
            newNode09.next = current.next;
            newNode09.prev = current;
            current.next.prev = newNode09;
            current.next = newNode09;
        }

        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak ada data untuk ditampilkan.");
            return;
        }
        Node09 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;

        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak dapat dihapus.");
            return;

        }
        System.out.println("Data yang terhapus: ");
        head.data.tampil();

        if (head == tail) {
            head = tail = null;

        } else {
            head = head.next;
            head.prev = null;
        }
        size--;

        System.out.println("Data sudah berhasil dihapus.");
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;

        }
        System.out.println("Data yang terhapus adalah: ");
        tail.data.tampil();

        if (head == tail) {
            head = tail = null;

        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        System.out.println("Data sudah berhasil dihapus.");

    }

    public Node09 search(String nim) {
        Node09 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;

    }

    public void add(int index, Mahasiswa09 data) {
        if (index < 0) {
            System.out.println("Indeks tidak valid.");
            return;
        }

        if (isEmpty() || index == 0) {
            addFirst(data);
            return;
        }

        Node09 current = head;
        int i = 0;

        while (current != null && i < index) {
            current = current.next;
            i++;
        }

        if (current == null) {
            addLast(data);
        } else {
            Node09 newNode = new Node09(data);
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
        }
    }

    public void removeAfter(String keyNim) {
        if (isEmpty()) {
            System.out.println("List kosong. Tidak ada yang bisa dihapus.");
            return;
        }

        Node09 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        if (current.next == null) {
            System.out.println("Tidak ada node setelah NIM " + keyNim + " yang bisa dihapus.");
            return;
        }

        Node09 toDelete = current.next;

        current.next = toDelete.next;
        if (toDelete.next != null) {
            toDelete.next.prev = current;
        } else {

            tail = current;
        }

        System.out.println("Node setelah NIM " + keyNim + " berhasil dihapus:");
        toDelete.data.tampil();
    }

    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("List kosong. Tidak ada yang bisa dihapus.");
            return;
        }

        if (index < 0) {
            System.out.println("Indeks tidak valid.");
            return;
        }

        if (index == 0) {
            System.out.print("Data yang dihapus: ");
            head.data.tampil();
            removeFirst();
            return;
        }

        Node09 current = head;
        int i = 0;

        while (current != null && i < index) {
            current = current.next;
            i++;
        }

        if (current == null) {
            System.out.println("Indeks melebihi panjang list. Tidak ada data yang dihapus.");
            return;
        }

        System.out.print("Data yang dihapus: ");
        current.data.tampil();

        if (current == tail) {
            removeLast();
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    public void getFirst() {
        if (isEmpty()) {
            System.out.println("List kosong. Tidak ada data pertama.");
        } else {
            System.out.println("Data pertama:");
            head.data.tampil();
        }
    }

    public void getLast() {
        if (isEmpty()) {
            System.out.println("List kosong. Tidak ada data terakhir.");
        } else {
            System.out.println("Data terakhir:");
            tail.data.tampil();
        }
    }

    public void getIndex(int index) {
        if (isEmpty()) {
            System.out.println("List kosong. Tidak ada data.");
            return;
        }

        if (index < 0) {
            System.out.println("Indeks tidak valid.");
            return;
        }

        Node09 current = head;
        int i = 0;

        while (current != null && i < index) {
            current = current.next;
            i++;
        }

        if (current == null) {
            System.out.println("Indeks melebihi jumlah node.");
        } else {
            System.out.println("Data pada indeks ke-" + index + ":");
            current.data.tampil();
        }
    }

    public int getSize() {
        return size;
    }

}
