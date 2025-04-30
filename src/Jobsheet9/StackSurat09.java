package Jobsheet9;
public class StackSurat09 {
    Surat09[] stack;
    int top;
    int size;

    public StackSurat09(int size) {
        this.size = size;
        stack = new Surat09[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat09 surat) {
        if (!isFull()) {
            stack[++top] = surat;
            System.out.println("Surat berhasil ditambahkan.");
        } else {
            System.out.println("Stack penuh. Tidak bisa menambahkan surat.");
        }
    }

    public Surat09 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong. Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat09 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            return null;
        }
    }

    public boolean cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan:");
                System.out.println("ID: " + stack[i].idSurat);
                System.out.println("Nama: " + stack[i].namaMahasiswa);
                System.out.println("Kelas: " + stack[i].kelas);
                System.out.println("Jenis Izin: " + stack[i].jenisIzin);
                System.out.println("Durasi: " + stack[i].durasi + " hari");
                ditemukan = true;
                break;
            }
        }
        return ditemukan;
    }
}
