package Jobsheet11;

public class SLLMain09 {
    public static void main(String[] args) {
        SingleLinkedList09 sll = new SingleLinkedList09();

        Mahasiswa09 mhs2 = new Mahasiswa09("23212201", "Bimon", "2B", 3.8);
        Mahasiswa09 mhs3 = new Mahasiswa09("22212202", "Cintia", "3C", 3.5);

        sll.addFirst(mhs2);
        sll.addFirst(mhs3);

        System.out.println("data index 1 :");
        sll.getData(1);

        System.out.println("data mahasiswa a/n Bimon berada pada index : " + sll.indexOf("Bimon"));
        System.out.println();

        sll.print();

        sll.removeFirst();

        sll.removeLast();

        sll.print();
    }
}
